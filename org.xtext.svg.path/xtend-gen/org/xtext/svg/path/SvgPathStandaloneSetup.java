/**
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.path;

import org.xtext.svg.path.SvgPathStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SvgPathStandaloneSetup extends SvgPathStandaloneSetupGenerated {
  public static void doSetup() {
    new SvgPathStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}