package dk.itu.smdp.group2.questionnaire.model;

import dk.itu.smdp.group2.R;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TextQuestion extends Question {
	
	private int lines;

	private View root;
	private EditText editText;
	
	public TextQuestion(String question, String description, boolean optional, int lines)
	{
		super(question, description, optional);
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
		title.setText(this.getQuestion() + (this.isOptional() ? "" : " *"));
		desc.setText(this.getDescription());
		if(getDescription() == null || getDescription().length() == 0) desc.setVisibility(View.GONE);
		
		// create spinner with values dynamically
		editText.setHeight(editText.getHeight() * lines);
		
		return root;
	}

	
	public String generateTextResult()
	{
		// TODO: Not implemented
		return "";
	}

	@Override
	public boolean isAnswered() {
		return editText.getText().length() > 0;
	}

	@Override
	public void setVisible(boolean visible) {
		root.setVisibility(visible ? View.VISIBLE : View.GONE);
	}
	
	// PRIVATE HELPERS
	
}
