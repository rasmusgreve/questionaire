package dk.itu.smdp.group2.questionnaire.model;

import java.util.ArrayList;

import dk.itu.smdp.group2.R;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ChoiceQuestion extends Question{
	
	private int min,max;
	private int numChecked = 0;
	private ArrayList<Tuple<String,String>> options;
	
	// results
	private View root;
	private RadioGroup radiogroup = null;
	private ArrayList<CheckBox> checkboxes = null;

	public ChoiceQuestion(String question, String description, boolean optional, int minSelections, int maxSelections){
		super(question,description,optional);
		min = minSelections;
		max = maxSelections;
		
		options = new ArrayList<Tuple<String,String>>();
	}
	
	public void addOption(String id, String text){
		options.add(new Tuple<String,String>(id, text));
	}
	
	public boolean containsID(String id){
		return getValueForID(id) != null;
	}
	
	
	public boolean isIDChosen(String id) {
		String value = getValueForID(id);
		if(radiogroup != null){
			RadioButton selected = (RadioButton)radiogroup.findViewById(radiogroup.getCheckedRadioButtonId());
			if(selected == null)
				return false;
			
			return selected.getText().equals(value);
		}else{ // checkbox
			for(CheckBox cb : checkboxes){
				if(cb.isChecked() && cb.getText().equals(value))
					return true;
			}
			return false;
		}
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
		title.setText(this.getQuestion() + (this.isOptional() ? "" : " *"));
		desc.setText(this.getDescription());
		if(getDescription() == null || getDescription().length() == 0) desc.setVisibility(View.GONE);
		
		// create options (dynamically because it is only checkbox/radio)
		if(min == 1 && max == 1){ // radio
			select.setVisibility(View.GONE);
			
			radiogroup = new RadioGroup(getParent().getActivity());
			for(Tuple<String,String> kv : this.options){
				RadioButton rb = new RadioButton(getParent().getActivity());
				rb.setText(kv.getSecond());
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
		// if the question is a radiogroup return the option of that radio
		if (radiogroup != null) return options.get(radiogroup.getCheckedRadioButtonId()).getSecond();
		// if the question is a series of textboxes return the answer from each checked checkbox
		String answer = "";
		for (int i = 0; i < checkboxes.size(); i++) 
			if (checkboxes.get(i).isChecked()) answer += options.get(i).getSecond() + ", ";
		return answer.substring(0, answer.length() - 3);
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
