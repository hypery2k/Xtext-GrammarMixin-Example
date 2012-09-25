
package org.xtext.example.mm;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MetaStandaloneSetup extends MetaStandaloneSetupGenerated{

	public static void doSetup() {
		new MetaStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

