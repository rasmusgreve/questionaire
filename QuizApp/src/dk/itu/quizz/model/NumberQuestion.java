package dk.itu.quizz.model;

import java.util.HashMap;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NumberQuestion extends Question {
	
	private int min;
	private int max;
	private int step;

	private HashMap<Integer, RadioButton> radios;
	
	public NumberQuestion(String question, String description, boolean optional, Context context, int min, int max, int step)
	{
		super(question, description, optional, context);
	}
	
	@Override
	public View generateView() {
		// TODO Auto-generated method stub
		RelativeLayout layout = new RelativeLayout(getContext());
		
		// Question description
		TextView text = new TextView(getContext());
		text.setText(getQuestion());
		RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
		params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
		layout.addView(text, params);
		
		for(int i = min; i <= max; i += step)
		{
			TextView ntext = new TextView(getContext());
			ntext.setText(i + ": ");
			params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
			//if(i == min) 
			
			RadioButton button = new RadioButton(getContext());
			
		}
		
		return layout;
	}

	
	public String generateTextResult()
	{
		return "";
	}
}
