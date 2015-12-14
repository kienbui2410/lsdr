/*
 * generated by Xtext
 */
package org.xtext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class RdslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class GraphElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Graph");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentsCommentParserRuleCall_0_0 = (RuleCall)cCommentsAssignment_0.eContents().get(0);
		private final Assignment cImportsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportsImportParserRuleCall_1_0 = (RuleCall)cImportsAssignment_1.eContents().get(0);
		private final Assignment cComponentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cComponentsComponentParserRuleCall_2_0 = (RuleCall)cComponentsAssignment_2.eContents().get(0);
		
		//Graph:
		//	comments+=Comment* imports+=Import* components+=Component+;
		@Override public ParserRule getRule() { return rule; }

		//comments+=Comment* imports+=Import* components+=Component+
		public Group getGroup() { return cGroup; }

		//comments+=Comment*
		public Assignment getCommentsAssignment_0() { return cCommentsAssignment_0; }

		//Comment
		public RuleCall getCommentsCommentParserRuleCall_0_0() { return cCommentsCommentParserRuleCall_0_0; }

		//imports+=Import*
		public Assignment getImportsAssignment_1() { return cImportsAssignment_1; }

		//Import
		public RuleCall getImportsImportParserRuleCall_1_0() { return cImportsImportParserRuleCall_1_0; }

		//components+=Component+
		public Assignment getComponentsAssignment_2() { return cComponentsAssignment_2; }

		//Component
		public RuleCall getComponentsComponentParserRuleCall_2_0() { return cComponentsComponentParserRuleCall_2_0; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Import:
		//	"import" name=ID ";";
		@Override public ParserRule getRule() { return rule; }

		//"import" name=ID ";"
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Component");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentsCommentParserRuleCall_0_0 = (RuleCall)cCommentsAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCommentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCommentsCommentParserRuleCall_3_0 = (RuleCall)cCommentsAssignment_3.eContents().get(0);
		private final Assignment cInstallersAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInstallersInstallerParserRuleCall_4_0 = (RuleCall)cInstallersAssignment_4.eContents().get(0);
		private final Assignment cCommentsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCommentsCommentParserRuleCall_5_0 = (RuleCall)cCommentsAssignment_5.eContents().get(0);
		private final Assignment cPropertiesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cPropertiesPropertyParserRuleCall_6_0 = (RuleCall)cPropertiesAssignment_6.eContents().get(0);
		private final Assignment cCommentsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cCommentsCommentParserRuleCall_7_0 = (RuleCall)cCommentsAssignment_7.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cExtendsKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Group cGroup_8_1 = (Group)cGroup_8.eContents().get(1);
		private final Assignment cSupComponentsAssignment_8_1_0 = (Assignment)cGroup_8_1.eContents().get(0);
		private final CrossReference cSupComponentsComponentCrossReference_8_1_0_0 = (CrossReference)cSupComponentsAssignment_8_1_0.eContents().get(0);
		private final RuleCall cSupComponentsComponentIDTerminalRuleCall_8_1_0_0_1 = (RuleCall)cSupComponentsComponentCrossReference_8_1_0_0.eContents().get(1);
		private final Keyword cCommaKeyword_8_1_1 = (Keyword)cGroup_8_1.eContents().get(1);
		private final Assignment cSupComponentAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final CrossReference cSupComponentComponentCrossReference_8_2_0 = (CrossReference)cSupComponentAssignment_8_2.eContents().get(0);
		private final RuleCall cSupComponentComponentIDTerminalRuleCall_8_2_0_1 = (RuleCall)cSupComponentComponentCrossReference_8_2_0.eContents().get(1);
		private final Assignment cCommentsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cCommentsCommentParserRuleCall_9_0 = (RuleCall)cCommentsAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Component:
		//	comments+=Comment* name=ID "{" comments+=Comment* installers=Installer comments+=Comment* properties+=Property*
		//	comments+=Comment* ("extends:" (supComponents+=[Component] ",")* supComponent=[Component])? comments+=Comment* "}";
		@Override public ParserRule getRule() { return rule; }

		//comments+=Comment* name=ID "{" comments+=Comment* installers=Installer comments+=Comment* properties+=Property*
		//comments+=Comment* ("extends:" (supComponents+=[Component] ",")* supComponent=[Component])? comments+=Comment* "}"
		public Group getGroup() { return cGroup; }

		//comments+=Comment*
		public Assignment getCommentsAssignment_0() { return cCommentsAssignment_0; }

		//Comment
		public RuleCall getCommentsCommentParserRuleCall_0_0() { return cCommentsCommentParserRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//comments+=Comment*
		public Assignment getCommentsAssignment_3() { return cCommentsAssignment_3; }

		//Comment
		public RuleCall getCommentsCommentParserRuleCall_3_0() { return cCommentsCommentParserRuleCall_3_0; }

		//installers=Installer
		public Assignment getInstallersAssignment_4() { return cInstallersAssignment_4; }

		//Installer
		public RuleCall getInstallersInstallerParserRuleCall_4_0() { return cInstallersInstallerParserRuleCall_4_0; }

		//comments+=Comment*
		public Assignment getCommentsAssignment_5() { return cCommentsAssignment_5; }

		//Comment
		public RuleCall getCommentsCommentParserRuleCall_5_0() { return cCommentsCommentParserRuleCall_5_0; }

		//properties+=Property*
		public Assignment getPropertiesAssignment_6() { return cPropertiesAssignment_6; }

		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_6_0() { return cPropertiesPropertyParserRuleCall_6_0; }

		//comments+=Comment*
		public Assignment getCommentsAssignment_7() { return cCommentsAssignment_7; }

		//Comment
		public RuleCall getCommentsCommentParserRuleCall_7_0() { return cCommentsCommentParserRuleCall_7_0; }

		//("extends:" (supComponents+=[Component] ",")* supComponent=[Component])?
		public Group getGroup_8() { return cGroup_8; }

		//"extends:"
		public Keyword getExtendsKeyword_8_0() { return cExtendsKeyword_8_0; }

		//(supComponents+=[Component] ",")*
		public Group getGroup_8_1() { return cGroup_8_1; }

		//supComponents+=[Component]
		public Assignment getSupComponentsAssignment_8_1_0() { return cSupComponentsAssignment_8_1_0; }

		//[Component]
		public CrossReference getSupComponentsComponentCrossReference_8_1_0_0() { return cSupComponentsComponentCrossReference_8_1_0_0; }

		//ID
		public RuleCall getSupComponentsComponentIDTerminalRuleCall_8_1_0_0_1() { return cSupComponentsComponentIDTerminalRuleCall_8_1_0_0_1; }

		//","
		public Keyword getCommaKeyword_8_1_1() { return cCommaKeyword_8_1_1; }

		//supComponent=[Component]
		public Assignment getSupComponentAssignment_8_2() { return cSupComponentAssignment_8_2; }

		//[Component]
		public CrossReference getSupComponentComponentCrossReference_8_2_0() { return cSupComponentComponentCrossReference_8_2_0; }

		//ID
		public RuleCall getSupComponentComponentIDTerminalRuleCall_8_2_0_1() { return cSupComponentComponentIDTerminalRuleCall_8_2_0_1; }

		//comments+=Comment*
		public Assignment getCommentsAssignment_9() { return cCommentsAssignment_9; }

		//Comment
		public RuleCall getCommentsCommentParserRuleCall_9_0() { return cCommentsCommentParserRuleCall_9_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}

	public class InstallerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Installer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInstallerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Installer:
		//	"installer:" name=ID ";";
		@Override public ParserRule getRule() { return rule; }

		//"installer:" name=ID ";"
		public Group getGroup() { return cGroup; }

		//"installer:"
		public Keyword getInstallerKeyword_0() { return cInstallerKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Property");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cChildrenParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExportParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cImportsParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cFacetParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Property:
		//	Children | Export | Imports | Facet;
		@Override public ParserRule getRule() { return rule; }

		//Children | Export | Imports | Facet
		public Alternatives getAlternatives() { return cAlternatives; }

		//Children
		public RuleCall getChildrenParserRuleCall_0() { return cChildrenParserRuleCall_0; }

		//Export
		public RuleCall getExportParserRuleCall_1() { return cExportParserRuleCall_1; }

		//Imports
		public RuleCall getImportsParserRuleCall_2() { return cImportsParserRuleCall_2; }

		//Facet
		public RuleCall getFacetParserRuleCall_3() { return cFacetParserRuleCall_3; }
	}

	public class ChildrenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Children");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChildrenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cChildrenAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cChildrenChildParserRuleCall_1_0_0 = (RuleCall)cChildrenAssignment_1_0.eContents().get(0);
		private final Keyword cCommaKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cChildAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cChildChildParserRuleCall_2_0 = (RuleCall)cChildAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Children:
		//	"children:" (children+=Child ",")* child=Child ";";
		@Override public ParserRule getRule() { return rule; }

		//"children:" (children+=Child ",")* child=Child ";"
		public Group getGroup() { return cGroup; }

		//"children:"
		public Keyword getChildrenKeyword_0() { return cChildrenKeyword_0; }

		//(children+=Child ",")*
		public Group getGroup_1() { return cGroup_1; }

		//children+=Child
		public Assignment getChildrenAssignment_1_0() { return cChildrenAssignment_1_0; }

		//Child
		public RuleCall getChildrenChildParserRuleCall_1_0_0() { return cChildrenChildParserRuleCall_1_0_0; }

		//","
		public Keyword getCommaKeyword_1_1() { return cCommaKeyword_1_1; }

		//child=Child
		public Assignment getChildAssignment_2() { return cChildAssignment_2; }

		//Child
		public RuleCall getChildChildParserRuleCall_2_0() { return cChildChildParserRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class ChildElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Child");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Child:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}

	public class ExportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Export");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExportsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cExportsAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cExportsExportVariableParserRuleCall_1_0_0 = (RuleCall)cExportsAssignment_1_0.eContents().get(0);
		private final Keyword cCommaKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cExportAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExportExportVariableParserRuleCall_2_0 = (RuleCall)cExportAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Export:
		//	"exports:" (exports+=exportVariable ",")* export=exportVariable ";";
		@Override public ParserRule getRule() { return rule; }

		//"exports:" (exports+=exportVariable ",")* export=exportVariable ";"
		public Group getGroup() { return cGroup; }

		//"exports:"
		public Keyword getExportsKeyword_0() { return cExportsKeyword_0; }

		//(exports+=exportVariable ",")*
		public Group getGroup_1() { return cGroup_1; }

		//exports+=exportVariable
		public Assignment getExportsAssignment_1_0() { return cExportsAssignment_1_0; }

		//exportVariable
		public RuleCall getExportsExportVariableParserRuleCall_1_0_0() { return cExportsExportVariableParserRuleCall_1_0_0; }

		//","
		public Keyword getCommaKeyword_1_1() { return cCommaKeyword_1_1; }

		//export=exportVariable
		public Assignment getExportAssignment_2() { return cExportAssignment_2; }

		//exportVariable
		public RuleCall getExportExportVariableParserRuleCall_2_0() { return cExportExportVariableParserRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class ExportVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "exportVariable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cInitialAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInitialInitialisationParserRuleCall_1_0 = (RuleCall)cInitialAssignment_1.eContents().get(0);
		
		//exportVariable:
		//	name=ID initial=Initialisation?;
		@Override public ParserRule getRule() { return rule; }

		//name=ID initial=Initialisation?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//initial=Initialisation?
		public Assignment getInitialAssignment_1() { return cInitialAssignment_1; }

		//Initialisation
		public RuleCall getInitialInitialisationParserRuleCall_1_0() { return cInitialInitialisationParserRuleCall_1_0; }
	}

	public class InitialisationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Initialisation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//Initialisation:
		//	"=" val=INT;
		@Override public ParserRule getRule() { return rule; }

		//"=" val=INT
		public Group getGroup() { return cGroup; }

		//"="
		public Keyword getEqualsSignKeyword_0() { return cEqualsSignKeyword_0; }

		//val=INT
		public Assignment getValAssignment_1() { return cValAssignment_1; }

		//INT
		public RuleCall getValINTTerminalRuleCall_1_0() { return cValINTTerminalRuleCall_1_0; }
	}

	public class ImportsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Imports");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cExternalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cImportsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cImportsImportVariableParserRuleCall_2_0_0 = (RuleCall)cImportsAssignment_2_0.eContents().get(0);
		private final Keyword cCommaKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cImportedAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cImportedImportVariableParserRuleCall_3_0 = (RuleCall)cImportedAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Imports:
		//	"imports:" "external"? (imports+=importVariable ",")* imported=importVariable ";";
		@Override public ParserRule getRule() { return rule; }

		//"imports:" "external"? (imports+=importVariable ",")* imported=importVariable ";"
		public Group getGroup() { return cGroup; }

		//"imports:"
		public Keyword getImportsKeyword_0() { return cImportsKeyword_0; }

		//"external"?
		public Keyword getExternalKeyword_1() { return cExternalKeyword_1; }

		//(imports+=importVariable ",")*
		public Group getGroup_2() { return cGroup_2; }

		//imports+=importVariable
		public Assignment getImportsAssignment_2_0() { return cImportsAssignment_2_0; }

		//importVariable
		public RuleCall getImportsImportVariableParserRuleCall_2_0_0() { return cImportsImportVariableParserRuleCall_2_0_0; }

		//","
		public Keyword getCommaKeyword_2_1() { return cCommaKeyword_2_1; }

		//imported=importVariable
		public Assignment getImportedAssignment_3() { return cImportedAssignment_3; }

		//importVariable
		public RuleCall getImportedImportVariableParserRuleCall_3_0() { return cImportedImportVariableParserRuleCall_3_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class ImportVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "importVariable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cOptionalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//importVariable:
		//	name=ID "(optional)"?;
		@Override public ParserRule getRule() { return rule; }

		//name=ID "(optional)"?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"(optional)"?
		public Keyword getOptionalKeyword_1() { return cOptionalKeyword_1; }
	}

	public class FacetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Facet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFacetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExportFacetAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cExportFacetExportCrossReference_3_0 = (CrossReference)cExportFacetAssignment_3.eContents().get(0);
		private final RuleCall cExportFacetExportIDTerminalRuleCall_3_0_1 = (RuleCall)cExportFacetExportCrossReference_3_0.eContents().get(1);
		private final Assignment cChildrenFacetAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cChildrenFacetChildrenCrossReference_4_0 = (CrossReference)cChildrenFacetAssignment_4.eContents().get(0);
		private final RuleCall cChildrenFacetChildrenIDTerminalRuleCall_4_0_1 = (RuleCall)cChildrenFacetChildrenCrossReference_4_0.eContents().get(1);
		private final Keyword cExtendsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Assignment cSupFacetsAssignment_6_0 = (Assignment)cGroup_6.eContents().get(0);
		private final CrossReference cSupFacetsFacetCrossReference_6_0_0 = (CrossReference)cSupFacetsAssignment_6_0.eContents().get(0);
		private final RuleCall cSupFacetsFacetIDTerminalRuleCall_6_0_0_1 = (RuleCall)cSupFacetsFacetCrossReference_6_0_0.eContents().get(1);
		private final Keyword cCommaKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cSupFacetAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cSupFacetFacetCrossReference_7_0 = (CrossReference)cSupFacetAssignment_7.eContents().get(0);
		private final RuleCall cSupFacetFacetIDTerminalRuleCall_7_0_1 = (RuleCall)cSupFacetFacetCrossReference_7_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Facet:
		//	"facet" name=ID "{" exportFacet+=[Export] childrenFacet+=[Children] "extends:" (supFacets+=[Facet] ",")*
		//	supFacet=[Facet] "}";
		@Override public ParserRule getRule() { return rule; }

		//"facet" name=ID "{" exportFacet+=[Export] childrenFacet+=[Children] "extends:" (supFacets+=[Facet] ",")*
		//supFacet=[Facet] "}"
		public Group getGroup() { return cGroup; }

		//"facet"
		public Keyword getFacetKeyword_0() { return cFacetKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//exportFacet+=[Export]
		public Assignment getExportFacetAssignment_3() { return cExportFacetAssignment_3; }

		//[Export]
		public CrossReference getExportFacetExportCrossReference_3_0() { return cExportFacetExportCrossReference_3_0; }

		//ID
		public RuleCall getExportFacetExportIDTerminalRuleCall_3_0_1() { return cExportFacetExportIDTerminalRuleCall_3_0_1; }

		//childrenFacet+=[Children]
		public Assignment getChildrenFacetAssignment_4() { return cChildrenFacetAssignment_4; }

		//[Children]
		public CrossReference getChildrenFacetChildrenCrossReference_4_0() { return cChildrenFacetChildrenCrossReference_4_0; }

		//ID
		public RuleCall getChildrenFacetChildrenIDTerminalRuleCall_4_0_1() { return cChildrenFacetChildrenIDTerminalRuleCall_4_0_1; }

		//"extends:"
		public Keyword getExtendsKeyword_5() { return cExtendsKeyword_5; }

		//(supFacets+=[Facet] ",")*
		public Group getGroup_6() { return cGroup_6; }

		//supFacets+=[Facet]
		public Assignment getSupFacetsAssignment_6_0() { return cSupFacetsAssignment_6_0; }

		//[Facet]
		public CrossReference getSupFacetsFacetCrossReference_6_0_0() { return cSupFacetsFacetCrossReference_6_0_0; }

		//ID
		public RuleCall getSupFacetsFacetIDTerminalRuleCall_6_0_0_1() { return cSupFacetsFacetIDTerminalRuleCall_6_0_0_1; }

		//","
		public Keyword getCommaKeyword_6_1() { return cCommaKeyword_6_1; }

		//supFacet=[Facet]
		public Assignment getSupFacetAssignment_7() { return cSupFacetAssignment_7; }

		//[Facet]
		public CrossReference getSupFacetFacetCrossReference_7_0() { return cSupFacetFacetCrossReference_7_0; }

		//ID
		public RuleCall getSupFacetFacetIDTerminalRuleCall_7_0_1() { return cSupFacetFacetIDTerminalRuleCall_7_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class CommentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Comment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cValuesAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cValuesIDTerminalRuleCall_1_0_0 = (RuleCall)cValuesAssignment_1_0.eContents().get(0);
		private final Keyword cSpaceKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueIDTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Comment:
		//	"#" (values+=ID " ")* value=ID;
		@Override public ParserRule getRule() { return rule; }

		//"#" (values+=ID " ")* value=ID
		public Group getGroup() { return cGroup; }

		//"#"
		public Keyword getNumberSignKeyword_0() { return cNumberSignKeyword_0; }

		//(values+=ID " ")*
		public Group getGroup_1() { return cGroup_1; }

		//values+=ID
		public Assignment getValuesAssignment_1_0() { return cValuesAssignment_1_0; }

		//ID
		public RuleCall getValuesIDTerminalRuleCall_1_0_0() { return cValuesIDTerminalRuleCall_1_0_0; }

		//" "
		public Keyword getSpaceKeyword_1_1() { return cSpaceKeyword_1_1; }

		//value=ID
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//ID
		public RuleCall getValueIDTerminalRuleCall_2_0() { return cValueIDTerminalRuleCall_2_0; }
	}
	
	
	private final GraphElements pGraph;
	private final ImportElements pImport;
	private final ComponentElements pComponent;
	private final InstallerElements pInstaller;
	private final PropertyElements pProperty;
	private final ChildrenElements pChildren;
	private final ChildElements pChild;
	private final ExportElements pExport;
	private final ExportVariableElements pExportVariable;
	private final InitialisationElements pInitialisation;
	private final ImportsElements pImports;
	private final ImportVariableElements pImportVariable;
	private final FacetElements pFacet;
	private final CommentElements pComment;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RdslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGraph = new GraphElements();
		this.pImport = new ImportElements();
		this.pComponent = new ComponentElements();
		this.pInstaller = new InstallerElements();
		this.pProperty = new PropertyElements();
		this.pChildren = new ChildrenElements();
		this.pChild = new ChildElements();
		this.pExport = new ExportElements();
		this.pExportVariable = new ExportVariableElements();
		this.pInitialisation = new InitialisationElements();
		this.pImports = new ImportsElements();
		this.pImportVariable = new ImportVariableElements();
		this.pFacet = new FacetElements();
		this.pComment = new CommentElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.Rdsl".equals(grammar.getName())) {
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
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Graph:
	//	comments+=Comment* imports+=Import* components+=Component+;
	public GraphElements getGraphAccess() {
		return pGraph;
	}
	
	public ParserRule getGraphRule() {
		return getGraphAccess().getRule();
	}

	//Import:
	//	"import" name=ID ";";
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//Component:
	//	comments+=Comment* name=ID "{" comments+=Comment* installers=Installer comments+=Comment* properties+=Property*
	//	comments+=Comment* ("extends:" (supComponents+=[Component] ",")* supComponent=[Component])? comments+=Comment* "}";
	public ComponentElements getComponentAccess() {
		return pComponent;
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}

	//Installer:
	//	"installer:" name=ID ";";
	public InstallerElements getInstallerAccess() {
		return pInstaller;
	}
	
	public ParserRule getInstallerRule() {
		return getInstallerAccess().getRule();
	}

	//Property:
	//	Children | Export | Imports | Facet;
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}

	//Children:
	//	"children:" (children+=Child ",")* child=Child ";";
	public ChildrenElements getChildrenAccess() {
		return pChildren;
	}
	
	public ParserRule getChildrenRule() {
		return getChildrenAccess().getRule();
	}

	//Child:
	//	name=ID;
	public ChildElements getChildAccess() {
		return pChild;
	}
	
	public ParserRule getChildRule() {
		return getChildAccess().getRule();
	}

	//Export:
	//	"exports:" (exports+=exportVariable ",")* export=exportVariable ";";
	public ExportElements getExportAccess() {
		return pExport;
	}
	
	public ParserRule getExportRule() {
		return getExportAccess().getRule();
	}

	//exportVariable:
	//	name=ID initial=Initialisation?;
	public ExportVariableElements getExportVariableAccess() {
		return pExportVariable;
	}
	
	public ParserRule getExportVariableRule() {
		return getExportVariableAccess().getRule();
	}

	//Initialisation:
	//	"=" val=INT;
	public InitialisationElements getInitialisationAccess() {
		return pInitialisation;
	}
	
	public ParserRule getInitialisationRule() {
		return getInitialisationAccess().getRule();
	}

	//Imports:
	//	"imports:" "external"? (imports+=importVariable ",")* imported=importVariable ";";
	public ImportsElements getImportsAccess() {
		return pImports;
	}
	
	public ParserRule getImportsRule() {
		return getImportsAccess().getRule();
	}

	//importVariable:
	//	name=ID "(optional)"?;
	public ImportVariableElements getImportVariableAccess() {
		return pImportVariable;
	}
	
	public ParserRule getImportVariableRule() {
		return getImportVariableAccess().getRule();
	}

	//Facet:
	//	"facet" name=ID "{" exportFacet+=[Export] childrenFacet+=[Children] "extends:" (supFacets+=[Facet] ",")*
	//	supFacet=[Facet] "}";
	public FacetElements getFacetAccess() {
		return pFacet;
	}
	
	public ParserRule getFacetRule() {
		return getFacetAccess().getRule();
	}

	//Comment:
	//	"#" (values+=ID " ")* value=ID;
	public CommentElements getCommentAccess() {
		return pComment;
	}
	
	public ParserRule getCommentRule() {
		return getCommentAccess().getRule();
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
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
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