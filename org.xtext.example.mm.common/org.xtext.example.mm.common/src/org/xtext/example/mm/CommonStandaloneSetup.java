
package org.xtext.example.mm;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CommonStandaloneSetup extends CommonStandaloneSetupGenerated{

	public static void doSetup() {
		new CommonStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

