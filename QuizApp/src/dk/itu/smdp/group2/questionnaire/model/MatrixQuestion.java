package dk.itu.smdp.group2.questionnaire.model;

import dk.itu.smdp.group2.R;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MatrixQuestion extends Question{
	
	private int max;
	private String[] columns;
	private String[] rows;
	
	private View[][] matrix;
	
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
		
		matrix = new View[rows.length][columns.length];

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
			for(int j = 0; j < columns.length; j++){
				// TODO: Create radio (incl group) or checkbox
				matrix[i][j] = new CheckBox(getParent().getActivity());
				//matrix[i][j].setLayoutParams(params);
				row.addView(matrix[i][j]);
			}
			tablelayout.addView(row);
		}
	}

	@Override
	public String generateTextResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAnswered() {
		// TODO: Implement
		return false;
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
