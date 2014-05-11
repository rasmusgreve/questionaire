package dk.itu.smdp.group2.questionnaire.model;

import java.util.ArrayList;

import dk.itu.smdp.group2.R;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 *  A Question where the user must select a number of answers based
 *  on the given options to choose from.
 *  
 * @author Emil
 *
 */
public class ChoiceQuestion extends Question{
	
	private int min,max;
	private int numChecked = 0;
	private ArrayList<Tuple<String,String>> options;
	private ArrayList<Tuple<String,CompoundButton>> idViews;
	
	// results
	private View root;
	private RadioGroup radiogroup = null;
	private ArrayList<CheckBox> checkboxes = null;

	/**
	 * Initializes the ChoiceQuestion with the given parameters. Further addition
	 * of options is necessary for a complete ChoiceQuestion.
	 * 
	 * @param question The question to answer.
	 * @param desc The more detailed description to the question if necessary.
	 * Null or empty string will be seen as no description.
	 * @param mandatory True if the Question should be marked as mandatory for the
	 * Questionnaire to be complete.
	 * @param minSelections The minimum number of selections the respondent must select.
	 * @param maxSelections The maximum number of answers (inclusive) that the 
	 * respondent can select.
	 */
	public ChoiceQuestion(String question, String description, boolean mandatory, int minSelections, int maxSelections){
		super(question,description,mandatory);
		min = minSelections;
		max = maxSelections;
		
		options = new ArrayList<Tuple<String,String>>();
		idViews = new ArrayList<Tuple<String,CompoundButton>>();
	}
	
	/**
	 * Adds a possible option to the ChoiceQuestion for the
	 * respondent to select.
	 * 
	 * @param id The unique id of this choice, for possible
	 * reference in conditions of later Questions in the
	 * Questionnaire.
	 * @param text The visible text defining the option.
	 */
	public void addOption(String id, String text){
		options.add(new Tuple<String,String>(id, text));
	}
	
	/**
	 * Checks if this ChoiceQuestion has an option with
	 * the given ID.
	 * 
	 * @param id The ID to search for.
	 * @return True, if this ChoiceQuestion has an option
	 * with the given ID.
	 */
	public boolean containsID(String id){
		return getValueForID(id) != null;
	}
	
	/**
	 * Checks if the respondent has chosen the option with
	 * the given ID.
	 * 
	 * @param id The ID to search for.
	 * @return True, if this ChoiceQuestion has an option
	 * with the given ID and it has been selected by the
	 * respondent.
	 */
	public boolean isIDChosen(String id) {
		for(Tuple<String,CompoundButton> kv : idViews){
			if(kv.getFirst().equals(id)){
				return kv.getSecond().isChecked();
			}
		}
		return false;
	}

	@Override
	public View generateView() {
		// inflate and fetch objects
		root = this.getParent().getActivity().getLayoutInflater().inflate(R.layout.question_choice, null);
		TextView title = (TextView) root.findViewById(R.id.tvChoiceTitle);
		TextView desc = (TextView) root.findViewById(R.id.tvChoiceDesc);
		TextView select = (TextView) root.findViewById(R.id.tvChoiceSelec);
		LinearLayout options = (LinearLayout) root.findViewById(R.id.svsChoiceLL);
		
		// set values
		title.setText(this.getQuestionText());
		desc.setText(this.getDescription());
		if(getDescription() == null || getDescription().length() == 0) desc.setVisibility(View.GONE);
		
		// create options (dynamically because it is only checkbox/radio)
		if(min == 1 && max == 1){ // radio
			select.setVisibility(View.GONE);
			
			radiogroup = new RadioGroup(getParent().getActivity());
			for(Tuple<String,String> kv : this.options){
				RadioButton rb = new RadioButton(getParent().getActivity());
				rb.setText(kv.getSecond());
				idViews.add(new Tuple<String,CompoundButton>(kv.getFirst(),rb));
				radiogroup.addView(rb);
				
				// Put listener
				rb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
						// make questions visible/invisible if they have this as condition
						getParent().checkConditions();
					}
				});

			}
			options.addView(radiogroup);
		}else{ // checkbox
			select.setText("Select "+((min == max) ? min : "between"+min+" and "+max)+" options");
			
			checkboxes = new ArrayList<CheckBox>();
			for(Tuple<String,String> kv : this.options){
				final CheckBox cb = new CheckBox(getParent().getActivity());
				cb.setText(kv.getSecond());
				
				idViews.add(new Tuple<String,CompoundButton>(kv.getFirst(),cb));
				
				// Put listener
				cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
						numChecked += isChecked ? 1 : -1;
						
						// uncheck again if too many
						if(isChecked && numChecked > max){
							cb.setChecked(false);
							numChecked--;
						}else{
							// make questions visible/invisible if they have this as condition
							getParent().checkConditions();
						}
					}
				});
				
				options.addView(cb);
				checkboxes.add(cb);
			}
		}
		
		return root;
	}

	@Override
	public boolean isAnswered() {
		if(radiogroup != null){
			return radiogroup.getCheckedRadioButtonId() != -1;
		}else{
			int selected = countChecked(checkboxes);
			return selected >= min && selected <= max;
		}
	}
	
	@Override
	public void setVisible(boolean visible) {
		root.setVisibility(visible ? View.VISIBLE : View.GONE);
	}
	
	@Override
	public String toString(){
		// if the user has not answered the question legally return empty string.
		if (!isAnswered()) return "";
		
		String answer = "";
		for (Tuple<String, CompoundButton> t : idViews) 
			if (t.getSecond().isChecked()) 
				answer += (answer.length() == 0 ? "" : ", ") + t.getSecond().getText().toString();
		return answer;
	}
	
	// PRIVATE HELPERS
	
	private class Tuple<T,V>{
		private T t;
		private V v;
		public Tuple(T t, V v){
			this.t = t;
			this.v = v;
		}
		public T getFirst(){return t;}
		public V getSecond(){return v;}
	}
	
	private String getValueForID(String id){
		for(Tuple<String,String> t : options){
			if(t.getFirst().equals(id))
				return t.getSecond();
		}
		return null;
	}
	
	private int countChecked(ArrayList<CheckBox> arr){
		int count = 0;
		for(CheckBox cb : arr){
			count += cb.isChecked() ? 1 : 0;
		}
		return count;
	}
}
