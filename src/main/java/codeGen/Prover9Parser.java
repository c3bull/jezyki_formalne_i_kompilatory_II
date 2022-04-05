// Generated from C:/projects/SpassAndProver9/src/grammar\Prover9.g4 by ANTLR 4.9.2
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
public class Prover9Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17,
		FORMULAS=18, END_OF_LIST=19, ASSUMPLTIONS=20, GOALS=21, TRUE=22, FALSE=23,
		LPAREN=24, RPAREN=25, DOT=26, COMMA=27, NOT=28, OR=29, AND=30, IMPL=31,
		BIMPL=32, BIDIR=33, FORALL=34, EXISTS=35, TEXT=36, WS=37, LINE_COMMENT=38;
	public static final int
		RULE_start_problem = 0, RULE_formulas = 1, RULE_asumptions = 2, RULE_goals = 3,
		RULE_stat = 4, RULE_clause = 5, RULE_predicate = 6, RULE_formula = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_problem", "formulas", "asumptions", "goals", "stat", "clause",
			"predicate", "formula"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'positive'", "'negative'", "'mixed'", "'unit'", "'horn'", "'definite'",
			"'has_equality'", "'true'", "'false'", "'initial'", "'resolvent'", "'hyper_resolvent'",
			"'ur_resolvent'", "'factor'", "'subsumer'", "'back_demodulant'", "'paramodulant'",
			"'formulas'", "'end_of_list'", "'assumptions'", "'goals'", "'$T'", "'$F'",
			"'('", "')'", "'.'", "','", "'-'", "'|'", "'&'", "'->'", "'<-'", "'<->'",
			"'all'", "'exists'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, "FORMULAS", "END_OF_LIST", "ASSUMPLTIONS",
			"GOALS", "TRUE", "FALSE", "LPAREN", "RPAREN", "DOT", "COMMA", "NOT",
			"OR", "AND", "IMPL", "BIMPL", "BIDIR", "FORALL", "EXISTS", "TEXT", "WS",
			"LINE_COMMENT"
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
	public String getGrammarFileName() { return "Prover9.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Prover9Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Start_problemContext extends ParserRuleContext {
		public FormulasContext formulas() {
			return getRuleContext(FormulasContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Prover9Parser.EOF, 0); }
		public Start_problemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_problem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterStart_problem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitStart_problem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitStart_problem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_problemContext start_problem() throws RecognitionException {
		Start_problemContext _localctx = new Start_problemContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_problem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			formulas();
			setState(17);
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

	public static class FormulasContext extends ParserRuleContext {
		public AsumptionsContext asumptions() {
			return getRuleContext(AsumptionsContext.class,0);
		}
		public GoalsContext goals() {
			return getRuleContext(GoalsContext.class,0);
		}
		public FormulasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterFormulas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitFormulas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitFormulas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulasContext formulas() throws RecognitionException {
		FormulasContext _localctx = new FormulasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formulas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			asumptions();
			setState(20);
			goals();
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

	public static class AsumptionsContext extends ParserRuleContext {
		public TerminalNode FORMULAS() { return getToken(Prover9Parser.FORMULAS, 0); }
		public TerminalNode LPAREN() { return getToken(Prover9Parser.LPAREN, 0); }
		public TerminalNode ASSUMPLTIONS() { return getToken(Prover9Parser.ASSUMPLTIONS, 0); }
		public TerminalNode RPAREN() { return getToken(Prover9Parser.RPAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(Prover9Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Prover9Parser.DOT, i);
		}
		public TerminalNode END_OF_LIST() { return getToken(Prover9Parser.END_OF_LIST, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public AsumptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asumptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterAsumptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitAsumptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitAsumptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsumptionsContext asumptions() throws RecognitionException {
		AsumptionsContext _localctx = new AsumptionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asumptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(FORMULAS);
			setState(23);
			match(LPAREN);
			setState(24);
			match(ASSUMPLTIONS);
			setState(25);
			match(RPAREN);
			setState(26);
			match(DOT);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << LPAREN) | (1L << NOT) | (1L << FORALL) | (1L << EXISTS) | (1L << TEXT))) != 0)) {
				{
				{
				setState(27);
				stat();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(END_OF_LIST);
			setState(34);
			match(DOT);
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

	public static class GoalsContext extends ParserRuleContext {
		public TerminalNode FORMULAS() { return getToken(Prover9Parser.FORMULAS, 0); }
		public TerminalNode LPAREN() { return getToken(Prover9Parser.LPAREN, 0); }
		public TerminalNode GOALS() { return getToken(Prover9Parser.GOALS, 0); }
		public TerminalNode RPAREN() { return getToken(Prover9Parser.RPAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(Prover9Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Prover9Parser.DOT, i);
		}
		public TerminalNode END_OF_LIST() { return getToken(Prover9Parser.END_OF_LIST, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public GoalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterGoals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitGoals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitGoals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalsContext goals() throws RecognitionException {
		GoalsContext _localctx = new GoalsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_goals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(FORMULAS);
			setState(37);
			match(LPAREN);
			setState(38);
			match(GOALS);
			setState(39);
			match(RPAREN);
			setState(40);
			match(DOT);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << LPAREN) | (1L << NOT) | (1L << FORALL) | (1L << EXISTS) | (1L << TEXT))) != 0)) {
				{
				{
				setState(41);
				stat();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(END_OF_LIST);
			setState(48);
			match(DOT);
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

	public static class StatContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Prover9Parser.DOT, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			formula(0);
			setState(51);
			match(DOT);
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

	public static class ClauseContext extends ParserRuleContext {
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class PredicateContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(Prover9Parser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(Prover9Parser.TEXT, i);
		}
		public TerminalNode LPAREN() { return getToken(Prover9Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Prover9Parser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Prover9Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Prover9Parser.COMMA, i);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predicate);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(TEXT);
				setState(56);
				match(LPAREN);
				setState(57);
				match(TEXT);
				setState(58);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(TEXT);
				setState(60);
				match(LPAREN);
				setState(61);
				match(TEXT);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(62);
					match(COMMA);
					setState(63);
					match(TEXT);
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				match(RPAREN);
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

	public static class FormulaContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Prover9Parser.LPAREN, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Prover9Parser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(Prover9Parser.NOT, 0); }
		public TerminalNode FORALL() { return getToken(Prover9Parser.FORALL, 0); }
		public TerminalNode TEXT() { return getToken(Prover9Parser.TEXT, 0); }
		public TerminalNode EXISTS() { return getToken(Prover9Parser.EXISTS, 0); }
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public TerminalNode OR() { return getToken(Prover9Parser.OR, 0); }
		public TerminalNode AND() { return getToken(Prover9Parser.AND, 0); }
		public TerminalNode IMPL() { return getToken(Prover9Parser.IMPL, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		return formula(0);
	}

	private FormulaContext formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormulaContext _localctx = new FormulaContext(_ctx, _parentState);
		FormulaContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(73);
				predicate();
				}
				break;
			case LPAREN:
				{
				setState(74);
				match(LPAREN);
				setState(75);
				formula(0);
				setState(76);
				match(RPAREN);
				}
				break;
			case NOT:
				{
				setState(78);
				match(NOT);
				setState(79);
				formula(7);
				}
				break;
			case FORALL:
				{
				setState(80);
				match(FORALL);
				setState(81);
				match(TEXT);
				setState(82);
				formula(3);
				}
				break;
			case EXISTS:
				{
				setState(83);
				match(EXISTS);
				setState(84);
				match(TEXT);
				setState(85);
				formula(2);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				{
				setState(86);
				clause();
				setState(87);
				formula(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FormulaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(91);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(92);
						match(OR);
						setState(93);
						formula(7);
						}
						break;
					case 2:
						{
						_localctx = new FormulaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(94);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(95);
						match(AND);
						setState(96);
						formula(6);
						}
						break;
					case 3:
						{
						_localctx = new FormulaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98);
						match(IMPL);
						setState(99);
						formula(5);
						}
						break;
					}
					}
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return formula_sempred((FormulaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean formula_sempred(FormulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(l\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bC\n\b\f\b\16\bF\13\b\3"+
		"\b\5\bI\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\\\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tg\n\t\f\t"+
		"\16\tj\13\t\3\t\2\3\20\n\2\4\6\b\n\f\16\20\2\3\3\2\3\23\2o\2\22\3\2\2"+
		"\2\4\25\3\2\2\2\6\30\3\2\2\2\b&\3\2\2\2\n\64\3\2\2\2\f\67\3\2\2\2\16H"+
		"\3\2\2\2\20[\3\2\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\3\3\2\2\2\25\26\5"+
		"\6\4\2\26\27\5\b\5\2\27\5\3\2\2\2\30\31\7\24\2\2\31\32\7\32\2\2\32\33"+
		"\7\26\2\2\33\34\7\33\2\2\34 \7\34\2\2\35\37\5\n\6\2\36\35\3\2\2\2\37\""+
		"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\25\2\2$%\7\34"+
		"\2\2%\7\3\2\2\2&\'\7\24\2\2\'(\7\32\2\2()\7\27\2\2)*\7\33\2\2*.\7\34\2"+
		"\2+-\5\n\6\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60"+
		".\3\2\2\2\61\62\7\25\2\2\62\63\7\34\2\2\63\t\3\2\2\2\64\65\5\20\t\2\65"+
		"\66\7\34\2\2\66\13\3\2\2\2\678\t\2\2\28\r\3\2\2\29:\7&\2\2:;\7\32\2\2"+
		";<\7&\2\2<I\7\33\2\2=>\7&\2\2>?\7\32\2\2?D\7&\2\2@A\7\35\2\2AC\7&\2\2"+
		"B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GI\7\33\2"+
		"\2H9\3\2\2\2H=\3\2\2\2I\17\3\2\2\2JK\b\t\1\2K\\\5\16\b\2LM\7\32\2\2MN"+
		"\5\20\t\2NO\7\33\2\2O\\\3\2\2\2PQ\7\36\2\2Q\\\5\20\t\tRS\7$\2\2ST\7&\2"+
		"\2T\\\5\20\t\5UV\7%\2\2VW\7&\2\2W\\\5\20\t\4XY\5\f\7\2YZ\5\20\t\3Z\\\3"+
		"\2\2\2[J\3\2\2\2[L\3\2\2\2[P\3\2\2\2[R\3\2\2\2[U\3\2\2\2[X\3\2\2\2\\h"+
		"\3\2\2\2]^\f\b\2\2^_\7\37\2\2_g\5\20\t\t`a\f\7\2\2ab\7 \2\2bg\5\20\t\b"+
		"cd\f\6\2\2de\7!\2\2eg\5\20\t\7f]\3\2\2\2f`\3\2\2\2fc\3\2\2\2gj\3\2\2\2"+
		"hf\3\2\2\2hi\3\2\2\2i\21\3\2\2\2jh\3\2\2\2\t .DH[fh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
