/*
 * generated by Xtext
 */
package org.eclipse.emf.eson.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.emf.eson.services.EFactoryGrammarAccess;

public class EFactoryParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private EFactoryGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.emf.eson.parser.antlr.internal.InternalEFactoryParser createParser(XtextTokenStream stream) {
		return new org.eclipse.emf.eson.parser.antlr.internal.InternalEFactoryParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Factory";
	}
	
	public EFactoryGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EFactoryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
