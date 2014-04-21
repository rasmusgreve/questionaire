package dk.itu.smdp.group2.questionnaire.model;

import dk.itu.smdp.group2.R;
import dk.itu.smdp.group2.questionnaire.utilities.GRadioGroup;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MatrixQuestion extends Question{
	
	private int max;
	private String[] columns;
	private String[] rows;
	
	private CompoundButton[][] matrix;
	private int[] checked = null;
	
	// results
	private View root;

	public MatrixQuestion(String question, String description, boolean optional, int maxPerRow){
		super(question,description,optional);
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
		title.setText(this.getQuestion() + (this.isOptional() ? "" : " *"));
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
			//tv.setLayoutParams(params);
			row.addView(tv);
			
			// create radio or checkbox
			if(max == 1){
				GRadioGroup rg = new GRadioGroup();
				for(int j = 0; j < columns.length; j++){
					RadioButton rb = new RadioButton(getParent().getActivity());
					matrix[i][j] = rb;
					row.addView(rb);
					rg.addRadioButton(rb);
				}
			}else{
				final int ii = i;
				
				for(int j = 0; j < columns.length; j++){
					
					CheckBox cb = new CheckBox(getParent().getActivity());

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
	
	public String toString(){
		if (!isAnswered()) return "";
		return "";
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

	public void setColumns(String... names) {
		this.columns = names;
	}

	public void setRows(String... rows) {
		this.rows = rows;
	}
	
	// PRIVATE HELPERS
}
