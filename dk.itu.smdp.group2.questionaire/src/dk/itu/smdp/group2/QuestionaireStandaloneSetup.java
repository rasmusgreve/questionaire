/*
* generated by Xtext
*/
package dk.itu.smdp.group2;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QuestionaireStandaloneSetup extends QuestionaireStandaloneSetupGenerated{

	public static void doSetup() {
		new QuestionaireStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

