package dk.itu.smdp.group2.questionnaire.model;

import dk.itu.smdp.group2.R;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * A Question where the respondent is required to answer with a
 * number. This number will be within a given range and possibly
 * with a step size to reduce the number of possible choices.
 * 
 * @author Emil
 *
 */
public class IntegerQuestion extends Question {
	
	private int min;
	private int max;
	private int step;

	private View root;
	private Spinner spinner;
	
	/**
	 * Initializes this IntegerQuestion with the given parameters.
	 * 
	 * @param question The question to answer.
	 * @param desc The more detailed description to the question if necessary.
	 * Null or empty string will be seen as no description.
	 * @param mandatory True if the Question should be marked as mandatory for the
	 * Questionnaire to be complete.
	 * @param min The minimum number possible to select (inclusive).
	 * @param max The maximum number possible to select (inclusive, unless the
	 * stepsize misses it).
	 * @param step The step between each possible choice. If this doesn't match
	 * with the min and max it might not be possible to select the maximum value.
	 */
	public IntegerQuestion(String question, String description, boolean mandatory, int min, int max, int step)
	{
		super(question, description, mandatory);
		this.min = min;
		this.max = max;
		this.step = step;
	}
	
	@Override
	public View generateView() {
		// inflate and fetch objects
		root = this.getParent().getActivity().getLayoutInflater().inflate(R.layout.question_integer, null);
		TextView title = (TextView) root.findViewById(R.id.tvIntegerTitle);
		TextView desc = (TextView) root.findViewById(R.id.tvIntegerDesc);
		spinner = (Spinner) root.findViewById(R.id.spInteger);
		
		// set values
		title.setText(this.getQuestionText());
		desc.setText(this.getDescription());
		if(getDescription() == null || getDescription().length() == 0) desc.setVisibility(View.GONE);
		
		// create spinner with values dynamically
		ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(getParent().getActivity(), android.R.layout.simple_spinner_dropdown_item, getValues());
		spinner.setAdapter(spinnerArrayAdapter);
		
		return root;
	}

	@Override
	public boolean isAnswered() {
		return spinner.getSelectedItemPosition() > 0;
	}

	@Override
	public void setVisible(boolean visible) {
		root.setVisibility(visible ? View.VISIBLE : View.GONE);
	}
	
	@Override
	public String toString(){
		if (this.isAnswered())
			return (String)spinner.getSelectedItem();
		return "";
	}
	
	// PRIVATE HELPERS
	
	private String[] getValues(){
		String[] result = new String[((max - min + 1) / step) + 2];
		result[0] = "Not Selected";
		int cur = min;
		for(int i = 1; i < result.length; i++){
			result[i] = ""+cur;
			cur += step;
		}
		return result;
	}
}
