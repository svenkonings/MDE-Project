/*
 * generated by Xtext 2.12.0
 */
package org.xtext.svg.path.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SvgPathAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/svg/path/parser/antlr/internal/InternalSvgPath.tokens");
	}
}