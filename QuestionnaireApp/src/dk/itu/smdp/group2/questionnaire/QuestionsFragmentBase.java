package dk.itu.smdp.group2.questionnaire;

import dk.itu.smdp.group2.R;
import dk.itu.smdp.group2.questionnaire.model.Questionnaire;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This this the base class of the QuestionsFragment, where all static
 * (non-questionnaire specific) code resides and the ONE necessary
 * abstract method for generating the questionnaire is defined and called.
 * 
 * @author Emil
 *
 */
public abstract class QuestionsFragmentBase extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Questionnaire qn = init();
		
		View v = inflater.inflate(R.layout.questions_fragment, container, false);
		TextView title = (TextView) v.findViewById(R.id.tvTitle);
		LinearLayout scroll = (LinearLayout)v.findViewById(R.id.svsLinearLayout);
		
		title.setText(qn.getTitle());
		
		qn.generateAllViews(scroll);
		createButton(qn,scroll);
		
		qn.checkConditions();
		getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
		
		return v;
	}

	/**
	 * Creates the bottom "Send" button which will either trigger sending the email
	 * or show what questions still need answering.
	 * @param qn The Questionnaire of this app.
	 * @param scroll The layout to add the button to.
	 */
	private void createButton(final Questionnaire qn, LinearLayout scroll) {
		Button b = new Button(getActivity());
		b.setText("Send");
		b.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(qn.isCompleted()){
					qn.sendEmail();
				}else{
					int missing = qn.getQuestionNumber(qn.getFirstUncomplete());
					String message = "Question "+missing+" must be answered.";
					Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
				}
			}
		});
		
		scroll.addView(b);
	}
	
	/**
	 * This method must initialize the Questionnaire with all questions.
	 * This is what should be generated such that all information and
	 * connections are properly added.
	 * @return The finished Questionnaire.
	 */
	protected abstract Questionnaire init();
	
}
