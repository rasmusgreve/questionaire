/*
* generated by Xtext
*/
package dk.itu.smdp.group2;

import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;

import com.google.inject.Injector;

public class QuestionaireInjectorProvider implements IInjectorProvider, IRegistryConfigurator {
	
    protected GlobalStateMemento stateBeforeInjectorCreation;
	protected GlobalStateMemento stateAfterInjectorCreation;
	protected Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}

	public Injector getInjector()
	{
		if (injector == null) {
			stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
			this.injector = internalCreateInjector();
			stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		}
		return injector;
	}
	
	protected Injector internalCreateInjector() {
	    return new QuestionaireStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public void restoreRegistry() {
		stateBeforeInjectorCreation.restoreGlobalState();
	}

	public void setupRegistry() {
		getInjector();
		stateAfterInjectorCreation.restoreGlobalState();
	}
}
