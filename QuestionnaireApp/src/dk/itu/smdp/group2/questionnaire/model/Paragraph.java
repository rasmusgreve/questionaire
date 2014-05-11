package dk.itu.smdp.group2.questionnaire.model;

import dk.itu.smdp.group2.R;
import android.view.View;
import android.widget.TextView;

/**
 * A paragraph that separates the Questionnaire into several
 * parts. It doesn't have any major effect at the moment,
 * except as a separator, but could potentially dictate
 * sub-numbering of the Questions or division of the
 * Questionnaire into several pages.
 * 
 * @author Emil
 *
 */
public class Paragraph extends Question {
	
	private View root;
	
	/**
	 * Initializes the Paragraph with the given title.
	 * 
	 * @param title The title (to write) of the Paragraph.
	 */
	public Paragraph(String title){
		super(title,"",false);
	}

	@Override
	public View generateView() {
		// inflate and fetch objects
		root = this.getParent().getActivity().getLayoutInflater().inflate(R.layout.question_paragraph, null);
		TextView title = (TextView) root.findViewById(R.id.tvParaTitle);
		
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
