
package org.xtext.example.mm;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class UiStandaloneSetup extends UiStandaloneSetupGenerated{

	public static void doSetup() {
		new UiStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

