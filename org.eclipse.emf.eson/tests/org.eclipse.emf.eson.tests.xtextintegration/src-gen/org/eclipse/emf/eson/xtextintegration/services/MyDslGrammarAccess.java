/*
* generated by Xtext
*/
package org.eclipse.emf.eson.xtextintegration.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGreetingsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cREFKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRefModelAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cRefModelModelCrossReference_2_1_0 = (CrossReference)cRefModelAssignment_2_1.eContents().get(0);
		private final RuleCall cRefModelModelIDTerminalRuleCall_2_1_0_1 = (RuleCall)cRefModelModelCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cREFsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cRefModelsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cRefModelsModelCrossReference_3_1_0 = (CrossReference)cRefModelsAssignment_3_1.eContents().get(0);
		private final RuleCall cRefModelsModelIDTerminalRuleCall_3_1_0_1 = (RuleCall)cRefModelsModelCrossReference_3_1_0.eContents().get(1);
		private final Assignment cGreetingsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cGreetingsGreetingParserRuleCall_4_0 = (RuleCall)cGreetingsAssignment_4.eContents().get(0);
		
		//Model:
		//	"Greetings" name=ID ("REF" refModel=[Model])? ("REFs" refModels+=[Model]+)? greetings+=Greeting*;
		public ParserRule getRule() { return rule; }

		//"Greetings" name=ID ("REF" refModel=[Model])? ("REFs" refModels+=[Model]+)? greetings+=Greeting*
		public Group getGroup() { return cGroup; }

		//"Greetings"
		public Keyword getGreetingsKeyword_0() { return cGreetingsKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("REF" refModel=[Model])?
		public Group getGroup_2() { return cGroup_2; }

		//"REF"
		public Keyword getREFKeyword_2_0() { return cREFKeyword_2_0; }

		//refModel=[Model]
		public Assignment getRefModelAssignment_2_1() { return cRefModelAssignment_2_1; }

		//[Model]
		public CrossReference getRefModelModelCrossReference_2_1_0() { return cRefModelModelCrossReference_2_1_0; }

		//ID
		public RuleCall getRefModelModelIDTerminalRuleCall_2_1_0_1() { return cRefModelModelIDTerminalRuleCall_2_1_0_1; }

		//("REFs" refModels+=[Model]+)?
		public Group getGroup_3() { return cGroup_3; }

		//"REFs"
		public Keyword getREFsKeyword_3_0() { return cREFsKeyword_3_0; }

		//refModels+=[Model]+
		public Assignment getRefModelsAssignment_3_1() { return cRefModelsAssignment_3_1; }

		//[Model]
		public CrossReference getRefModelsModelCrossReference_3_1_0() { return cRefModelsModelCrossReference_3_1_0; }

		//ID
		public RuleCall getRefModelsModelIDTerminalRuleCall_3_1_0_1() { return cRefModelsModelIDTerminalRuleCall_3_1_0_1; }

		//greetings+=Greeting*
		public Assignment getGreetingsAssignment_4() { return cGreetingsAssignment_4; }

		//Greeting
		public RuleCall getGreetingsGreetingParserRuleCall_4_0() { return cGreetingsGreetingParserRuleCall_4_0; }
	}

	public class GreetingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Greeting");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHelloKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Greeting:
		//	"Hello" name=ID "!";
		public ParserRule getRule() { return rule; }

		//"Hello" name=ID "!"
		public Group getGroup() { return cGroup; }

		//"Hello"
		public Keyword getHelloKeyword_0() { return cHelloKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"!"
		public Keyword getExclamationMarkKeyword_2() { return cExclamationMarkKeyword_2; }
	}
	
	
	private ModelElements pModel;
	private GreetingElements pGreeting;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.emf.eson.xtextintegration.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	"Greetings" name=ID ("REF" refModel=[Model])? ("REFs" refModels+=[Model]+)? greetings+=Greeting*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Greeting:
	//	"Hello" name=ID "!";
	public GreetingElements getGreetingAccess() {
		return (pGreeting != null) ? pGreeting : (pGreeting = new GreetingElements());
	}
	
	public ParserRule getGreetingRule() {
		return getGreetingAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
