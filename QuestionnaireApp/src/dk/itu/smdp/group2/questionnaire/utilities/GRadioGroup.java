package dk.itu.smdp.group2.questionnaire.utilities;

import java.util.ArrayList;
import java.util.List;

import dk.itu.smdp.group2.questionnaire.model.Questionnaire;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

public class GRadioGroup {

    List<RadioButton> radios = new ArrayList<RadioButton>();
    Questionnaire qn;
    
    public GRadioGroup(Questionnaire qn){
    	this.qn = qn;
    }
    
    public void addRadioButton(RadioButton rb){
    	radios.add(rb);
    	rb.setOnClickListener(onClick);
    }

    /**
     * This occurs everytime when one of RadioButtons is clicked, 
     * and deselects all others in the group.
     */
    OnClickListener onClick = new OnClickListener() {

        @Override
        public void onClick(View v) {

            // let's deselect all radios in group
            for (RadioButton rb : radios) {
            	rb.setChecked(false);
            }

            RadioButton rb = (RadioButton) v;
            rb.setChecked(true);
            qn.checkConditions();
        }
    };

}
