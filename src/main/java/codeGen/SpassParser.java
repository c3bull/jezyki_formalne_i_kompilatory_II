// Generated from C:/projects/SpassAndProver9/src/grammar\SpassParser.g4 by ANTLR 4.9.2
package codeGen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpassParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Special_symbol=1, And=2, Author=3, Axioms=4, Begin_problem=5, Clause=6,
		CloseB=7, CloseBc=8, CloseP=9, ClR=10, Cnf=11, Colon=12, Comma=13, Con=14,
		Conjectures=15, Date=16, Description=17, Dnf=18, Dot=19, EmS=20, End_of_list=21,
		End_problem=22, EqF=23, EqR=24, Equal=25, Equiv=26, Exists=27, Fac=28,
		False_=29, Forall=30, Formula=31, Freely=32, Functions=33, Generated_by=34,
		GeR=35, Hypothesis=36, Implied=37, Implies=38, Inp=39, KIV=40, LEM=41,
		List_of_clauses=42, List_of_declarations=43, List_of_descriptions=44,
		List_of_formulae=45, List_of_general_settings=46, List_of_proof=47, List_of_settings=48,
		List_of_symbols=49, Logic=50, MOne=51, MPm=52, Name=53, Not=54, Obv=55,
		OHy=56, OpenB=57, OpenBc=58, OpenP=59, OPm=60, Or=61, OTTER=62, Predicate=63,
		Predicates=64, PROTEIN=65, Rew=66, RRE=67, Satisfiable=68, SATURATE=69,
		SETHEO=70, SHy=71, SoR=72, Sort=73, Sorts=74, SPASS=75, SpL=76, Splitlevel=77,
		SPm=78, SpR=79, Spt=80, SSi=81, Status=82, Step=83, Subsort=84, Ter=85,
		ThreeTAP=86, True_=87, UnC=88, Unknown=89, Unsatisfiable=90, URR=91, Version=92,
		WS=93, Open=94, Identifier=95, Letter=96, Digit=97, Close=98, JustText=99;
	public static final int
		RULE_problem = 0, RULE_description = 1, RULE_log_state = 2, RULE_logical_part = 3,
		RULE_symbol_list = 4, RULE_declaration_list = 5, RULE_declaration = 6,
		RULE_gen_decl = 7, RULE_func_list = 8, RULE_subsort_decl = 9, RULE_term_decl = 10,
		RULE_pred_decl = 11, RULE_sort_sym = 12, RULE_pred_sym = 13, RULE_fun_sym = 14,
		RULE_formula_list = 15, RULE_origin_type = 16, RULE_label = 17, RULE_term = 18,
		RULE_term_list = 19, RULE_quant_sym = 20, RULE_symbol = 21, RULE_clause_list = 22,
		RULE_clause_type = 23, RULE_cnf_clause = 24, RULE_dnf_clause = 25, RULE_cnf_clause_body = 26,
		RULE_dnf_clause_body = 27, RULE_proof_list = 28, RULE_reference = 29,
		RULE_result = 30, RULE_rule_appl = 31, RULE_parent_list = 32, RULE_parent_ = 33,
		RULE_assoc_list = 34, RULE_key = 35, RULE_value = 36, RULE_proof_type = 37,
		RULE_user_reference = 38, RULE_user_result = 39, RULE_user_rule_appl = 40,
		RULE_user_parent = 41, RULE_user_proof_type = 42, RULE_user_key = 43,
		RULE_user_value = 44, RULE_settings = 45, RULE_setting_entry = 46, RULE_setting_label = 47,
		RULE_identifier = 48, RULE_arity = 49, RULE_number = 50, RULE_text_ = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"problem", "description", "log_state", "logical_part", "symbol_list",
			"declaration_list", "declaration", "gen_decl", "func_list", "subsort_decl",
			"term_decl", "pred_decl", "sort_sym", "pred_sym", "fun_sym", "formula_list",
			"origin_type", "label", "term", "term_list", "quant_sym", "symbol", "clause_list",
			"clause_type", "cnf_clause", "dnf_clause", "cnf_clause_body", "dnf_clause_body",
			"proof_list", "reference", "result", "rule_appl", "parent_list", "parent_",
			"assoc_list", "key", "value", "proof_type", "user_reference", "user_result",
			"user_rule_appl", "user_parent", "user_proof_type", "user_key", "user_value",
			"settings", "setting_entry", "setting_label", "identifier", "arity",
			"number", "text_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'and'", "'author'", "'axioms'", "'begin_problem'", "'clause'",
			"']'", "'}'", "')'", "'ClR'", "'cnf'", "':'", "','", "'Con'", "'conjectures'",
			"'date'", "'description'", "'dnf'", "'.'", "'EmS'", "'end_of_list'",
			"'end_problem'", "'EqF'", "'EqR'", "'equal'", "'equiv'", "'exists'",
			"'Fac'", "'false'", "'forall'", "'formula'", "'freely'", "'functions'",
			"'generated_by'", "'GeR'", "'hypothesis'", "'implied'", "'implies'",
			"'Inp'", "'KIV'", "'LEM'", "'list_of_clauses'", "'list_of_declarations'",
			"'list_of_descriptions'", "'list_of_formulae'", "'list_of_general_settings'",
			"'list_of_proof'", "'list_of_settings'", "'list_of_symbols'", "'logic'",
			"'-1'", "'MPm'", "'name'", "'not'", "'Obv'", "'OHy'", "'['", "'{'", "'('",
			"'OPm'", "'or'", "'OTTER'", "'predicate'", "'predicates'", "'PROTEIN'",
			"'Rew'", "'RRE'", "'satisfiable'", "'SATURATE'", "'SETHEO'", "'SHy'",
			"'SoR'", "'sort'", "'sorts'", "'SPASS'", "'SpL'", "'splitlevel'", "'SPm'",
			"'SpR'", "'Spt'", "'SSi'", "'status'", "'step'", "'subsort'", "'Ter'",
			"'3TAP'", "'true'", "'UnC'", "'unknown'", "'unsatisfiable'", "'URR'",
			"'version'", null, "'{*'", null, null, null, "'*}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Special_symbol", "And", "Author", "Axioms", "Begin_problem", "Clause",
			"CloseB", "CloseBc", "CloseP", "ClR", "Cnf", "Colon", "Comma", "Con",
			"Conjectures", "Date", "Description", "Dnf", "Dot", "EmS", "End_of_list",
			"End_problem", "EqF", "EqR", "Equal", "Equiv", "Exists", "Fac", "False_",
			"Forall", "Formula", "Freely", "Functions", "Generated_by", "GeR", "Hypothesis",
			"Implied", "Implies", "Inp", "KIV", "LEM", "List_of_clauses", "List_of_declarations",
			"List_of_descriptions", "List_of_formulae", "List_of_general_settings",
			"List_of_proof", "List_of_settings", "List_of_symbols", "Logic", "MOne",
			"MPm", "Name", "Not", "Obv", "OHy", "OpenB", "OpenBc", "OpenP", "OPm",
			"Or", "OTTER", "Predicate", "Predicates", "PROTEIN", "Rew", "RRE", "Satisfiable",
			"SATURATE", "SETHEO", "SHy", "SoR", "Sort", "Sorts", "SPASS", "SpL",
			"Splitlevel", "SPm", "SpR", "Spt", "SSi", "Status", "Step", "Subsort",
			"Ter", "ThreeTAP", "True_", "UnC", "Unknown", "Unsatisfiable", "URR",
			"Version", "WS", "Open", "Identifier", "Letter", "Digit", "Close", "JustText"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SpassParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpassParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProblemContext extends ParserRuleContext {
		public TerminalNode Begin_problem() { return getToken(SpassParser.Begin_problem, 0); }
		public TerminalNode OpenP() { return getToken(SpassParser.OpenP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CloseP() { return getToken(SpassParser.CloseP, 0); }
		public List<TerminalNode> Dot() { return getTokens(SpassParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(SpassParser.Dot, i);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public Logical_partContext logical_part() {
			return getRuleContext(Logical_partContext.class,0);
		}
		public TerminalNode End_problem() { return getToken(SpassParser.End_problem, 0); }
		public TerminalNode EOF() { return getToken(SpassParser.EOF, 0); }
		public List<SettingsContext> settings() {
			return getRuleContexts(SettingsContext.class);
		}
		public SettingsContext settings(int i) {
			return getRuleContext(SettingsContext.class,i);
		}
		public ProblemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterProblem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitProblem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitProblem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProblemContext problem() throws RecognitionException {
		ProblemContext _localctx = new ProblemContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_problem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(Begin_problem);
			setState(105);
			match(OpenP);
			setState(106);
			identifier();
			setState(107);
			match(CloseP);
			setState(108);
			match(Dot);
			setState(109);
			description();
			setState(110);
			logical_part();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==List_of_general_settings || _la==List_of_settings) {
				{
				{
				setState(111);
				settings();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(End_problem);
			setState(118);
			match(Dot);
			setState(119);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode List_of_descriptions() { return getToken(SpassParser.List_of_descriptions, 0); }
		public List<TerminalNode> Dot() { return getTokens(SpassParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(SpassParser.Dot, i);
		}
		public TerminalNode Name() { return getToken(SpassParser.Name, 0); }
		public List<TerminalNode> OpenP() { return getTokens(SpassParser.OpenP); }
		public TerminalNode OpenP(int i) {
			return getToken(SpassParser.OpenP, i);
		}
		public List<TerminalNode> CloseP() { return getTokens(SpassParser.CloseP); }
		public TerminalNode CloseP(int i) {
			return getToken(SpassParser.CloseP, i);
		}
		public TerminalNode Author() { return getToken(SpassParser.Author, 0); }
		public TerminalNode Status() { return getToken(SpassParser.Status, 0); }
		public Log_stateContext log_state() {
			return getRuleContext(Log_stateContext.class,0);
		}
		public TerminalNode Description() { return getToken(SpassParser.Description, 0); }
		public TerminalNode End_of_list() { return getToken(SpassParser.End_of_list, 0); }
		public List<TerminalNode> Open() { return getTokens(SpassParser.Open); }
		public TerminalNode Open(int i) {
			return getToken(SpassParser.Open, i);
		}
		public List<Text_Context> text_() {
			return getRuleContexts(Text_Context.class);
		}
		public Text_Context text_(int i) {
			return getRuleContext(Text_Context.class,i);
		}
		public List<TerminalNode> Close() { return getTokens(SpassParser.Close); }
		public TerminalNode Close(int i) {
			return getToken(SpassParser.Close, i);
		}
		public TerminalNode Version() { return getToken(SpassParser.Version, 0); }
		public TerminalNode Logic() { return getToken(SpassParser.Logic, 0); }
		public TerminalNode Date() { return getToken(SpassParser.Date, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(List_of_descriptions);
			setState(122);
			match(Dot);
			setState(123);
			match(Name);
			setState(124);
			match(OpenP);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Open) {
				{
				setState(125);
				match(Open);
				setState(126);
				text_();
				setState(127);
				match(Close);
				}
			}

			setState(131);
			match(CloseP);
			setState(132);
			match(Dot);
			setState(133);
			match(Author);
			setState(134);
			match(OpenP);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Open) {
				{
				setState(135);
				match(Open);
				setState(136);
				text_();
				setState(137);
				match(Close);
				}
			}

			setState(141);
			match(CloseP);
			setState(142);
			match(Dot);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Version) {
				{
				setState(143);
				match(Version);
				setState(144);
				match(OpenP);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Open) {
					{
					setState(145);
					match(Open);
					setState(146);
					text_();
					setState(147);
					match(Close);
					}
				}

				setState(151);
				match(CloseP);
				setState(152);
				match(Dot);
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Logic) {
				{
				setState(155);
				match(Logic);
				setState(156);
				match(OpenP);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Open) {
					{
					setState(157);
					match(Open);
					setState(158);
					text_();
					setState(159);
					match(Close);
					}
				}

				setState(163);
				match(CloseP);
				setState(164);
				match(Dot);
				}
			}

			setState(167);
			match(Status);
			setState(168);
			match(OpenP);
			setState(169);
			log_state();
			setState(170);
			match(CloseP);
			setState(171);
			match(Dot);
			setState(172);
			match(Description);
			setState(173);
			match(OpenP);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Open) {
				{
				setState(174);
				match(Open);
				setState(175);
				text_();
				setState(176);
				match(Close);
				}
			}

			setState(180);
			match(CloseP);
			setState(181);
			match(Dot);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Date) {
				{
				setState(182);
				match(Date);
				setState(183);
				match(OpenP);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Open) {
					{
					setState(184);
					match(Open);
					setState(185);
					text_();
					setState(186);
					match(Close);
					}
				}

				setState(190);
				match(CloseP);
				setState(191);
				match(Dot);
				}
			}

			setState(194);
			match(End_of_list);
			setState(195);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Log_stateContext extends ParserRuleContext {
		public TerminalNode Satisfiable() { return getToken(SpassParser.Satisfiable, 0); }
		public TerminalNode Unsatisfiable() { return getToken(SpassParser.Unsatisfiable, 0); }
		public TerminalNode Unknown() { return getToken(SpassParser.Unknown, 0); }
		public Log_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterLog_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitLog_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitLog_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log_stateContext log_state() throws RecognitionException {
		Log_stateContext _localctx = new Log_stateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_log_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Satisfiable - 68)) | (1L << (Unknown - 68)) | (1L << (Unsatisfiable - 68)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_partContext extends ParserRuleContext {
		public Symbol_listContext symbol_list() {
			return getRuleContext(Symbol_listContext.class,0);
		}
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public List<Formula_listContext> formula_list() {
			return getRuleContexts(Formula_listContext.class);
		}
		public Formula_listContext formula_list(int i) {
			return getRuleContext(Formula_listContext.class,i);
		}
		public List<Clause_listContext> clause_list() {
			return getRuleContexts(Clause_listContext.class);
		}
		public Clause_listContext clause_list(int i) {
			return getRuleContext(Clause_listContext.class,i);
		}
		public List<Proof_listContext> proof_list() {
			return getRuleContexts(Proof_listContext.class);
		}
		public Proof_listContext proof_list(int i) {
			return getRuleContext(Proof_listContext.class,i);
		}
		public Logical_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterLogical_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitLogical_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitLogical_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_partContext logical_part() throws RecognitionException {
		Logical_partContext _localctx = new Logical_partContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logical_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==List_of_symbols) {
				{
				setState(199);
				symbol_list();
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==List_of_declarations) {
				{
				setState(202);
				declaration_list();
				}
			}

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==List_of_formulae) {
				{
				{
				setState(205);
				formula_list();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==List_of_clauses) {
				{
				{
				setState(211);
				clause_list();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==List_of_proof) {
				{
				{
				setState(217);
				proof_list();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Symbol_listContext extends ParserRuleContext {
		public TerminalNode List_of_symbols() { return getToken(SpassParser.List_of_symbols, 0); }
		public List<TerminalNode> Dot() { return getTokens(SpassParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(SpassParser.Dot, i);
		}
		public TerminalNode End_of_list() { return getToken(SpassParser.End_of_list, 0); }
		public TerminalNode Functions() { return getToken(SpassParser.Functions, 0); }
		public List<TerminalNode> OpenB() { return getTokens(SpassParser.OpenB); }
		public TerminalNode OpenB(int i) {
			return getToken(SpassParser.OpenB, i);
		}
		public List<TerminalNode> CloseB() { return getTokens(SpassParser.CloseB); }
		public TerminalNode CloseB(int i) {
			return getToken(SpassParser.CloseB, i);
		}
		public TerminalNode Predicates() { return getToken(SpassParser.Predicates, 0); }
		public TerminalNode Sorts() { return getToken(SpassParser.Sorts, 0); }
		public List<Sort_symContext> sort_sym() {
			return getRuleContexts(Sort_symContext.class);
		}
		public Sort_symContext sort_sym(int i) {
			return getRuleContext(Sort_symContext.class,i);
		}
		public List<Fun_symContext> fun_sym() {
			return getRuleContexts(Fun_symContext.class);
		}
		public Fun_symContext fun_sym(int i) {
			return getRuleContext(Fun_symContext.class,i);
		}
		public List<TerminalNode> OpenP() { return getTokens(SpassParser.OpenP); }
		public TerminalNode OpenP(int i) {
			return getToken(SpassParser.OpenP, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public List<ArityContext> arity() {
			return getRuleContexts(ArityContext.class);
		}
		public ArityContext arity(int i) {
			return getRuleContext(ArityContext.class,i);
		}
		public List<TerminalNode> CloseP() { return getTokens(SpassParser.CloseP); }
		public TerminalNode CloseP(int i) {
			return getToken(SpassParser.CloseP, i);
		}
		public List<Pred_symContext> pred_sym() {
			return getRuleContexts(Pred_symContext.class);
		}
		public Pred_symContext pred_sym(int i) {
			return getRuleContext(Pred_symContext.class,i);
		}
		public Symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterSymbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitSymbol_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitSymbol_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Symbol_listContext symbol_list() throws RecognitionException {
		Symbol_listContext _localctx = new Symbol_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(List_of_symbols);
			setState(224);
			match(Dot);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Functions) {
				{
				setState(225);
				match(Functions);
				setState(226);
				match(OpenB);
				setState(234);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(227);
					fun_sym();
					}
					break;
				case OpenP:
					{
					setState(228);
					match(OpenP);
					setState(229);
					fun_sym();
					setState(230);
					match(Comma);
					setState(231);
					arity();
					setState(232);
					match(CloseP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(236);
					match(Comma);
					setState(244);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(237);
						fun_sym();
						}
						break;
					case OpenP:
						{
						setState(238);
						match(OpenP);
						setState(239);
						fun_sym();
						setState(240);
						match(Comma);
						setState(241);
						arity();
						setState(242);
						match(CloseP);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				match(CloseB);
				setState(252);
				match(Dot);
				}
			}

			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Predicates) {
				{
				setState(256);
				match(Predicates);
				setState(257);
				match(OpenB);
				setState(265);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(258);
					pred_sym();
					}
					break;
				case OpenP:
					{
					setState(259);
					match(OpenP);
					setState(260);
					pred_sym();
					setState(261);
					match(Comma);
					setState(262);
					arity();
					setState(263);
					match(CloseP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(267);
					match(Comma);
					setState(275);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(268);
						pred_sym();
						}
						break;
					case OpenP:
						{
						setState(269);
						match(OpenP);
						setState(270);
						pred_sym();
						setState(271);
						match(Comma);
						setState(272);
						arity();
						setState(273);
						match(CloseP);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(282);
				match(CloseB);
				setState(283);
				match(Dot);
				}
			}

			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Sorts) {
				{
				setState(287);
				match(Sorts);
				setState(288);
				match(OpenB);
				setState(289);
				sort_sym();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(290);
					match(Comma);
					setState(291);
					sort_sym();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
				match(CloseB);
				setState(298);
				match(Dot);
				}
			}

			setState(302);
			match(End_of_list);
			setState(303);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_listContext extends ParserRuleContext {
		public TerminalNode List_of_declarations() { return getToken(SpassParser.List_of_declarations, 0); }
		public List<TerminalNode> Dot() { return getTokens(SpassParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(SpassParser.Dot, i);
		}
		public TerminalNode End_of_list() { return getToken(SpassParser.End_of_list, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public Declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterDeclaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitDeclaration_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitDeclaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(List_of_declarations);
			setState(306);
			match(Dot);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << And) | (1L << Equal) | (1L << Equiv) | (1L << Exists) | (1L << False_) | (1L << Forall) | (1L << Implied) | (1L << Implies) | (1L << Not) | (1L << Or) | (1L << Predicate))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Sort - 73)) | (1L << (Subsort - 73)) | (1L << (True_ - 73)) | (1L << (Identifier - 73)))) != 0)) {
				{
				{
				setState(307);
				declaration();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(End_of_list);
			setState(314);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Subsort_declContext subsort_decl() {
			return getRuleContext(Subsort_declContext.class,0);
		}
		public Term_declContext term_decl() {
			return getRuleContext(Term_declContext.class,0);
		}
		public Pred_declContext pred_decl() {
			return getRuleContext(Pred_declContext.class,0);
		}
		public Gen_declContext gen_decl() {
			return getRuleContext(Gen_declContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Subsort:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				subsort_decl();
				}
				break;
			case And:
			case Equal:
			case Equiv:
			case Exists:
			case False_:
			case Forall:
			case Implied:
			case Implies:
			case Not:
			case Or:
			case True_:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				term_decl();
				}
				break;
			case Predicate:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				pred_decl();
				}
				break;
			case Sort:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				gen_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Gen_declContext extends ParserRuleContext {
		public TerminalNode Sort() { return getToken(SpassParser.Sort, 0); }
		public Sort_symContext sort_sym() {
			return getRuleContext(Sort_symContext.class,0);
		}
		public TerminalNode Generated_by() { return getToken(SpassParser.Generated_by, 0); }
		public Func_listContext func_list() {
			return getRuleContext(Func_listContext.class,0);
		}
		public TerminalNode Dot() { return getToken(SpassParser.Dot, 0); }
		public TerminalNode Freely() { return getToken(SpassParser.Freely, 0); }
		public Gen_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterGen_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitGen_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitGen_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gen_declContext gen_decl() throws RecognitionException {
		Gen_declContext _localctx = new Gen_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_gen_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(Sort);
			setState(323);
			sort_sym();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Freely) {
				{
				setState(324);
				match(Freely);
				}
			}

			setState(327);
			match(Generated_by);
			setState(328);
			func_list();
			setState(329);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_listContext extends ParserRuleContext {
		public TerminalNode OpenB() { return getToken(SpassParser.OpenB, 0); }
		public List<Fun_symContext> fun_sym() {
			return getRuleContexts(Fun_symContext.class);
		}
		public Fun_symContext fun_sym(int i) {
			return getRuleContext(Fun_symContext.class,i);
		}
		public TerminalNode CloseB() { return getToken(SpassParser.CloseB, 0); }
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public Func_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterFunc_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitFunc_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitFunc_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_listContext func_list() throws RecognitionException {
		Func_listContext _localctx = new Func_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(OpenB);
			setState(332);
			fun_sym();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(333);
				match(Comma);
				setState(334);
				fun_sym();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(CloseB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subsort_declContext extends ParserRuleContext {
		public TerminalNode Subsort() { return getToken(SpassParser.Subsort, 0); }
		public TerminalNode OpenP() { return getToken(SpassParser.OpenP, 0); }
		public List<Sort_symContext> sort_sym() {
			return getRuleContexts(Sort_symContext.class);
		}
		public Sort_symContext sort_sym(int i) {
			return getRuleContext(Sort_symContext.class,i);
		}
		public TerminalNode Comma() { return getToken(SpassParser.Comma, 0); }
		public TerminalNode CloseP() { return getToken(SpassParser.CloseP, 0); }
		public TerminalNode Dot() { return getToken(SpassParser.Dot, 0); }
		public Subsort_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsort_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterSubsort_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitSubsort_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitSubsort_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subsort_declContext subsort_decl() throws RecognitionException {
		Subsort_declContext _localctx = new Subsort_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subsort_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(Subsort);
			setState(343);
			match(OpenP);
			setState(344);
			sort_sym();
			setState(345);
			match(Comma);
			setState(346);
			sort_sym();
			setState(347);
			match(CloseP);
			setState(348);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Term_declContext extends ParserRuleContext {
		public TerminalNode Forall() { return getToken(SpassParser.Forall, 0); }
		public TerminalNode OpenP() { return getToken(SpassParser.OpenP, 0); }
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(SpassParser.Comma, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode CloseP() { return getToken(SpassParser.CloseP, 0); }
		public TerminalNode Dot() { return getToken(SpassParser.Dot, 0); }
		public Term_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterTerm_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitTerm_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitTerm_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_declContext term_decl() throws RecognitionException {
		Term_declContext _localctx = new Term_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term_decl);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(Forall);
				setState(351);
				match(OpenP);
				setState(352);
				term_list();
				setState(353);
				match(Comma);
				setState(354);
				term();
				setState(355);
				match(CloseP);
				setState(356);
				match(Dot);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				term();
				setState(359);
				match(Dot);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pred_declContext extends ParserRuleContext {
		public TerminalNode Predicate() { return getToken(SpassParser.Predicate, 0); }
		public TerminalNode OpenP() { return getToken(SpassParser.OpenP, 0); }
		public Pred_symContext pred_sym() {
			return getRuleContext(Pred_symContext.class,0);
		}
		public TerminalNode CloseP() { return getToken(SpassParser.CloseP, 0); }
		public TerminalNode Dot() { return getToken(SpassParser.Dot, 0); }
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public List<Sort_symContext> sort_sym() {
			return getRuleContexts(Sort_symContext.class);
		}
		public Sort_symContext sort_sym(int i) {
			return getRuleContext(Sort_symContext.class,i);
		}
		public Pred_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pred_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterPred_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitPred_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitPred_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pred_declContext pred_decl() throws RecognitionException {
		Pred_declContext _localctx = new Pred_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pred_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(Predicate);
			setState(364);
			match(OpenP);
			setState(365);
			pred_sym();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(366);
				match(Comma);
				setState(367);
				sort_sym();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			setState(372);
			match(CloseP);
			setState(373);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sort_symContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Sort_symContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_sym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterSort_sym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitSort_sym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitSort_sym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_symContext sort_sym() throws RecognitionException {
		Sort_symContext _localctx = new Sort_symContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sort_sym);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pred_symContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Pred_symContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pred_sym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterPred_sym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitPred_sym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitPred_sym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pred_symContext pred_sym() throws RecognitionException {
		Pred_symContext _localctx = new Pred_symContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pred_sym);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_symContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Fun_symContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_sym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterFun_sym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitFun_sym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitFun_sym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_symContext fun_sym() throws RecognitionException {
		Fun_symContext _localctx = new Fun_symContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fun_sym);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formula_listContext extends ParserRuleContext {
		public TerminalNode List_of_formulae() { return getToken(SpassParser.List_of_formulae, 0); }
		public List<TerminalNode> OpenP() { return getTokens(SpassParser.OpenP); }
		public TerminalNode OpenP(int i) {
			return getToken(SpassParser.OpenP, i);
		}
		public Origin_typeContext origin_type() {
			return getRuleContext(Origin_typeContext.class,0);
		}
		public List<TerminalNode> CloseP() { return getTokens(SpassParser.CloseP); }
		public TerminalNode CloseP(int i) {
			return getToken(SpassParser.CloseP, i);
		}
		public List<TerminalNode> Dot() { return getTokens(SpassParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(SpassParser.Dot, i);
		}
		public TerminalNode End_of_list() { return getToken(SpassParser.End_of_list, 0); }
		public List<TerminalNode> Formula() { return getTokens(SpassParser.Formula); }
		public TerminalNode Formula(int i) {
			return getToken(SpassParser.Formula, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public Formula_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterFormula_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitFormula_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitFormula_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formula_listContext formula_list() throws RecognitionException {
		Formula_listContext _localctx = new Formula_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_formula_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(List_of_formulae);
			setState(382);
			match(OpenP);
			setState(383);
			origin_type();
			setState(384);
			match(CloseP);
			setState(385);
			match(Dot);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Formula) {
				{
				{
				setState(386);
				match(Formula);
				setState(387);
				match(OpenP);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << And) | (1L << Equal) | (1L << Equiv) | (1L << Exists) | (1L << False_) | (1L << Forall) | (1L << Implied) | (1L << Implies) | (1L << Not) | (1L << Or))) != 0) || _la==True_ || _la==Identifier) {
					{
					setState(388);
					term();
					}
				}

				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(391);
					match(Comma);
					setState(392);
					label();
					}
				}

				setState(395);
				match(CloseP);
				setState(396);
				match(Dot);
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(End_of_list);
			setState(403);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Origin_typeContext extends ParserRuleContext {
		public TerminalNode Axioms() { return getToken(SpassParser.Axioms, 0); }
		public TerminalNode Conjectures() { return getToken(SpassParser.Conjectures, 0); }
		public Origin_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterOrigin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitOrigin_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitOrigin_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Origin_typeContext origin_type() throws RecognitionException {
		Origin_typeContext _localctx = new Origin_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_origin_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !(_la==Axioms || _la==Conjectures) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_label);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				identifier();
				}
				break;
			case Digit:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Quant_symContext quant_sym() {
			return getRuleContext(Quant_symContext.class,0);
		}
		public TerminalNode OpenP() { return getToken(SpassParser.OpenP, 0); }
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode CloseP() { return getToken(SpassParser.CloseP, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				quant_sym();
				setState(412);
				match(OpenP);
				setState(413);
				term_list();
				setState(414);
				match(Comma);
				setState(415);
				term();
				setState(416);
				match(CloseP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				symbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				symbol();
				setState(420);
				match(OpenP);
				setState(421);
				term();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(422);
					match(Comma);
					setState(423);
					term();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(429);
				match(CloseP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Term_listContext extends ParserRuleContext {
		public TerminalNode OpenB() { return getToken(SpassParser.OpenB, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode CloseB() { return getToken(SpassParser.CloseB, 0); }
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public Term_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterTerm_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitTerm_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitTerm_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_listContext term_list() throws RecognitionException {
		Term_listContext _localctx = new Term_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(OpenB);
			setState(434);
			term();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(435);
				match(Comma);
				setState(436);
				term();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
			match(CloseB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quant_symContext extends ParserRuleContext {
		public TerminalNode Forall() { return getToken(SpassParser.Forall, 0); }
		public TerminalNode Exists() { return getToken(SpassParser.Exists, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Quant_symContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quant_sym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterQuant_sym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitQuant_sym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitQuant_sym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quant_symContext quant_sym() throws RecognitionException {
		Quant_symContext _localctx = new Quant_symContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_quant_sym);
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Forall:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(Forall);
				}
				break;
			case Exists:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(Exists);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(SpassParser.Equal, 0); }
		public TerminalNode True_() { return getToken(SpassParser.True_, 0); }
		public TerminalNode False_() { return getToken(SpassParser.False_, 0); }
		public TerminalNode Or() { return getToken(SpassParser.Or, 0); }
		public TerminalNode And() { return getToken(SpassParser.And, 0); }
		public TerminalNode Not() { return getToken(SpassParser.Not, 0); }
		public TerminalNode Implies() { return getToken(SpassParser.Implies, 0); }
		public TerminalNode Implied() { return getToken(SpassParser.Implied, 0); }
		public TerminalNode Equiv() { return getToken(SpassParser.Equiv, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_symbol);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(Equal);
				}
				break;
			case True_:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(True_);
				}
				break;
			case False_:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				match(False_);
				}
				break;
			case Or:
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
				match(Or);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 5);
				{
				setState(453);
				match(And);
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 6);
				{
				setState(454);
				match(Not);
				}
				break;
			case Implies:
				enterOuterAlt(_localctx, 7);
				{
				setState(455);
				match(Implies);
				}
				break;
			case Implied:
				enterOuterAlt(_localctx, 8);
				{
				setState(456);
				match(Implied);
				}
				break;
			case Equiv:
				enterOuterAlt(_localctx, 9);
				{
				setState(457);
				match(Equiv);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 10);
				{
				setState(458);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Clause_listContext extends ParserRuleContext {
		public TerminalNode List_of_clauses() { return getToken(SpassParser.List_of_clauses, 0); }
		public List<TerminalNode> OpenP() { return getTokens(SpassParser.OpenP); }
		public TerminalNode OpenP(int i) {
			return getToken(SpassParser.OpenP, i);
		}
		public Origin_typeContext origin_type() {
			return getRuleContext(Origin_typeContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public Clause_typeContext clause_type() {
			return getRuleContext(Clause_typeContext.class,0);
		}
		public List<TerminalNode> CloseP() { return getTokens(SpassParser.CloseP); }
		public TerminalNode CloseP(int i) {
			return getToken(SpassParser.CloseP, i);
		}
		public List<TerminalNode> Dot() { return getTokens(SpassParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(SpassParser.Dot, i);
		}
		public TerminalNode End_of_list() { return getToken(SpassParser.End_of_list, 0); }
		public List<TerminalNode> Clause() { return getTokens(SpassParser.Clause); }
		public TerminalNode Clause(int i) {
			return getToken(SpassParser.Clause, i);
		}
		public List<Cnf_clauseContext> cnf_clause() {
			return getRuleContexts(Cnf_clauseContext.class);
		}
		public Cnf_clauseContext cnf_clause(int i) {
			return getRuleContext(Cnf_clauseContext.class,i);
		}
		public List<Dnf_clauseContext> dnf_clause() {
			return getRuleContexts(Dnf_clauseContext.class);
		}
		public Dnf_clauseContext dnf_clause(int i) {
			return getRuleContext(Dnf_clauseContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public Clause_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterClause_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitClause_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitClause_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clause_listContext clause_list() throws RecognitionException {
		Clause_listContext _localctx = new Clause_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_clause_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(List_of_clauses);
			setState(462);
			match(OpenP);
			setState(463);
			origin_type();
			setState(464);
			match(Comma);
			setState(465);
			clause_type();
			setState(466);
			match(CloseP);
			setState(467);
			match(Dot);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Clause) {
				{
				{
				setState(468);
				match(Clause);
				setState(469);
				match(OpenP);
				setState(472);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Forall:
				case Or:
					{
					setState(470);
					cnf_clause();
					}
					break;
				case And:
				case Exists:
					{
					setState(471);
					dnf_clause();
					}
					break;
				case CloseP:
				case Comma:
					break;
				default:
					break;
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(474);
					match(Comma);
					setState(475);
					label();
					}
				}

				setState(478);
				match(CloseP);
				setState(479);
				match(Dot);
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			match(End_of_list);
			setState(486);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Clause_typeContext extends ParserRuleContext {
		public TerminalNode Cnf() { return getToken(SpassParser.Cnf, 0); }
		public TerminalNode Dnf() { return getToken(SpassParser.Dnf, 0); }
		public Clause_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterClause_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitClause_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitClause_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clause_typeContext clause_type() throws RecognitionException {
		Clause_typeContext _localctx = new Clause_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_clause_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_la = _input.LA(1);
			if ( !(_la==Cnf || _la==Dnf) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cnf_clauseContext extends ParserRuleContext {
		public TerminalNode Forall() { return getToken(SpassParser.Forall, 0); }
		public TerminalNode OpenP() { return getToken(SpassParser.OpenP, 0); }
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(SpassParser.Comma, 0); }
		public Cnf_clause_bodyContext cnf_clause_body() {
			return getRuleContext(Cnf_clause_bodyContext.class,0);
		}
		public TerminalNode CloseP() { return getToken(SpassParser.CloseP, 0); }
		public Cnf_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterCnf_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitCnf_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitCnf_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cnf_clauseContext cnf_clause() throws RecognitionException {
		Cnf_clauseContext _localctx = new Cnf_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cnf_clause);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Forall:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(Forall);
				setState(491);
				match(OpenP);
				setState(492);
				term_list();
				setState(493);
				match(Comma);
				setState(494);
				cnf_clause_body();
				setState(495);
				match(CloseP);
				}
				break;
			case Or:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				cnf_clause_body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dnf_clauseContext extends ParserRuleContext {
		public TerminalNode Exists() { return getToken(SpassParser.Exists, 0); }
		public TerminalNode OpenP() { return getToken(SpassParser.OpenP, 0); }
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(SpassParser.Comma, 0); }
		public Dnf_clause_bodyContext dnf_clause_body() {
			return getRuleContext(Dnf_clause_bodyContext.class,0);
		}
		public TerminalNode CloseP() { return getToken(SpassParser.CloseP, 0); }
		public Dnf_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dnf_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterDnf_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitDnf_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitDnf_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dnf_clauseContext dnf_clause() throws RecognitionException {
		Dnf_clauseContext _localctx = new Dnf_clauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dnf_clause);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Exists:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(Exists);
				setState(501);
				match(OpenP);
				setState(502);
				term_list();
				setState(503);
				match(Comma);
				setState(504);
				dnf_clause_body();
				setState(505);
				match(CloseP);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				dnf_clause_body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cnf_clause_bodyContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(SpassParser.Or, 0); }
		public TerminalNode OpenP() { return getToken(SpassParser.OpenP, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode CloseP() { return getToken(SpassParser.CloseP, 0); }
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public Cnf_clause_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_clause_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterCnf_clause_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitCnf_clause_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitCnf_clause_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cnf_clause_bodyContext cnf_clause_body() throws RecognitionException {
		Cnf_clause_bodyContext _localctx = new Cnf_clause_bodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cnf_clause_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(Or);
			setState(511);
			match(OpenP);
			setState(512);
			term();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(513);
				match(Comma);
				setState(514);
				term();
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
			match(CloseP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dnf_clause_bodyContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(SpassParser.And, 0); }
		public TerminalNode OpenP() { return getToken(SpassParser.OpenP, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode CloseP() { return getToken(SpassParser.CloseP, 0); }
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public Dnf_clause_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dnf_clause_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterDnf_clause_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitDnf_clause_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitDnf_clause_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dnf_clause_bodyContext dnf_clause_body() throws RecognitionException {
		Dnf_clause_bodyContext _localctx = new Dnf_clause_bodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dnf_clause_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(And);
			setState(523);
			match(OpenP);
			setState(524);
			term();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(525);
				match(Comma);
				setState(526);
				term();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(532);
			match(CloseP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proof_listContext extends ParserRuleContext {
		public TerminalNode List_of_proof() { return getToken(SpassParser.List_of_proof, 0); }
		public List<TerminalNode> Dot() { return getTokens(SpassParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(SpassParser.Dot, i);
		}
		public TerminalNode End_of_list() { return getToken(SpassParser.End_of_list, 0); }
		public List<TerminalNode> OpenP() { return getTokens(SpassParser.OpenP); }
		public TerminalNode OpenP(int i) {
			return getToken(SpassParser.OpenP, i);
		}
		public Proof_typeContext proof_type() {
			return getRuleContext(Proof_typeContext.class,0);
		}
		public List<TerminalNode> CloseP() { return getTokens(SpassParser.CloseP); }
		public TerminalNode CloseP(int i) {
			return getToken(SpassParser.CloseP, i);
		}
		public List<TerminalNode> Step() { return getTokens(SpassParser.Step); }
		public TerminalNode Step(int i) {
			return getToken(SpassParser.Step, i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public List<ResultContext> result() {
			return getRuleContexts(ResultContext.class);
		}
		public ResultContext result(int i) {
			return getRuleContext(ResultContext.class,i);
		}
		public List<Rule_applContext> rule_appl() {
			return getRuleContexts(Rule_applContext.class);
		}
		public Rule_applContext rule_appl(int i) {
			return getRuleContext(Rule_applContext.class,i);
		}
		public List<Parent_listContext> parent_list() {
			return getRuleContexts(Parent_listContext.class);
		}
		public Parent_listContext parent_list(int i) {
			return getRuleContext(Parent_listContext.class,i);
		}
		public List<Assoc_listContext> assoc_list() {
			return getRuleContexts(Assoc_listContext.class);
		}
		public Assoc_listContext assoc_list(int i) {
			return getRuleContext(Assoc_listContext.class,i);
		}
		public Proof_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proof_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterProof_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitProof_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitProof_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proof_listContext proof_list() throws RecognitionException {
		Proof_listContext _localctx = new Proof_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_proof_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(List_of_proof);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenP) {
				{
				setState(535);
				match(OpenP);
				setState(536);
				proof_type();
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(537);
					match(Comma);
					setState(538);
					assoc_list();
					}
				}

				setState(541);
				match(CloseP);
				}
			}

			setState(545);
			match(Dot);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Step) {
				{
				{
				setState(546);
				match(Step);
				setState(547);
				match(OpenP);
				setState(548);
				reference();
				setState(549);
				match(Comma);
				setState(550);
				result();
				setState(551);
				match(Comma);
				setState(552);
				rule_appl();
				setState(553);
				match(Comma);
				setState(554);
				parent_list();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(555);
					match(Comma);
					setState(556);
					assoc_list();
					}
				}

				setState(559);
				match(CloseP);
				setState(560);
				match(Dot);
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			match(End_of_list);
			setState(568);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public User_referenceContext user_reference() {
			return getRuleContext(User_referenceContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_reference);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				user_reference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public User_resultContext user_result() {
			return getRuleContext(User_resultContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_result);
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				user_result();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rule_applContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public User_rule_applContext user_rule_appl() {
			return getRuleContext(User_rule_applContext.class,0);
		}
		public Rule_applContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_appl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterRule_appl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitRule_appl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitRule_appl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_applContext rule_appl() throws RecognitionException {
		Rule_applContext _localctx = new Rule_applContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_rule_appl);
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				user_rule_appl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parent_listContext extends ParserRuleContext {
		public TerminalNode OpenB() { return getToken(SpassParser.OpenB, 0); }
		public List<Parent_Context> parent_() {
			return getRuleContexts(Parent_Context.class);
		}
		public Parent_Context parent_(int i) {
			return getRuleContext(Parent_Context.class,i);
		}
		public TerminalNode CloseB() { return getToken(SpassParser.CloseB, 0); }
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public Parent_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterParent_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitParent_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitParent_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parent_listContext parent_list() throws RecognitionException {
		Parent_listContext _localctx = new Parent_listContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(OpenB);
			setState(585);
			parent_();
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(586);
				match(Comma);
				setState(587);
				parent_();
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593);
			match(CloseB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parent_Context extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public User_parentContext user_parent() {
			return getRuleContext(User_parentContext.class,0);
		}
		public Parent_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterParent_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitParent_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitParent_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parent_Context parent_() throws RecognitionException {
		Parent_Context _localctx = new Parent_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_parent_);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
				user_parent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assoc_listContext extends ParserRuleContext {
		public TerminalNode OpenB() { return getToken(SpassParser.OpenB, 0); }
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(SpassParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(SpassParser.Colon, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode CloseB() { return getToken(SpassParser.CloseB, 0); }
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public Assoc_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assoc_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterAssoc_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitAssoc_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitAssoc_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assoc_listContext assoc_list() throws RecognitionException {
		Assoc_listContext _localctx = new Assoc_listContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assoc_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(OpenB);
			setState(601);
			key();
			setState(602);
			match(Colon);
			setState(603);
			value();
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(604);
				match(Comma);
				setState(605);
				key();
				setState(606);
				match(Colon);
				setState(607);
				value();
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
			match(CloseB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public User_keyContext user_key() {
			return getRuleContext(User_keyContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_key);
		try {
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				user_key();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public User_valueContext user_value() {
			return getRuleContext(User_valueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_value);
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(623);
				user_value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proof_typeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public User_proof_typeContext user_proof_type() {
			return getRuleContext(User_proof_typeContext.class,0);
		}
		public Proof_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proof_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterProof_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitProof_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitProof_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proof_typeContext proof_type() throws RecognitionException {
		Proof_typeContext _localctx = new Proof_typeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_proof_type);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				identifier();
				}
				break;
			case SPASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				user_proof_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_referenceContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public User_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterUser_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitUser_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitUser_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_referenceContext user_reference() throws RecognitionException {
		User_referenceContext _localctx = new User_referenceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_user_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_resultContext extends ParserRuleContext {
		public Cnf_clauseContext cnf_clause() {
			return getRuleContext(Cnf_clauseContext.class,0);
		}
		public User_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterUser_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitUser_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitUser_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_resultContext user_result() throws RecognitionException {
		User_resultContext _localctx = new User_resultContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_user_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			cnf_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_rule_applContext extends ParserRuleContext {
		public TerminalNode GeR() { return getToken(SpassParser.GeR, 0); }
		public TerminalNode SpL() { return getToken(SpassParser.SpL, 0); }
		public TerminalNode SpR() { return getToken(SpassParser.SpR, 0); }
		public TerminalNode EqF() { return getToken(SpassParser.EqF, 0); }
		public TerminalNode Rew() { return getToken(SpassParser.Rew, 0); }
		public TerminalNode Obv() { return getToken(SpassParser.Obv, 0); }
		public TerminalNode EmS() { return getToken(SpassParser.EmS, 0); }
		public TerminalNode SoR() { return getToken(SpassParser.SoR, 0); }
		public TerminalNode EqR() { return getToken(SpassParser.EqR, 0); }
		public TerminalNode MPm() { return getToken(SpassParser.MPm, 0); }
		public TerminalNode SPm() { return getToken(SpassParser.SPm, 0); }
		public TerminalNode OPm() { return getToken(SpassParser.OPm, 0); }
		public TerminalNode SHy() { return getToken(SpassParser.SHy, 0); }
		public TerminalNode OHy() { return getToken(SpassParser.OHy, 0); }
		public TerminalNode URR() { return getToken(SpassParser.URR, 0); }
		public TerminalNode Fac() { return getToken(SpassParser.Fac, 0); }
		public TerminalNode Spt() { return getToken(SpassParser.Spt, 0); }
		public TerminalNode Inp() { return getToken(SpassParser.Inp, 0); }
		public TerminalNode Con() { return getToken(SpassParser.Con, 0); }
		public TerminalNode RRE() { return getToken(SpassParser.RRE, 0); }
		public TerminalNode SSi() { return getToken(SpassParser.SSi, 0); }
		public TerminalNode ClR() { return getToken(SpassParser.ClR, 0); }
		public TerminalNode UnC() { return getToken(SpassParser.UnC, 0); }
		public TerminalNode Ter() { return getToken(SpassParser.Ter, 0); }
		public User_rule_applContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_rule_appl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterUser_rule_appl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitUser_rule_appl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitUser_rule_appl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_rule_applContext user_rule_appl() throws RecognitionException {
		User_rule_applContext _localctx = new User_rule_applContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_user_rule_appl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ClR) | (1L << Con) | (1L << EmS) | (1L << EqF) | (1L << EqR) | (1L << Fac) | (1L << GeR) | (1L << Inp) | (1L << MPm) | (1L << Obv) | (1L << OHy) | (1L << OPm))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Rew - 66)) | (1L << (RRE - 66)) | (1L << (SHy - 66)) | (1L << (SoR - 66)) | (1L << (SpL - 66)) | (1L << (SPm - 66)) | (1L << (SpR - 66)) | (1L << (Spt - 66)) | (1L << (SSi - 66)) | (1L << (Ter - 66)) | (1L << (UnC - 66)) | (1L << (URR - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_parentContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public User_parentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_parent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterUser_parent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitUser_parent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitUser_parent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_parentContext user_parent() throws RecognitionException {
		User_parentContext _localctx = new User_parentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_user_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_proof_typeContext extends ParserRuleContext {
		public TerminalNode SPASS() { return getToken(SpassParser.SPASS, 0); }
		public User_proof_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_proof_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterUser_proof_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitUser_proof_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitUser_proof_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_proof_typeContext user_proof_type() throws RecognitionException {
		User_proof_typeContext _localctx = new User_proof_typeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_user_proof_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(SPASS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_keyContext extends ParserRuleContext {
		public TerminalNode Splitlevel() { return getToken(SpassParser.Splitlevel, 0); }
		public User_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterUser_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitUser_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitUser_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_keyContext user_key() throws RecognitionException {
		User_keyContext _localctx = new User_keyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_user_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(Splitlevel);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_valueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public User_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterUser_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitUser_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitUser_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final User_valueContext user_value() throws RecognitionException {
		User_valueContext _localctx = new User_valueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_user_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingsContext extends ParserRuleContext {
		public TerminalNode List_of_general_settings() { return getToken(SpassParser.List_of_general_settings, 0); }
		public TerminalNode End_of_list() { return getToken(SpassParser.End_of_list, 0); }
		public List<TerminalNode> Dot() { return getTokens(SpassParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(SpassParser.Dot, i);
		}
		public List<Setting_entryContext> setting_entry() {
			return getRuleContexts(Setting_entryContext.class);
		}
		public Setting_entryContext setting_entry(int i) {
			return getRuleContext(Setting_entryContext.class,i);
		}
		public TerminalNode List_of_settings() { return getToken(SpassParser.List_of_settings, 0); }
		public TerminalNode OpenP() { return getToken(SpassParser.OpenP, 0); }
		public Setting_labelContext setting_label() {
			return getRuleContext(Setting_labelContext.class,0);
		}
		public TerminalNode CloseP() { return getToken(SpassParser.CloseP, 0); }
		public TerminalNode Open() { return getToken(SpassParser.Open, 0); }
		public Text_Context text_() {
			return getRuleContext(Text_Context.class,0);
		}
		public TerminalNode Close() { return getToken(SpassParser.Close, 0); }
		public SettingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterSettings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitSettings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitSettings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SettingsContext settings() throws RecognitionException {
		SettingsContext _localctx = new SettingsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_settings);
		int _la;
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case List_of_general_settings:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				match(List_of_general_settings);
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(645);
					setting_entry();
					}
					}
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Hypothesis );
				setState(650);
				match(End_of_list);
				setState(651);
				match(Dot);
				}
				break;
			case List_of_settings:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				match(List_of_settings);
				setState(654);
				match(OpenP);
				setState(655);
				setting_label();
				setState(656);
				match(CloseP);
				setState(657);
				match(Dot);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Open) {
					{
					setState(658);
					match(Open);
					setState(659);
					text_();
					setState(660);
					match(Close);
					}
				}

				setState(664);
				match(End_of_list);
				setState(665);
				match(Dot);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setting_entryContext extends ParserRuleContext {
		public TerminalNode Hypothesis() { return getToken(SpassParser.Hypothesis, 0); }
		public TerminalNode OpenB() { return getToken(SpassParser.OpenB, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode CloseB() { return getToken(SpassParser.CloseB, 0); }
		public TerminalNode Dot() { return getToken(SpassParser.Dot, 0); }
		public List<TerminalNode> Comma() { return getTokens(SpassParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SpassParser.Comma, i);
		}
		public Setting_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setting_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterSetting_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitSetting_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitSetting_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setting_entryContext setting_entry() throws RecognitionException {
		Setting_entryContext _localctx = new Setting_entryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_setting_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(Hypothesis);
			setState(670);
			match(OpenB);
			setState(671);
			label();
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(672);
				match(Comma);
				setState(673);
				label();
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			match(CloseB);
			setState(680);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setting_labelContext extends ParserRuleContext {
		public TerminalNode KIV() { return getToken(SpassParser.KIV, 0); }
		public TerminalNode LEM() { return getToken(SpassParser.LEM, 0); }
		public TerminalNode OTTER() { return getToken(SpassParser.OTTER, 0); }
		public TerminalNode PROTEIN() { return getToken(SpassParser.PROTEIN, 0); }
		public TerminalNode SATURATE() { return getToken(SpassParser.SATURATE, 0); }
		public TerminalNode ThreeTAP() { return getToken(SpassParser.ThreeTAP, 0); }
		public TerminalNode SETHEO() { return getToken(SpassParser.SETHEO, 0); }
		public TerminalNode SPASS() { return getToken(SpassParser.SPASS, 0); }
		public Setting_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setting_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterSetting_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitSetting_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitSetting_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setting_labelContext setting_label() throws RecognitionException {
		Setting_labelContext _localctx = new Setting_labelContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_setting_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			_la = _input.LA(1);
			if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (KIV - 40)) | (1L << (LEM - 40)) | (1L << (OTTER - 40)) | (1L << (PROTEIN - 40)) | (1L << (SATURATE - 40)) | (1L << (SETHEO - 40)) | (1L << (SPASS - 40)) | (1L << (ThreeTAP - 40)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SpassParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArityContext extends ParserRuleContext {
		public TerminalNode MOne() { return getToken(SpassParser.MOne, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ArityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterArity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitArity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitArity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArityContext arity() throws RecognitionException {
		ArityContext _localctx = new ArityContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arity);
		try {
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOne:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				match(MOne);
				}
				break;
			case Digit:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(SpassParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(SpassParser.Digit, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(690);
				match(Digit);
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Digit );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Text_Context extends ParserRuleContext {
		public TerminalNode JustText() { return getToken(SpassParser.JustText, 0); }
		public Text_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).enterText_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpassParserListener ) ((SpassParserListener)listener).exitText_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpassParserVisitor ) return ((SpassParserVisitor<? extends T>)visitor).visitText_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_Context text_() throws RecognitionException {
		Text_Context _localctx = new Text_Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_text_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(JustText);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3e\u02bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2s\n\2\f\2\16\2v\13\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0084\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u008e\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\u0098\n\3\3\3\3\3\5\3\u009c\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a4"+
		"\n\3\3\3\3\3\5\3\u00a8\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\u00b5\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00bf\n\3\3\3\3\3\5"+
		"\3\u00c3\n\3\3\3\3\3\3\3\3\4\3\4\3\5\5\5\u00cb\n\5\3\5\5\5\u00ce\n\5\3"+
		"\5\7\5\u00d1\n\5\f\5\16\5\u00d4\13\5\3\5\7\5\u00d7\n\5\f\5\16\5\u00da"+
		"\13\5\3\5\7\5\u00dd\n\5\f\5\16\5\u00e0\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u00ed\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00f7"+
		"\n\6\7\6\u00f9\n\6\f\6\16\6\u00fc\13\6\3\6\3\6\3\6\5\6\u0101\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u010c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0116\n\6\7\6\u0118\n\6\f\6\16\6\u011b\13\6\3\6\3\6\3\6\5\6"+
		"\u0120\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u0127\n\6\f\6\16\6\u012a\13\6\3\6\3"+
		"\6\3\6\5\6\u012f\n\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0137\n\7\f\7\16\7\u013a"+
		"\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0143\n\b\3\t\3\t\3\t\5\t\u0148"+
		"\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0152\n\n\f\n\16\n\u0155\13\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u016c\n\f\3\r\3\r\3\r\3\r\3\r\6\r\u0173\n\r"+
		"\r\r\16\r\u0174\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u0188\n\21\3\21\3\21\5\21\u018c\n\21"+
		"\3\21\3\21\7\21\u0190\n\21\f\21\16\21\u0193\13\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\5\23\u019c\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u01ab\n\24\f\24\16\24\u01ae\13\24\3\24"+
		"\3\24\5\24\u01b2\n\24\3\25\3\25\3\25\3\25\7\25\u01b8\n\25\f\25\16\25\u01bb"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\5\26\u01c2\n\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u01ce\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01db\n\30\3\30\3\30\5\30\u01df\n"+
		"\30\3\30\3\30\7\30\u01e3\n\30\f\30\16\30\u01e6\13\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01f5\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01ff\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\7\34\u0206\n\34\f\34\16\34\u0209\13\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u0212\n\35\f\35\16\35\u0215\13\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u021e\n\36\3\36\3\36\5\36\u0222\n\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0230\n\36\3\36"+
		"\3\36\3\36\7\36\u0235\n\36\f\36\16\36\u0238\13\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\5\37\u0240\n\37\3 \3 \5 \u0244\n \3!\3!\3!\5!\u0249\n!\3\""+
		"\3\"\3\"\3\"\7\"\u024f\n\"\f\"\16\"\u0252\13\"\3\"\3\"\3#\3#\3#\5#\u0259"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0264\n$\f$\16$\u0267\13$\3$\3$\3%\3"+
		"%\3%\5%\u026e\n%\3&\3&\3&\5&\u0273\n&\3\'\3\'\5\'\u0277\n\'\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\6/\u0289\n/\r/\16/\u028a\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0299\n/\3/\3/\3/\5/\u029e\n/\3\60\3\60"+
		"\3\60\3\60\3\60\7\60\u02a5\n\60\f\60\16\60\u02a8\13\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\5\63\u02b3\n\63\3\64\6\64\u02b6\n\64\r"+
		"\64\16\64\u02b7\3\65\3\65\3\65\2\2\66\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\7\4\2FF[\\\4\2"+
		"\6\6\21\21\4\2\r\r\24\24\23\2\f\f\20\20\26\26\31\32\36\36%%))\66\669:"+
		">>DEIJNNPSWWZZ]]\b\2*+@@CCGHMMXX\2\u02db\2j\3\2\2\2\4{\3\2\2\2\6\u00c7"+
		"\3\2\2\2\b\u00ca\3\2\2\2\n\u00e1\3\2\2\2\f\u0133\3\2\2\2\16\u0142\3\2"+
		"\2\2\20\u0144\3\2\2\2\22\u014d\3\2\2\2\24\u0158\3\2\2\2\26\u016b\3\2\2"+
		"\2\30\u016d\3\2\2\2\32\u0179\3\2\2\2\34\u017b\3\2\2\2\36\u017d\3\2\2\2"+
		" \u017f\3\2\2\2\"\u0197\3\2\2\2$\u019b\3\2\2\2&\u01b1\3\2\2\2(\u01b3\3"+
		"\2\2\2*\u01c1\3\2\2\2,\u01cd\3\2\2\2.\u01cf\3\2\2\2\60\u01ea\3\2\2\2\62"+
		"\u01f4\3\2\2\2\64\u01fe\3\2\2\2\66\u0200\3\2\2\28\u020c\3\2\2\2:\u0218"+
		"\3\2\2\2<\u023f\3\2\2\2>\u0243\3\2\2\2@\u0248\3\2\2\2B\u024a\3\2\2\2D"+
		"\u0258\3\2\2\2F\u025a\3\2\2\2H\u026d\3\2\2\2J\u0272\3\2\2\2L\u0276\3\2"+
		"\2\2N\u0278\3\2\2\2P\u027a\3\2\2\2R\u027c\3\2\2\2T\u027e\3\2\2\2V\u0280"+
		"\3\2\2\2X\u0282\3\2\2\2Z\u0284\3\2\2\2\\\u029d\3\2\2\2^\u029f\3\2\2\2"+
		"`\u02ac\3\2\2\2b\u02ae\3\2\2\2d\u02b2\3\2\2\2f\u02b5\3\2\2\2h\u02b9\3"+
		"\2\2\2jk\7\7\2\2kl\7=\2\2lm\5b\62\2mn\7\13\2\2no\7\25\2\2op\5\4\3\2pt"+
		"\5\b\5\2qs\5\\/\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt"+
		"\3\2\2\2wx\7\30\2\2xy\7\25\2\2yz\7\2\2\3z\3\3\2\2\2{|\7.\2\2|}\7\25\2"+
		"\2}~\7\67\2\2~\u0083\7=\2\2\177\u0080\7`\2\2\u0080\u0081\5h\65\2\u0081"+
		"\u0082\7d\2\2\u0082\u0084\3\2\2\2\u0083\177\3\2\2\2\u0083\u0084\3\2\2"+
		"\2\u0084\u0085\3\2\2\2\u0085\u0086\7\13\2\2\u0086\u0087\7\25\2\2\u0087"+
		"\u0088\7\5\2\2\u0088\u008d\7=\2\2\u0089\u008a\7`\2\2\u008a\u008b\5h\65"+
		"\2\u008b\u008c\7d\2\2\u008c\u008e\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u009b\7\25\2\2"+
		"\u0091\u0092\7^\2\2\u0092\u0097\7=\2\2\u0093\u0094\7`\2\2\u0094\u0095"+
		"\5h\65\2\u0095\u0096\7d\2\2\u0096\u0098\3\2\2\2\u0097\u0093\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\13\2\2\u009a\u009c\7"+
		"\25\2\2\u009b\u0091\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a7\3\2\2\2\u009d"+
		"\u009e\7\64\2\2\u009e\u00a3\7=\2\2\u009f\u00a0\7`\2\2\u00a0\u00a1\5h\65"+
		"\2\u00a1\u00a2\7d\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\13\2\2\u00a6\u00a8\7\25\2\2"+
		"\u00a7\u009d\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa"+
		"\7T\2\2\u00aa\u00ab\7=\2\2\u00ab\u00ac\5\6\4\2\u00ac\u00ad\7\13\2\2\u00ad"+
		"\u00ae\7\25\2\2\u00ae\u00af\7\23\2\2\u00af\u00b4\7=\2\2\u00b0\u00b1\7"+
		"`\2\2\u00b1\u00b2\5h\65\2\u00b2\u00b3\7d\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b0\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\13"+
		"\2\2\u00b7\u00c2\7\25\2\2\u00b8\u00b9\7\22\2\2\u00b9\u00be\7=\2\2\u00ba"+
		"\u00bb\7`\2\2\u00bb\u00bc\5h\65\2\u00bc\u00bd\7d\2\2\u00bd\u00bf\3\2\2"+
		"\2\u00be\u00ba\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\7\13\2\2\u00c1\u00c3\7\25\2\2\u00c2\u00b8\3\2\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\27\2\2\u00c5\u00c6\7\25\2\2\u00c6\5"+
		"\3\2\2\2\u00c7\u00c8\t\2\2\2\u00c8\7\3\2\2\2\u00c9\u00cb\5\n\6\2\u00ca"+
		"\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\5\f"+
		"\7\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d2\3\2\2\2\u00cf"+
		"\u00d1\5 \21\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d7\5.\30\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00de\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dd\5:\36\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\t\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2"+
		"\7\63\2\2\u00e2\u0100\7\25\2\2\u00e3\u00e4\7#\2\2\u00e4\u00ec\7;\2\2\u00e5"+
		"\u00ed\5\36\20\2\u00e6\u00e7\7=\2\2\u00e7\u00e8\5\36\20\2\u00e8\u00e9"+
		"\7\17\2\2\u00e9\u00ea\5d\63\2\u00ea\u00eb\7\13\2\2\u00eb\u00ed\3\2\2\2"+
		"\u00ec\u00e5\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ed\u00fa\3\2\2\2\u00ee\u00f6"+
		"\7\17\2\2\u00ef\u00f7\5\36\20\2\u00f0\u00f1\7=\2\2\u00f1\u00f2\5\36\20"+
		"\2\u00f2\u00f3\7\17\2\2\u00f3\u00f4\5d\63\2\u00f4\u00f5\7\13\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00ee\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\t"+
		"\2\2\u00fe\u00ff\7\25\2\2\u00ff\u0101\3\2\2\2\u0100\u00e3\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u011f\3\2\2\2\u0102\u0103\7B\2\2\u0103\u010b\7;\2"+
		"\2\u0104\u010c\5\34\17\2\u0105\u0106\7=\2\2\u0106\u0107\5\34\17\2\u0107"+
		"\u0108\7\17\2\2\u0108\u0109\5d\63\2\u0109\u010a\7\13\2\2\u010a\u010c\3"+
		"\2\2\2\u010b\u0104\3\2\2\2\u010b\u0105\3\2\2\2\u010c\u0119\3\2\2\2\u010d"+
		"\u0115\7\17\2\2\u010e\u0116\5\34\17\2\u010f\u0110\7=\2\2\u0110\u0111\5"+
		"\34\17\2\u0111\u0112\7\17\2\2\u0112\u0113\5d\63\2\u0113\u0114\7\13\2\2"+
		"\u0114\u0116\3\2\2\2\u0115\u010e\3\2\2\2\u0115\u010f\3\2\2\2\u0116\u0118"+
		"\3\2\2\2\u0117\u010d\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\t"+
		"\2\2\u011d\u011e\7\25\2\2\u011e\u0120\3\2\2\2\u011f\u0102\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u012e\3\2\2\2\u0121\u0122\7L\2\2\u0122\u0123\7;\2"+
		"\2\u0123\u0128\5\32\16\2\u0124\u0125\7\17\2\2\u0125\u0127\5\32\16\2\u0126"+
		"\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7\t\2\2\u012c"+
		"\u012d\7\25\2\2\u012d\u012f\3\2\2\2\u012e\u0121\3\2\2\2\u012e\u012f\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\27\2\2\u0131\u0132\7\25\2\2\u0132"+
		"\13\3\2\2\2\u0133\u0134\7-\2\2\u0134\u0138\7\25\2\2\u0135\u0137\5\16\b"+
		"\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\27\2\2"+
		"\u013c\u013d\7\25\2\2\u013d\r\3\2\2\2\u013e\u0143\5\24\13\2\u013f\u0143"+
		"\5\26\f\2\u0140\u0143\5\30\r\2\u0141\u0143\5\20\t\2\u0142\u013e\3\2\2"+
		"\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\17"+
		"\3\2\2\2\u0144\u0145\7K\2\2\u0145\u0147\5\32\16\2\u0146\u0148\7\"\2\2"+
		"\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a"+
		"\7$\2\2\u014a\u014b\5\22\n\2\u014b\u014c\7\25\2\2\u014c\21\3\2\2\2\u014d"+
		"\u014e\7;\2\2\u014e\u0153\5\36\20\2\u014f\u0150\7\17\2\2\u0150\u0152\5"+
		"\36\20\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7\t"+
		"\2\2\u0157\23\3\2\2\2\u0158\u0159\7V\2\2\u0159\u015a\7=\2\2\u015a\u015b"+
		"\5\32\16\2\u015b\u015c\7\17\2\2\u015c\u015d\5\32\16\2\u015d\u015e\7\13"+
		"\2\2\u015e\u015f\7\25\2\2\u015f\25\3\2\2\2\u0160\u0161\7 \2\2\u0161\u0162"+
		"\7=\2\2\u0162\u0163\5(\25\2\u0163\u0164\7\17\2\2\u0164\u0165\5&\24\2\u0165"+
		"\u0166\7\13\2\2\u0166\u0167\7\25\2\2\u0167\u016c\3\2\2\2\u0168\u0169\5"+
		"&\24\2\u0169\u016a\7\25\2\2\u016a\u016c\3\2\2\2\u016b\u0160\3\2\2\2\u016b"+
		"\u0168\3\2\2\2\u016c\27\3\2\2\2\u016d\u016e\7A\2\2\u016e\u016f\7=\2\2"+
		"\u016f\u0172\5\34\17\2\u0170\u0171\7\17\2\2\u0171\u0173\5\32\16\2\u0172"+
		"\u0170\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7\13\2\2\u0177\u0178\7\25\2\2\u0178"+
		"\31\3\2\2\2\u0179\u017a\5b\62\2\u017a\33\3\2\2\2\u017b\u017c\5b\62\2\u017c"+
		"\35\3\2\2\2\u017d\u017e\5b\62\2\u017e\37\3\2\2\2\u017f\u0180\7/\2\2\u0180"+
		"\u0181\7=\2\2\u0181\u0182\5\"\22\2\u0182\u0183\7\13\2\2\u0183\u0191\7"+
		"\25\2\2\u0184\u0185\7!\2\2\u0185\u0187\7=\2\2\u0186\u0188\5&\24\2\u0187"+
		"\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u018a\7\17"+
		"\2\2\u018a\u018c\5$\23\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\7\13\2\2\u018e\u0190\7\25\2\2\u018f\u0184\3"+
		"\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7\27\2\2\u0195\u0196\7"+
		"\25\2\2\u0196!\3\2\2\2\u0197\u0198\t\3\2\2\u0198#\3\2\2\2\u0199\u019c"+
		"\5b\62\2\u019a\u019c\5f\64\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c"+
		"%\3\2\2\2\u019d\u019e\5*\26\2\u019e\u019f\7=\2\2\u019f\u01a0\5(\25\2\u01a0"+
		"\u01a1\7\17\2\2\u01a1\u01a2\5&\24\2\u01a2\u01a3\7\13\2\2\u01a3\u01b2\3"+
		"\2\2\2\u01a4\u01b2\5,\27\2\u01a5\u01a6\5,\27\2\u01a6\u01a7\7=\2\2\u01a7"+
		"\u01ac\5&\24\2\u01a8\u01a9\7\17\2\2\u01a9\u01ab\5&\24\2\u01aa\u01a8\3"+
		"\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\7\13\2\2\u01b0\u01b2\3"+
		"\2\2\2\u01b1\u019d\3\2\2\2\u01b1\u01a4\3\2\2\2\u01b1\u01a5\3\2\2\2\u01b2"+
		"\'\3\2\2\2\u01b3\u01b4\7;\2\2\u01b4\u01b9\5&\24\2\u01b5\u01b6\7\17\2\2"+
		"\u01b6\u01b8\5&\24\2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01bd\7\t\2\2\u01bd)\3\2\2\2\u01be\u01c2\7 \2\2\u01bf\u01c2\7\35\2\2"+
		"\u01c0\u01c2\5b\62\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0"+
		"\3\2\2\2\u01c2+\3\2\2\2\u01c3\u01ce\7\33\2\2\u01c4\u01ce\7Y\2\2\u01c5"+
		"\u01ce\7\37\2\2\u01c6\u01ce\7?\2\2\u01c7\u01ce\7\4\2\2\u01c8\u01ce\78"+
		"\2\2\u01c9\u01ce\7(\2\2\u01ca\u01ce\7\'\2\2\u01cb\u01ce\7\34\2\2\u01cc"+
		"\u01ce\5b\62\2\u01cd\u01c3\3\2\2\2\u01cd\u01c4\3\2\2\2\u01cd\u01c5\3\2"+
		"\2\2\u01cd\u01c6\3\2\2\2\u01cd\u01c7\3\2\2\2\u01cd\u01c8\3\2\2\2\u01cd"+
		"\u01c9\3\2\2\2\u01cd\u01ca\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2"+
		"\2\2\u01ce-\3\2\2\2\u01cf\u01d0\7,\2\2\u01d0\u01d1\7=\2\2\u01d1\u01d2"+
		"\5\"\22\2\u01d2\u01d3\7\17\2\2\u01d3\u01d4\5\60\31\2\u01d4\u01d5\7\13"+
		"\2\2\u01d5\u01e4\7\25\2\2\u01d6\u01d7\7\b\2\2\u01d7\u01da\7=\2\2\u01d8"+
		"\u01db\5\62\32\2\u01d9\u01db\5\64\33\2\u01da\u01d8\3\2\2\2\u01da\u01d9"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01dd\7\17\2\2"+
		"\u01dd\u01df\5$\23\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e1\7\13\2\2\u01e1\u01e3\7\25\2\2\u01e2\u01d6\3\2\2\2"+
		"\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7"+
		"\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\7\27\2\2\u01e8\u01e9\7\25\2\2"+
		"\u01e9/\3\2\2\2\u01ea\u01eb\t\4\2\2\u01eb\61\3\2\2\2\u01ec\u01ed\7 \2"+
		"\2\u01ed\u01ee\7=\2\2\u01ee\u01ef\5(\25\2\u01ef\u01f0\7\17\2\2\u01f0\u01f1"+
		"\5\66\34\2\u01f1\u01f2\7\13\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f5\5\66\34"+
		"\2\u01f4\u01ec\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\63\3\2\2\2\u01f6\u01f7"+
		"\7\35\2\2\u01f7\u01f8\7=\2\2\u01f8\u01f9\5(\25\2\u01f9\u01fa\7\17\2\2"+
		"\u01fa\u01fb\58\35\2\u01fb\u01fc\7\13\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01ff"+
		"\58\35\2\u01fe\u01f6\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\65\3\2\2\2\u0200"+
		"\u0201\7?\2\2\u0201\u0202\7=\2\2\u0202\u0207\5&\24\2\u0203\u0204\7\17"+
		"\2\2\u0204\u0206\5&\24\2\u0205\u0203\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u020a\u020b\7\13\2\2\u020b\67\3\2\2\2\u020c\u020d\7\4\2\2\u020d\u020e"+
		"\7=\2\2\u020e\u0213\5&\24\2\u020f\u0210\7\17\2\2\u0210\u0212\5&\24\2\u0211"+
		"\u020f\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\7\13\2\2\u0217"+
		"9\3\2\2\2\u0218\u0221\7\61\2\2\u0219\u021a\7=\2\2\u021a\u021d\5L\'\2\u021b"+
		"\u021c\7\17\2\2\u021c\u021e\5F$\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021f\u0220\7\13\2\2\u0220\u0222\3\2\2\2\u0221"+
		"\u0219\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0236\7\25"+
		"\2\2\u0224\u0225\7U\2\2\u0225\u0226\7=\2\2\u0226\u0227\5<\37\2\u0227\u0228"+
		"\7\17\2\2\u0228\u0229\5> \2\u0229\u022a\7\17\2\2\u022a\u022b\5@!\2\u022b"+
		"\u022c\7\17\2\2\u022c\u022f\5B\"\2\u022d\u022e\7\17\2\2\u022e\u0230\5"+
		"F$\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0232\7\13\2\2\u0232\u0233\7\25\2\2\u0233\u0235\3\2\2\2\u0234\u0224\3"+
		"\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\7\27\2\2\u023a\u023b\7"+
		"\25\2\2\u023b;\3\2\2\2\u023c\u0240\5&\24\2\u023d\u0240\5b\62\2\u023e\u0240"+
		"\5N(\2\u023f\u023c\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240"+
		"=\3\2\2\2\u0241\u0244\5&\24\2\u0242\u0244\5P)\2\u0243\u0241\3\2\2\2\u0243"+
		"\u0242\3\2\2\2\u0244?\3\2\2\2\u0245\u0249\5&\24\2\u0246\u0249\5b\62\2"+
		"\u0247\u0249\5R*\2\u0248\u0245\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0247"+
		"\3\2\2\2\u0249A\3\2\2\2\u024a\u024b\7;\2\2\u024b\u0250\5D#\2\u024c\u024d"+
		"\7\17\2\2\u024d\u024f\5D#\2\u024e\u024c\3\2\2\2\u024f\u0252\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0250\3\2"+
		"\2\2\u0253\u0254\7\t\2\2\u0254C\3\2\2\2\u0255\u0259\5&\24\2\u0256\u0259"+
		"\5b\62\2\u0257\u0259\5T+\2\u0258\u0255\3\2\2\2\u0258\u0256\3\2\2\2\u0258"+
		"\u0257\3\2\2\2\u0259E\3\2\2\2\u025a\u025b\7;\2\2\u025b\u025c\5H%\2\u025c"+
		"\u025d\7\16\2\2\u025d\u0265\5J&\2\u025e\u025f\7\17\2\2\u025f\u0260\5H"+
		"%\2\u0260\u0261\7\16\2\2\u0261\u0262\5J&\2\u0262\u0264\3\2\2\2\u0263\u025e"+
		"\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269\7\t\2\2\u0269G\3\2\2\2"+
		"\u026a\u026e\5&\24\2\u026b\u026e\5b\62\2\u026c\u026e\5X-\2\u026d\u026a"+
		"\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026c\3\2\2\2\u026eI\3\2\2\2\u026f"+
		"\u0273\5&\24\2\u0270\u0273\5b\62\2\u0271\u0273\5Z.\2\u0272\u026f\3\2\2"+
		"\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273K\3\2\2\2\u0274\u0277"+
		"\5b\62\2\u0275\u0277\5V,\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277"+
		"M\3\2\2\2\u0278\u0279\5f\64\2\u0279O\3\2\2\2\u027a\u027b\5\62\32\2\u027b"+
		"Q\3\2\2\2\u027c\u027d\t\5\2\2\u027dS\3\2\2\2\u027e\u027f\5f\64\2\u027f"+
		"U\3\2\2\2\u0280\u0281\7M\2\2\u0281W\3\2\2\2\u0282\u0283\7O\2\2\u0283Y"+
		"\3\2\2\2\u0284\u0285\5f\64\2\u0285[\3\2\2\2\u0286\u0288\7\60\2\2\u0287"+
		"\u0289\5^\60\2\u0288\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u0288\3\2"+
		"\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\7\27\2\2\u028d"+
		"\u028e\7\25\2\2\u028e\u029e\3\2\2\2\u028f\u0290\7\62\2\2\u0290\u0291\7"+
		"=\2\2\u0291\u0292\5`\61\2\u0292\u0293\7\13\2\2\u0293\u0298\7\25\2\2\u0294"+
		"\u0295\7`\2\2\u0295\u0296\5h\65\2\u0296\u0297\7d\2\2\u0297\u0299\3\2\2"+
		"\2\u0298\u0294\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b"+
		"\7\27\2\2\u029b\u029c\7\25\2\2\u029c\u029e\3\2\2\2\u029d\u0286\3\2\2\2"+
		"\u029d\u028f\3\2\2\2\u029e]\3\2\2\2\u029f\u02a0\7&\2\2\u02a0\u02a1\7;"+
		"\2\2\u02a1\u02a6\5$\23\2\u02a2\u02a3\7\17\2\2\u02a3\u02a5\5$\23\2\u02a4"+
		"\u02a2\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2"+
		"\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\7\t\2\2\u02aa"+
		"\u02ab\7\25\2\2\u02ab_\3\2\2\2\u02ac\u02ad\t\6\2\2\u02ada\3\2\2\2\u02ae"+
		"\u02af\7a\2\2\u02afc\3\2\2\2\u02b0\u02b3\7\65\2\2\u02b1\u02b3\5f\64\2"+
		"\u02b2\u02b0\3\2\2\2\u02b2\u02b1\3\2\2\2\u02b3e\3\2\2\2\u02b4\u02b6\7"+
		"c\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8g\3\2\2\2\u02b9\u02ba\7e\2\2\u02bai\3\2\2\2Dt\u0083"+
		"\u008d\u0097\u009b\u00a3\u00a7\u00b4\u00be\u00c2\u00ca\u00cd\u00d2\u00d8"+
		"\u00de\u00ec\u00f6\u00fa\u0100\u010b\u0115\u0119\u011f\u0128\u012e\u0138"+
		"\u0142\u0147\u0153\u016b\u0174\u0187\u018b\u0191\u019b\u01ac\u01b1\u01b9"+
		"\u01c1\u01cd\u01da\u01de\u01e4\u01f4\u01fe\u0207\u0213\u021d\u0221\u022f"+
		"\u0236\u023f\u0243\u0248\u0250\u0258\u0265\u026d\u0272\u0276\u028a\u0298"+
		"\u029d\u02a6\u02b2\u02b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
