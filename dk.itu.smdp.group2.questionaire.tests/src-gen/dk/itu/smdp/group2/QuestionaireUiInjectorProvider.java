/*
* generated by Xtext
*/
package dk.itu.smdp.group2;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class QuestionaireUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return dk.itu.smdp.group2.ui.internal.QuestionaireActivator.getInstance().getInjector("dk.itu.smdp.group2.Questionaire");
	}
	
}
