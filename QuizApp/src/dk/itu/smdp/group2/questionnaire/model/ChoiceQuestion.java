package dk.itu.smdp.group2.questionnaire.model;

import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map.Entry;

import dk.itu.smdp.group2.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ChoiceQuestion extends Question{
	
	private int min,max;
	private HashMap<String,String> options;

	public ChoiceQuestion(String question, String description, boolean optional, int minSelections, int maxSelections){
		super(question,description,optional);
		min = minSelections;
		max = maxSelections;
		
		options = new HashMap<String,String>();
	}
	
	public void AddOption(String id, String text){
		options.put(id, text);
	}

	@Override
	public View generateView() {
		View v = this.getParent().getActivity().getLayoutInflater().inflate(R.layout.question_choice, null);
		TextView title = (TextView) v.findViewById(R.id.tvChoiceTitle);
		TextView desc = (TextView) v.findViewById(R.id.tvChoiceDesc);
		LinearLayout options = (LinearLayout) v.findViewById(R.id.svsChoiceLL);
		
		title.setText(this.getQuestion() + (this.isOptional() ? "" : " *"));
		desc.setText(this.getDescription());
		
		// create options (dynamically because it is only checkbox/radio)
		if(min == 1 && max == 1){ // radio
			RadioGroup rg = new RadioGroup(getParent().getActivity());
			for(Entry<String,String> kv : this.options.entrySet()){
				RadioButton rb = new RadioButton(getParent().getActivity());
				rb.setText(kv.getValue());
				rg.addView(rb);
				
				// TODO: Put listener
			}
			options.addView(rg);
		}else{ // checkbox
			for(Entry<String,String> kv : this.options.entrySet()){
				CheckBox cb = new CheckBox(getParent().getActivity());
				cb.setText(kv.getValue());
				
				// TODO: Put listener
				
				options.addView(cb);
			}
		}
		
		return v;
	}

	@Override
	public String generateTextResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAnswered() {
		// TODO Auto-generated method stub
		return false;
	}
}
