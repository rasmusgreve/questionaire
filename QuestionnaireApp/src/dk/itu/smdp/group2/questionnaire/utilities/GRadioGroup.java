package dk.itu.smdp.group2.questionnaire.utilities;

import java.util.ArrayList;
import java.util.List;

import dk.itu.smdp.group2.questionnaire.model.Questionnaire;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

/**
 * A simple version of a RadioGroup that doesn't restrict the visual
 * layout or location of RadioButtons, but ties them together so only
 * one can be selected at a given time.
 * 
 * @author Emil
 *
 */
public class GRadioGroup {

    List<RadioButton> radios = new ArrayList<RadioButton>();
    Questionnaire qn;
    
    /**
     * Initializes the GRadioGroup with the given Questionnaire
     * (for calling checkConditions when changes happen).
     * 
     * @param qn The parent Questionnaire.
     */
    public GRadioGroup(Questionnaire qn){
    	this.qn = qn;
    }
    
    /**
     * Adds the given RadioButton to this GRadioGroup.
     * 
     * @param rb The new RadioButton.
     */
    public void addRadioButton(RadioButton rb){
    	radios.add(rb);
    	rb.setChecked(false);
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
