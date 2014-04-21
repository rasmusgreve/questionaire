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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public abstract class QuestionsFragmentBase extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);}
	
	@Override
	public void onPause() {super.onPause();}
	
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
		
		return v;
	}

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
					int missing = qn.getFirstUncomplete();
					String message = "Question "+missing+" must be answered.";
					Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
				}
			}
		});
		
		scroll.addView(b);
	}
	
	protected abstract Questionnaire init();
	
}
