package dk.itu.smdp.group2.questionnaire.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

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
	private HashMap<String,String> options;
	
	// results
	private View root;
	private RadioGroup radiogroup = null;
	private ArrayList<CheckBox> checkboxes = null;

	public ChoiceQuestion(String question, String description, boolean optional, int minSelections, int maxSelections){
		super(question,description,optional);
		min = minSelections;
		max = maxSelections;
		
		options = new HashMap<String,String>();
	}
	
	public void addOption(String id, String text){
		options.put(id, text);
	}
	
	public boolean containsID(String id){
		return options.containsKey(id);
	}
	
	public boolean isIDChosen(String id) {
		//TODO: Made the assumption that both key and value are unique.
		String value = options.get(id);
		if(radiogroup != null){
			return ((RadioButton)radiogroup.findViewById(radiogroup.getCheckedRadioButtonId())).getText().equals(value);
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
		root = this.getParent().getActivity().getLayoutInflater().inflate(R.layout.question_choice, null);
		TextView title = (TextView) root.findViewById(R.id.tvChoiceTitle);
		TextView desc = (TextView) root.findViewById(R.id.tvChoiceDesc);
		LinearLayout options = (LinearLayout) root.findViewById(R.id.svsChoiceLL);
		
		title.setText(this.getQuestion() + (this.isOptional() ? "" : " *"));
		desc.setText(this.getDescription());
		
		// create options (dynamically because it is only checkbox/radio)
		if(min == 1 && max == 1){ // radio
			radiogroup = new RadioGroup(getParent().getActivity());
			for(Entry<String,String> kv : this.options.entrySet()){
				RadioButton rb = new RadioButton(getParent().getActivity());
				rb.setText(kv.getValue());
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
			checkboxes = new ArrayList<CheckBox>();
			for(Entry<String,String> kv : this.options.entrySet()){
				final CheckBox cb = new CheckBox(getParent().getActivity());
				cb.setText(kv.getValue());
				
				// Put listener
				cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
						numChecked++;
						
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
	public String generateTextResult() {
		// TODO Auto-generated method stub
		return null;
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
	
	private int countChecked(ArrayList<CheckBox> arr){
		int count = 0;
		for(CheckBox cb : arr){
			count += cb.isChecked() ? 1 : 0;
		}
		return count;
	}
}
