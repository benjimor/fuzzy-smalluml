/*
 * generated by Xtext 2.10.0
 */
package org.alma.smalluml.ui.tests;

import com.google.inject.Injector;
import org.alma.smalluml.ui.internal.SmallumlActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class SmallUMLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SmallumlActivator.getInstance().getInjector("org.alma.smalluml.SmallUML");
	}

}
