/**
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.viewbox;

import org.xtext.svg.viewbox.SvgViewboxStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SvgViewboxStandaloneSetup extends SvgViewboxStandaloneSetupGenerated {
  public static void doSetup() {
    new SvgViewboxStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}