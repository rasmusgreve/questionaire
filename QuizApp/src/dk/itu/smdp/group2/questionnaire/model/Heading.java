package dk.itu.smdp.group2.questionnaire.model;

import dk.itu.smdp.group2.R;
import android.view.View;
import android.widget.TextView;

public class Heading extends Question {
	
	private View root;
	
	public Heading(String title){
		super(title,"",true);
	}

	@Override
	public View generateView() {
		// inflate and fetch objects
		root = this.getParent().getActivity().getLayoutInflater().inflate(R.layout.question_heading, null);
		TextView title = (TextView) root.findViewById(R.id.tvHeadingTitle);
		
		// set value
		title.setText(getQuestion());
		
		return root;
	}

	@Override
	public boolean isAnswered() {
		return true;
	}

	@Override
	public void setVisible(boolean visible) {
		
	}
	
	@Override
	public String toString(){
		return "";
	}

}
