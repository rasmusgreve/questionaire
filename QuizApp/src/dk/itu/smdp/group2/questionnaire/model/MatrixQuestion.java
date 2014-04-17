package dk.itu.smdp.group2.questionnaire.model;

import java.util.ArrayList;
import java.util.List;

import dk.itu.smdp.group2.R;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MatrixQuestion extends Question{
	
	private int min;
	private String[] columns;
	private String[] rows;
	
	// results
	private View root;

	public MatrixQuestion(String question, String description, boolean optional, int minPerRow){
		super(question,description,optional);
		min = minPerRow;
	}

	@Override
	public View generateView() {
		// inflate and fetch objects
		root = this.getParent().getActivity().getLayoutInflater().inflate(R.layout.question_matrix, null);
		TextView title = (TextView) root.findViewById(R.id.tvMatrixTitle);
		TextView desc = (TextView) root.findViewById(R.id.tvMatrixDesc);
		TextView select = (TextView) root.findViewById(R.id.tvMatrixSelec);
		GridView matrix = (GridView) root.findViewById(R.id.gvMatrix);
		
		// set values
		title.setText(this.getQuestion() + (this.isOptional() ? "" : " *"));
		desc.setText(this.getDescription());
		if(getDescription() == null || getDescription().length() == 0) desc.setVisibility(View.GONE);
		
		// guide text
		if(min == 1){ // radio
			select.setVisibility(View.GONE);
		}else{ // checkbox
			select.setText("Select "+min+" options per line");
		}
		
		// create grid titles
		matrix.setNumColumns(columns.length);
		List<View> list = new ArrayList<View>(columns.length*rows.length);
		list.add(new TextView(getParent().getActivity())); // empty topleft
		for(String c : columns){ // columns
			TextView tv = new TextView(getParent().getActivity());
			tv.setText(c);
			list.add(tv);
		}
		// create rows
		for(String r : rows){
			TextView tv = new TextView(getParent().getActivity());
			tv.setText(r);
			list.add(tv);
			
			// create radio or checkbox
			for(int i = 0; i < columns.length; i++){
				list.add(new TextView(getParent().getActivity()));
			}
		}
		
		ArrayAdapter<View> adapter = new ArrayAdapter<View>(getParent().getActivity(), android.R.layout.simple_list_item_1, list);
		matrix.setAdapter(adapter);
		
		return root;
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
