/**
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.localiri;

import org.xtext.svg.localiri.SvgLocalIriStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SvgLocalIriStandaloneSetup extends SvgLocalIriStandaloneSetupGenerated {
  public static void doSetup() {
    new SvgLocalIriStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}