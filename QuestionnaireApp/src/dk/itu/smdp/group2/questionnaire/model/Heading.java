package dk.itu.smdp.group2.questionnaire.model;

import dk.itu.smdp.group2.R;
import android.view.View;
import android.widget.TextView;

/**
 * Indicates a Heading in the Questionnaire where a big title is written. This
 * is in itself not a Question, but will appear in the list of Question as a
 * sort of separator.
 * 
 * @author Emil
 *
 */
public class Heading extends Question {
	
	private View root;
	
	/**
	 * Simply initializes a Heading with the given title
	 * to display.
	 * 
	 * @param title The title of the heading.
	 */
	public Heading(String title){
		super(title,"",false);
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
		// always visible
	}
	
	@Override
	public String toString(){
		return "";
	}

}
