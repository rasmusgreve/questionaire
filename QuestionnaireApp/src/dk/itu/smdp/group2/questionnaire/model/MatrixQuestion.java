package dk.itu.smdp.group2.questionnaire.model;

import dk.itu.smdp.group2.R;
import dk.itu.smdp.group2.questionnaire.utilities.GRadioGroup;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * A Question where the respondent chooses answers for several rows with
 * a number of identical choices for them all.
 * 
 * @author Emil
 *
 */
public class MatrixQuestion extends Question{
	
	private int max;
	private String[] columns;
	private String[] rows;
	
	private CompoundButton[][] matrix;
	private int[] checked = null;
	
	// results
	private View root;

	/**
	 * Initializes the MatrixQuestion with the given parameters. It is necessary
	 * to add the rows and set the columns afterwards for complete and correct
	 * behavior.
	 * 
	 * @param question The question to answer.
	 * @param desc The more detailed description to the question if necessary.
	 * Null or empty string will be seen as no description.
	 * @param mandatory True if the Question should be marked as mandatory for the
	 * Questionnaire to be complete.
	 * @param maxPerRow The maximum number of selections per row (inclusive).
	 */
	public MatrixQuestion(String question, String description, boolean mandatory, int maxPerRow){
		super(question,description,mandatory);
		max = maxPerRow;
	}

	@Override
	public View generateView() {
		// inflate and fetch objects
		root = this.getParent().getActivity().getLayoutInflater().inflate(R.layout.question_matrix, null);
		TextView title = (TextView) root.findViewById(R.id.tvMatrixTitle);
		TextView desc = (TextView) root.findViewById(R.id.tvMatrixDesc);
		TextView select = (TextView) root.findViewById(R.id.tvMatrixSelec);
		TableLayout tablelayout = (TableLayout) root.findViewById(R.id.tlMatrix);
		
		// set values
		title.setText(this.getQuestionText());
		desc.setText(this.getDescription());
		if(getDescription() == null || getDescription().length() == 0) desc.setVisibility(View.GONE);
		
		// guide text
		if(max == 1){ // radio
			select.setVisibility(View.GONE);
		}else{ // checkbox
			select.setText("Select up to "+max+" options per line");
		}
		
		// create grid titles
		createMatrix(tablelayout);
		
		return root;
	}

	private void createMatrix(TableLayout tablelayout) {
		tablelayout.setStretchAllColumns(true);
		
		TableRow.LayoutParams rowParams = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT);
		TableRow.LayoutParams params = new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT,1f);
		TableRow.LayoutParams comp_params = new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT,1f);
		comp_params.gravity = Gravity.CENTER;
		TableRow row;
		
		matrix = new CompoundButton[rows.length][columns.length];

		// first row = column names
		row = new TableRow(getParent().getActivity());
		row.setLayoutParams(rowParams);
		
		TextView topleft = new TextView(getParent().getActivity());
		topleft.setLayoutParams(params);
		row.addView(topleft); // empty topleft
		
		for(int i = 0; i < columns.length; i++){ // columns
			String s = columns[i];
			TextView tv = new TextView(getParent().getActivity());
			tv.setText(s);
			tv.setLayoutParams(params);
			row.addView(tv);
		}
		tablelayout.addView(row);
		
		checked = new int[rows.length];
		
		// create rows
		for(int i = 0; i < rows.length; i++){
			row = new TableRow(getParent().getActivity());
			row.setLayoutParams(rowParams);
			
			String r = rows[i];
			TextView tv = new TextView(getParent().getActivity());
			tv.setText(r);
			tv.setLayoutParams(params);
			tv.setSingleLine(false);
			row.addView(tv);
			
			// create radio or checkbox
			if(max == 1){
				GRadioGroup rg = new GRadioGroup(getParent());
				for(int j = 0; j < columns.length; j++){
					RadioButton rb = new RadioButton(getParent().getActivity());
					rb.setLayoutParams(comp_params);
					matrix[i][j] = rb;
					row.addView(rb);
					rg.addRadioButton(rb);
				}
			}else{
				final int ii = i;
				
				for(int j = 0; j < columns.length; j++){
					
					CheckBox cb = new CheckBox(getParent().getActivity());
					cb.setLayoutParams(comp_params);

					matrix[i][j] = cb;
					row.addView(cb);
					
					cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
						
						@Override
						public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
							checked[ii] += isChecked ? 1 : -1;
							
							// uncheck again if too many
							if(isChecked && checked[ii] > max){
								buttonView.setChecked(false);
								checked[ii]--;
							}else{
								// make questions visible/invisible if they have this as condition
								getParent().checkConditions();
							}
						}
					});
				}
			}

			tablelayout.addView(row);
		}
	}
	
	@Override
	public String toString(){
		if (!isAnswered()) return "";
		StringBuilder builder = new StringBuilder();
		
		for(int x = 0; x < matrix.length; x++){
			String s = "";
			
			for(int y = 0; y < matrix[x].length; y++)
					if (((CompoundButton)matrix[x][y]).isChecked())
						s += (s.length() == 0 ? "" : ", ") + columns[y];
			
			builder.append(rows[x]+ ": " + s + "\n");
		}
		builder.setLength(builder.length() - 1);
		return builder.toString();
	}

	@Override
	public boolean isAnswered() {
		if(max == 1){ // radiobuttons
			for(View[] row : matrix){
				boolean found = false;
				for(View v : row){
					RadioButton rb = (RadioButton)v;
					if(rb.isChecked())
						found = true;
				}
				if(!found)
					return false;
			}
			return true;
		}else{ // checkboxes
			for(int i : checked){
				System.out.println(i);
				if(i == 0)
					return false;
			}
			return true;
		}
	}
	
	@Override
	public void setVisible(boolean visible) {
		root.setVisibility(visible ? View.VISIBLE : View.GONE);
	}

	/**
	 * Sets the columns of possible choices (for each row)
	 * to the names given.
	 * 
	 * @param names Any number of Strings defining the
	 * possible choices.
	 */
	public void setColumns(String... names) {
		this.columns = names;
	}

	/**
	 * Sets the rows of questions to consider.
	 * 
	 * @param rows Any number of Strings defining the
	 * things to answer.
	 */
	public void setRows(String... rows) {
		this.rows = rows;
	}
	
	// PRIVATE HELPERS
}
