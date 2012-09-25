
package org.xtext.example.mm;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DomainStandaloneSetup extends DomainStandaloneSetupGenerated{

	public static void doSetup() {
		new DomainStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

