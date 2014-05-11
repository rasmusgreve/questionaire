package dk.itu.smdp.group2.questionnaire.model;

import dk.itu.smdp.group2.R;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A Question where the respondent is simply required to
 * write a piece of text.
 * 
 * @author Emil
 *
 */
public class TextQuestion extends Question {
	
	private int lines;

	private View root;
	private EditText editText;
	
	/**
	 * Initializes the TextQuestion with the given parameters.
	 * 
	 * @param question The question to answer.
	 * @param desc The more detailed description to the question if necessary.
	 * Null or empty string will be seen as no description.
	 * @param mandatory True if the Question should be marked as mandatory for the
	 * Questionnaire to be complete.
	 * @param lines The number of lines the resulting EditText should expect.
	 */
	public TextQuestion(String question, String description, boolean mandatory, int lines)
	{
		super(question, description, mandatory);
		this.lines = lines;
	}
	
	@Override
	public View generateView() {
		// inflate and fetch objects
		root = this.getParent().getActivity().getLayoutInflater().inflate(R.layout.question_text, null);
		TextView title = (TextView) root.findViewById(R.id.tvIntegerTitle);
		TextView desc = (TextView) root.findViewById(R.id.tvIntegerDesc);
		editText = (EditText) root.findViewById(R.id.spEditText);
		
		// set values
		title.setText(this.getQuestionText());
		desc.setText(this.getDescription());
		if(getDescription() == null || getDescription().length() == 0) desc.setVisibility(View.GONE);
		
		// set number of lines
		if(lines == 1){
			editText.setSingleLine();
		}else{
			editText.setLines(lines);
			editText.setMaxLines(lines);
		}
		
		return root;
	}

	@Override
	public boolean isAnswered() {
		return editText.getText().toString().length() > 0;
	}

	@Override
	public void setVisible(boolean visible) {
		root.setVisibility(visible ? View.VISIBLE : View.GONE);
	}	
	
	@Override
	public String toString(){
		if (!isAnswered()) return "";
		return editText.getText().toString();
	}
}
