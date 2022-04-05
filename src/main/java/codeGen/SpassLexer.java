// Generated from C:/projects/SpassAndProver9/src/grammar\SpassLexer.g4 by ANTLR 4.9.2
package codeGen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpassLexer extends Lexer {
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
		TextMode=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TextMode"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Special_symbol", "And", "Author", "Axioms", "Begin_problem", "Clause",
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


	public SpassLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SpassLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2e\u036f\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\39\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?"+
		"\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H"+
		"\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M"+
		"\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\3Q"+
		"\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3V\3V\3V\3V\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Z"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3"+
		"\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3^\6^\u034c\n^\r^\16^\u034d\3^\3^\3"+
		"_\3_\3_\3_\3_\3`\3`\3`\3`\7`\u035b\n`\f`\16`\u035e\13`\3a\3a\3b\3b\3c"+
		"\3c\3c\3c\3c\3d\3d\3d\6d\u036c\nd\rd\16d\u036d\2\2e\4\3\6\4\b\5\n\6\f"+
		"\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24("+
		"\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<\37> @!B\"D#F$H%J&L\'"+
		"N(P)R*T+V,X-Z.\\/^\60`\61b\62d\63f\64h\65j\66l\67n8p9r:t;v<x=z>|?~@\u0080"+
		"A\u0082B\u0084C\u0086D\u0088E\u008aF\u008cG\u008eH\u0090I\u0092J\u0094"+
		"K\u0096L\u0098M\u009aN\u009cO\u009eP\u00a0Q\u00a2R\u00a4S\u00a6T\u00a8"+
		"U\u00aaV\u00acW\u00aeX\u00b0Y\u00b2Z\u00b4[\u00b6\\\u00b8]\u00ba^\u00bc"+
		"_\u00be`\u00c0a\u00c2b\u00c4c\u00c6d\u00c8e\4\2\3\6\5\2\13\f\17\17\"\""+
		"\4\2C\\c|\3\2,,\3\2\177\177\2\u0373\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2"+
		"\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24"+
		"\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2"+
		"\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2"+
		"\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3"+
		"\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2"+
		"\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2"+
		"P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3"+
		"\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2"+
		"\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2"+
		"v\3\2\2\2\2x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2"+
		"\2\u0082\3\2\2\2\2\u0084\3\2\2\2\2\u0086\3\2\2\2\2\u0088\3\2\2\2\2\u008a"+
		"\3\2\2\2\2\u008c\3\2\2\2\2\u008e\3\2\2\2\2\u0090\3\2\2\2\2\u0092\3\2\2"+
		"\2\2\u0094\3\2\2\2\2\u0096\3\2\2\2\2\u0098\3\2\2\2\2\u009a\3\2\2\2\2\u009c"+
		"\3\2\2\2\2\u009e\3\2\2\2\2\u00a0\3\2\2\2\2\u00a2\3\2\2\2\2\u00a4\3\2\2"+
		"\2\2\u00a6\3\2\2\2\2\u00a8\3\2\2\2\2\u00aa\3\2\2\2\2\u00ac\3\2\2\2\2\u00ae"+
		"\3\2\2\2\2\u00b0\3\2\2\2\2\u00b2\3\2\2\2\2\u00b4\3\2\2\2\2\u00b6\3\2\2"+
		"\2\2\u00b8\3\2\2\2\2\u00ba\3\2\2\2\2\u00bc\3\2\2\2\2\u00be\3\2\2\2\2\u00c0"+
		"\3\2\2\2\2\u00c2\3\2\2\2\2\u00c4\3\2\2\2\3\u00c6\3\2\2\2\3\u00c8\3\2\2"+
		"\2\4\u00ca\3\2\2\2\6\u00cc\3\2\2\2\b\u00d0\3\2\2\2\n\u00d7\3\2\2\2\f\u00de"+
		"\3\2\2\2\16\u00ec\3\2\2\2\20\u00f3\3\2\2\2\22\u00f5\3\2\2\2\24\u00f7\3"+
		"\2\2\2\26\u00f9\3\2\2\2\30\u00fd\3\2\2\2\32\u0101\3\2\2\2\34\u0103\3\2"+
		"\2\2\36\u0105\3\2\2\2 \u0109\3\2\2\2\"\u0115\3\2\2\2$\u011a\3\2\2\2&\u0126"+
		"\3\2\2\2(\u012a\3\2\2\2*\u012c\3\2\2\2,\u0130\3\2\2\2.\u013c\3\2\2\2\60"+
		"\u0148\3\2\2\2\62\u014c\3\2\2\2\64\u0150\3\2\2\2\66\u0156\3\2\2\28\u015c"+
		"\3\2\2\2:\u0163\3\2\2\2<\u0167\3\2\2\2>\u016d\3\2\2\2@\u0174\3\2\2\2B"+
		"\u017c\3\2\2\2D\u0183\3\2\2\2F\u018d\3\2\2\2H\u019a\3\2\2\2J\u019e\3\2"+
		"\2\2L\u01a9\3\2\2\2N\u01b1\3\2\2\2P\u01b9\3\2\2\2R\u01bd\3\2\2\2T\u01c1"+
		"\3\2\2\2V\u01c5\3\2\2\2X\u01d5\3\2\2\2Z\u01ea\3\2\2\2\\\u01ff\3\2\2\2"+
		"^\u0210\3\2\2\2`\u0229\3\2\2\2b\u0237\3\2\2\2d\u0248\3\2\2\2f\u0258\3"+
		"\2\2\2h\u025e\3\2\2\2j\u0261\3\2\2\2l\u0265\3\2\2\2n\u026a\3\2\2\2p\u026e"+
		"\3\2\2\2r\u0272\3\2\2\2t\u0276\3\2\2\2v\u0278\3\2\2\2x\u027a\3\2\2\2z"+
		"\u027c\3\2\2\2|\u0280\3\2\2\2~\u0283\3\2\2\2\u0080\u0289\3\2\2\2\u0082"+
		"\u0293\3\2\2\2\u0084\u029e\3\2\2\2\u0086\u02a6\3\2\2\2\u0088\u02aa\3\2"+
		"\2\2\u008a\u02ae\3\2\2\2\u008c\u02ba\3\2\2\2\u008e\u02c3\3\2\2\2\u0090"+
		"\u02ca\3\2\2\2\u0092\u02ce\3\2\2\2\u0094\u02d2\3\2\2\2\u0096\u02d7\3\2"+
		"\2\2\u0098\u02dd\3\2\2\2\u009a\u02e3\3\2\2\2\u009c\u02e7\3\2\2\2\u009e"+
		"\u02f2\3\2\2\2\u00a0\u02f6\3\2\2\2\u00a2\u02fa\3\2\2\2\u00a4\u02fe\3\2"+
		"\2\2\u00a6\u0302\3\2\2\2\u00a8\u0309\3\2\2\2\u00aa\u030e\3\2\2\2\u00ac"+
		"\u0316\3\2\2\2\u00ae\u031a\3\2\2\2\u00b0\u031f\3\2\2\2\u00b2\u0324\3\2"+
		"\2\2\u00b4\u0328\3\2\2\2\u00b6\u0330\3\2\2\2\u00b8\u033e\3\2\2\2\u00ba"+
		"\u0342\3\2\2\2\u00bc\u034b\3\2\2\2\u00be\u0351\3\2\2\2\u00c0\u0356\3\2"+
		"\2\2\u00c2\u035f\3\2\2\2\u00c4\u0361\3\2\2\2\u00c6\u0363\3\2\2\2\u00c8"+
		"\u036b\3\2\2\2\u00ca\u00cb\7/\2\2\u00cb\5\3\2\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\u00cf\7f\2\2\u00cf\7\3\2\2\2\u00d0\u00d1\7c\2\2\u00d1"+
		"\u00d2\7w\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5\7q\2\2"+
		"\u00d5\u00d6\7t\2\2\u00d6\t\3\2\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7z"+
		"\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd"+
		"\7u\2\2\u00dd\13\3\2\2\2\u00de\u00df\7d\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1"+
		"\7i\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7a\2\2\u00e4"+
		"\u00e5\7r\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7d\2\2"+
		"\u00e8\u00e9\7n\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7o\2\2\u00eb\r\3\2"+
		"\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0"+
		"\7w\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7g\2\2\u00f2\17\3\2\2\2\u00f3\u00f4"+
		"\7_\2\2\u00f4\21\3\2\2\2\u00f5\u00f6\7\177\2\2\u00f6\23\3\2\2\2\u00f7"+
		"\u00f8\7+\2\2\u00f8\25\3\2\2\2\u00f9\u00fa\7E\2\2\u00fa\u00fb\7n\2\2\u00fb"+
		"\u00fc\7T\2\2\u00fc\27\3\2\2\2\u00fd\u00fe\7e\2\2\u00fe\u00ff\7p\2\2\u00ff"+
		"\u0100\7h\2\2\u0100\31\3\2\2\2\u0101\u0102\7<\2\2\u0102\33\3\2\2\2\u0103"+
		"\u0104\7.\2\2\u0104\35\3\2\2\2\u0105\u0106\7E\2\2\u0106\u0107\7q\2\2\u0107"+
		"\u0108\7p\2\2\u0108\37\3\2\2\2\u0109\u010a\7e\2\2\u010a\u010b\7q\2\2\u010b"+
		"\u010c\7p\2\2\u010c\u010d\7l\2\2\u010d\u010e\7g\2\2\u010e\u010f\7e\2\2"+
		"\u010f\u0110\7v\2\2\u0110\u0111\7w\2\2\u0111\u0112\7t\2\2\u0112\u0113"+
		"\7g\2\2\u0113\u0114\7u\2\2\u0114!\3\2\2\2\u0115\u0116\7f\2\2\u0116\u0117"+
		"\7c\2\2\u0117\u0118\7v\2\2\u0118\u0119\7g\2\2\u0119#\3\2\2\2\u011a\u011b"+
		"\7f\2\2\u011b\u011c\7g\2\2\u011c\u011d\7u\2\2\u011d\u011e\7e\2\2\u011e"+
		"\u011f\7t\2\2\u011f\u0120\7k\2\2\u0120\u0121\7r\2\2\u0121\u0122\7v\2\2"+
		"\u0122\u0123\7k\2\2\u0123\u0124\7q\2\2\u0124\u0125\7p\2\2\u0125%\3\2\2"+
		"\2\u0126\u0127\7f\2\2\u0127\u0128\7p\2\2\u0128\u0129\7h\2\2\u0129\'\3"+
		"\2\2\2\u012a\u012b\7\60\2\2\u012b)\3\2\2\2\u012c\u012d\7G\2\2\u012d\u012e"+
		"\7o\2\2\u012e\u012f\7U\2\2\u012f+\3\2\2\2\u0130\u0131\7g\2\2\u0131\u0132"+
		"\7p\2\2\u0132\u0133\7f\2\2\u0133\u0134\7a\2\2\u0134\u0135\7q\2\2\u0135"+
		"\u0136\7h\2\2\u0136\u0137\7a\2\2\u0137\u0138\7n\2\2\u0138\u0139\7k\2\2"+
		"\u0139\u013a\7u\2\2\u013a\u013b\7v\2\2\u013b-\3\2\2\2\u013c\u013d\7g\2"+
		"\2\u013d\u013e\7p\2\2\u013e\u013f\7f\2\2\u013f\u0140\7a\2\2\u0140\u0141"+
		"\7r\2\2\u0141\u0142\7t\2\2\u0142\u0143\7q\2\2\u0143\u0144\7d\2\2\u0144"+
		"\u0145\7n\2\2\u0145\u0146\7g\2\2\u0146\u0147\7o\2\2\u0147/\3\2\2\2\u0148"+
		"\u0149\7G\2\2\u0149\u014a\7s\2\2\u014a\u014b\7H\2\2\u014b\61\3\2\2\2\u014c"+
		"\u014d\7G\2\2\u014d\u014e\7s\2\2\u014e\u014f\7T\2\2\u014f\63\3\2\2\2\u0150"+
		"\u0151\7g\2\2\u0151\u0152\7s\2\2\u0152\u0153\7w\2\2\u0153\u0154\7c\2\2"+
		"\u0154\u0155\7n\2\2\u0155\65\3\2\2\2\u0156\u0157\7g\2\2\u0157\u0158\7"+
		"s\2\2\u0158\u0159\7w\2\2\u0159\u015a\7k\2\2\u015a\u015b\7x\2\2\u015b\67"+
		"\3\2\2\2\u015c\u015d\7g\2\2\u015d\u015e\7z\2\2\u015e\u015f\7k\2\2\u015f"+
		"\u0160\7u\2\2\u0160\u0161\7v\2\2\u0161\u0162\7u\2\2\u01629\3\2\2\2\u0163"+
		"\u0164\7H\2\2\u0164\u0165\7c\2\2\u0165\u0166\7e\2\2\u0166;\3\2\2\2\u0167"+
		"\u0168\7h\2\2\u0168\u0169\7c\2\2\u0169\u016a\7n\2\2\u016a\u016b\7u\2\2"+
		"\u016b\u016c\7g\2\2\u016c=\3\2\2\2\u016d\u016e\7h\2\2\u016e\u016f\7q\2"+
		"\2\u016f\u0170\7t\2\2\u0170\u0171\7c\2\2\u0171\u0172\7n\2\2\u0172\u0173"+
		"\7n\2\2\u0173?\3\2\2\2\u0174\u0175\7h\2\2\u0175\u0176\7q\2\2\u0176\u0177"+
		"\7t\2\2\u0177\u0178\7o\2\2\u0178\u0179\7w\2\2\u0179\u017a\7n\2\2\u017a"+
		"\u017b\7c\2\2\u017bA\3\2\2\2\u017c\u017d\7h\2\2\u017d\u017e\7t\2\2\u017e"+
		"\u017f\7g\2\2\u017f\u0180\7g\2\2\u0180\u0181\7n\2\2\u0181\u0182\7{\2\2"+
		"\u0182C\3\2\2\2\u0183\u0184\7h\2\2\u0184\u0185\7w\2\2\u0185\u0186\7p\2"+
		"\2\u0186\u0187\7e\2\2\u0187\u0188\7v\2\2\u0188\u0189\7k\2\2\u0189\u018a"+
		"\7q\2\2\u018a\u018b\7p\2\2\u018b\u018c\7u\2\2\u018cE\3\2\2\2\u018d\u018e"+
		"\7i\2\2\u018e\u018f\7g\2\2\u018f\u0190\7p\2\2\u0190\u0191\7g\2\2\u0191"+
		"\u0192\7t\2\2\u0192\u0193\7c\2\2\u0193\u0194\7v\2\2\u0194\u0195\7g\2\2"+
		"\u0195\u0196\7f\2\2\u0196\u0197\7a\2\2\u0197\u0198\7d\2\2\u0198\u0199"+
		"\7{\2\2\u0199G\3\2\2\2\u019a\u019b\7I\2\2\u019b\u019c\7g\2\2\u019c\u019d"+
		"\7T\2\2\u019dI\3\2\2\2\u019e\u019f\7j\2\2\u019f\u01a0\7{\2\2\u01a0\u01a1"+
		"\7r\2\2\u01a1\u01a2\7q\2\2\u01a2\u01a3\7v\2\2\u01a3\u01a4\7j\2\2\u01a4"+
		"\u01a5\7g\2\2\u01a5\u01a6\7u\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7u\2\2"+
		"\u01a8K\3\2\2\2\u01a9\u01aa\7k\2\2\u01aa\u01ab\7o\2\2\u01ab\u01ac\7r\2"+
		"\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af\7g\2\2\u01af\u01b0"+
		"\7f\2\2\u01b0M\3\2\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3\7o\2\2\u01b3\u01b4"+
		"\7r\2\2\u01b4\u01b5\7n\2\2\u01b5\u01b6\7k\2\2\u01b6\u01b7\7g\2\2\u01b7"+
		"\u01b8\7u\2\2\u01b8O\3\2\2\2\u01b9\u01ba\7K\2\2\u01ba\u01bb\7p\2\2\u01bb"+
		"\u01bc\7r\2\2\u01bcQ\3\2\2\2\u01bd\u01be\7M\2\2\u01be\u01bf\7K\2\2\u01bf"+
		"\u01c0\7X\2\2\u01c0S\3\2\2\2\u01c1\u01c2\7N\2\2\u01c2\u01c3\7G\2\2\u01c3"+
		"\u01c4\7O\2\2\u01c4U\3\2\2\2\u01c5\u01c6\7n\2\2\u01c6\u01c7\7k\2\2\u01c7"+
		"\u01c8\7u\2\2\u01c8\u01c9\7v\2\2\u01c9\u01ca\7a\2\2\u01ca\u01cb\7q\2\2"+
		"\u01cb\u01cc\7h\2\2\u01cc\u01cd\7a\2\2\u01cd\u01ce\7e\2\2\u01ce\u01cf"+
		"\7n\2\2\u01cf\u01d0\7c\2\2\u01d0\u01d1\7w\2\2\u01d1\u01d2\7u\2\2\u01d2"+
		"\u01d3\7g\2\2\u01d3\u01d4\7u\2\2\u01d4W\3\2\2\2\u01d5\u01d6\7n\2\2\u01d6"+
		"\u01d7\7k\2\2\u01d7\u01d8\7u\2\2\u01d8\u01d9\7v\2\2\u01d9\u01da\7a\2\2"+
		"\u01da\u01db\7q\2\2\u01db\u01dc\7h\2\2\u01dc\u01dd\7a\2\2\u01dd\u01de"+
		"\7f\2\2\u01de\u01df\7g\2\2\u01df\u01e0\7e\2\2\u01e0\u01e1\7n\2\2\u01e1"+
		"\u01e2\7c\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4\7c\2\2\u01e4\u01e5\7v\2\2"+
		"\u01e5\u01e6\7k\2\2\u01e6\u01e7\7q\2\2\u01e7\u01e8\7p\2\2\u01e8\u01e9"+
		"\7u\2\2\u01e9Y\3\2\2\2\u01ea\u01eb\7n\2\2\u01eb\u01ec\7k\2\2\u01ec\u01ed"+
		"\7u\2\2\u01ed\u01ee\7v\2\2\u01ee\u01ef\7a\2\2\u01ef\u01f0\7q\2\2\u01f0"+
		"\u01f1\7h\2\2\u01f1\u01f2\7a\2\2\u01f2\u01f3\7f\2\2\u01f3\u01f4\7g\2\2"+
		"\u01f4\u01f5\7u\2\2\u01f5\u01f6\7e\2\2\u01f6\u01f7\7t\2\2\u01f7\u01f8"+
		"\7k\2\2\u01f8\u01f9\7r\2\2\u01f9\u01fa\7v\2\2\u01fa\u01fb\7k\2\2\u01fb"+
		"\u01fc\7q\2\2\u01fc\u01fd\7p\2\2\u01fd\u01fe\7u\2\2\u01fe[\3\2\2\2\u01ff"+
		"\u0200\7n\2\2\u0200\u0201\7k\2\2\u0201\u0202\7u\2\2\u0202\u0203\7v\2\2"+
		"\u0203\u0204\7a\2\2\u0204\u0205\7q\2\2\u0205\u0206\7h\2\2\u0206\u0207"+
		"\7a\2\2\u0207\u0208\7h\2\2\u0208\u0209\7q\2\2\u0209\u020a\7t\2\2\u020a"+
		"\u020b\7o\2\2\u020b\u020c\7w\2\2\u020c\u020d\7n\2\2\u020d\u020e\7c\2\2"+
		"\u020e\u020f\7g\2\2\u020f]\3\2\2\2\u0210\u0211\7n\2\2\u0211\u0212\7k\2"+
		"\2\u0212\u0213\7u\2\2\u0213\u0214\7v\2\2\u0214\u0215\7a\2\2\u0215\u0216"+
		"\7q\2\2\u0216\u0217\7h\2\2\u0217\u0218\7a\2\2\u0218\u0219\7i\2\2\u0219"+
		"\u021a\7g\2\2\u021a\u021b\7p\2\2\u021b\u021c\7g\2\2\u021c\u021d\7t\2\2"+
		"\u021d\u021e\7c\2\2\u021e\u021f\7n\2\2\u021f\u0220\7a\2\2\u0220\u0221"+
		"\7u\2\2\u0221\u0222\7g\2\2\u0222\u0223\7v\2\2\u0223\u0224\7v\2\2\u0224"+
		"\u0225\7k\2\2\u0225\u0226\7p\2\2\u0226\u0227\7i\2\2\u0227\u0228\7u\2\2"+
		"\u0228_\3\2\2\2\u0229\u022a\7n\2\2\u022a\u022b\7k\2\2\u022b\u022c\7u\2"+
		"\2\u022c\u022d\7v\2\2\u022d\u022e\7a\2\2\u022e\u022f\7q\2\2\u022f\u0230"+
		"\7h\2\2\u0230\u0231\7a\2\2\u0231\u0232\7r\2\2\u0232\u0233\7t\2\2\u0233"+
		"\u0234\7q\2\2\u0234\u0235\7q\2\2\u0235\u0236\7h\2\2\u0236a\3\2\2\2\u0237"+
		"\u0238\7n\2\2\u0238\u0239\7k\2\2\u0239\u023a\7u\2\2\u023a\u023b\7v\2\2"+
		"\u023b\u023c\7a\2\2\u023c\u023d\7q\2\2\u023d\u023e\7h\2\2\u023e\u023f"+
		"\7a\2\2\u023f\u0240\7u\2\2\u0240\u0241\7g\2\2\u0241\u0242\7v\2\2\u0242"+
		"\u0243\7v\2\2\u0243\u0244\7k\2\2\u0244\u0245\7p\2\2\u0245\u0246\7i\2\2"+
		"\u0246\u0247\7u\2\2\u0247c\3\2\2\2\u0248\u0249\7n\2\2\u0249\u024a\7k\2"+
		"\2\u024a\u024b\7u\2\2\u024b\u024c\7v\2\2\u024c\u024d\7a\2\2\u024d\u024e"+
		"\7q\2\2\u024e\u024f\7h\2\2\u024f\u0250\7a\2\2\u0250\u0251\7u\2\2\u0251"+
		"\u0252\7{\2\2\u0252\u0253\7o\2\2\u0253\u0254\7d\2\2\u0254\u0255\7q\2\2"+
		"\u0255\u0256\7n\2\2\u0256\u0257\7u\2\2\u0257e\3\2\2\2\u0258\u0259\7n\2"+
		"\2\u0259\u025a\7q\2\2\u025a\u025b\7i\2\2\u025b\u025c\7k\2\2\u025c\u025d"+
		"\7e\2\2\u025dg\3\2\2\2\u025e\u025f\7/\2\2\u025f\u0260\7\63\2\2\u0260i"+
		"\3\2\2\2\u0261\u0262\7O\2\2\u0262\u0263\7R\2\2\u0263\u0264\7o\2\2\u0264"+
		"k\3\2\2\2\u0265\u0266\7p\2\2\u0266\u0267\7c\2\2\u0267\u0268\7o\2\2\u0268"+
		"\u0269\7g\2\2\u0269m\3\2\2\2\u026a\u026b\7p\2\2\u026b\u026c\7q\2\2\u026c"+
		"\u026d\7v\2\2\u026do\3\2\2\2\u026e\u026f\7Q\2\2\u026f\u0270\7d\2\2\u0270"+
		"\u0271\7x\2\2\u0271q\3\2\2\2\u0272\u0273\7Q\2\2\u0273\u0274\7J\2\2\u0274"+
		"\u0275\7{\2\2\u0275s\3\2\2\2\u0276\u0277\7]\2\2\u0277u\3\2\2\2\u0278\u0279"+
		"\7}\2\2\u0279w\3\2\2\2\u027a\u027b\7*\2\2\u027by\3\2\2\2\u027c\u027d\7"+
		"Q\2\2\u027d\u027e\7R\2\2\u027e\u027f\7o\2\2\u027f{\3\2\2\2\u0280\u0281"+
		"\7q\2\2\u0281\u0282\7t\2\2\u0282}\3\2\2\2\u0283\u0284\7Q\2\2\u0284\u0285"+
		"\7V\2\2\u0285\u0286\7V\2\2\u0286\u0287\7G\2\2\u0287\u0288\7T\2\2\u0288"+
		"\177\3\2\2\2\u0289\u028a\7r\2\2\u028a\u028b\7t\2\2\u028b\u028c\7g\2\2"+
		"\u028c\u028d\7f\2\2\u028d\u028e\7k\2\2\u028e\u028f\7e\2\2\u028f\u0290"+
		"\7c\2\2\u0290\u0291\7v\2\2\u0291\u0292\7g\2\2\u0292\u0081\3\2\2\2\u0293"+
		"\u0294\7r\2\2\u0294\u0295\7t\2\2\u0295\u0296\7g\2\2\u0296\u0297\7f\2\2"+
		"\u0297\u0298\7k\2\2\u0298\u0299\7e\2\2\u0299\u029a\7c\2\2\u029a\u029b"+
		"\7v\2\2\u029b\u029c\7g\2\2\u029c\u029d\7u\2\2\u029d\u0083\3\2\2\2\u029e"+
		"\u029f\7R\2\2\u029f\u02a0\7T\2\2\u02a0\u02a1\7Q\2\2\u02a1\u02a2\7V\2\2"+
		"\u02a2\u02a3\7G\2\2\u02a3\u02a4\7K\2\2\u02a4\u02a5\7P\2\2\u02a5\u0085"+
		"\3\2\2\2\u02a6\u02a7\7T\2\2\u02a7\u02a8\7g\2\2\u02a8\u02a9\7y\2\2\u02a9"+
		"\u0087\3\2\2\2\u02aa\u02ab\7T\2\2\u02ab\u02ac\7T\2\2\u02ac\u02ad\7G\2"+
		"\2\u02ad\u0089\3\2\2\2\u02ae\u02af\7u\2\2\u02af\u02b0\7c\2\2\u02b0\u02b1"+
		"\7v\2\2\u02b1\u02b2\7k\2\2\u02b2\u02b3\7u\2\2\u02b3\u02b4\7h\2\2\u02b4"+
		"\u02b5\7k\2\2\u02b5\u02b6\7c\2\2\u02b6\u02b7\7d\2\2\u02b7\u02b8\7n\2\2"+
		"\u02b8\u02b9\7g\2\2\u02b9\u008b\3\2\2\2\u02ba\u02bb\7U\2\2\u02bb\u02bc"+
		"\7C\2\2\u02bc\u02bd\7V\2\2\u02bd\u02be\7W\2\2\u02be\u02bf\7T\2\2\u02bf"+
		"\u02c0\7C\2\2\u02c0\u02c1\7V\2\2\u02c1\u02c2\7G\2\2\u02c2\u008d\3\2\2"+
		"\2\u02c3\u02c4\7U\2\2\u02c4\u02c5\7G\2\2\u02c5\u02c6\7V\2\2\u02c6\u02c7"+
		"\7J\2\2\u02c7\u02c8\7G\2\2\u02c8\u02c9\7Q\2\2\u02c9\u008f\3\2\2\2\u02ca"+
		"\u02cb\7U\2\2\u02cb\u02cc\7J\2\2\u02cc\u02cd\7{\2\2\u02cd\u0091\3\2\2"+
		"\2\u02ce\u02cf\7U\2\2\u02cf\u02d0\7q\2\2\u02d0\u02d1\7T\2\2\u02d1\u0093"+
		"\3\2\2\2\u02d2\u02d3\7u\2\2\u02d3\u02d4\7q\2\2\u02d4\u02d5\7t\2\2\u02d5"+
		"\u02d6\7v\2\2\u02d6\u0095\3\2\2\2\u02d7\u02d8\7u\2\2\u02d8\u02d9\7q\2"+
		"\2\u02d9\u02da\7t\2\2\u02da\u02db\7v\2\2\u02db\u02dc\7u\2\2\u02dc\u0097"+
		"\3\2\2\2\u02dd\u02de\7U\2\2\u02de\u02df\7R\2\2\u02df\u02e0\7C\2\2\u02e0"+
		"\u02e1\7U\2\2\u02e1\u02e2\7U\2\2\u02e2\u0099\3\2\2\2\u02e3\u02e4\7U\2"+
		"\2\u02e4\u02e5\7r\2\2\u02e5\u02e6\7N\2\2\u02e6\u009b\3\2\2\2\u02e7\u02e8"+
		"\7u\2\2\u02e8\u02e9\7r\2\2\u02e9\u02ea\7n\2\2\u02ea\u02eb\7k\2\2\u02eb"+
		"\u02ec\7v\2\2\u02ec\u02ed\7n\2\2\u02ed\u02ee\7g\2\2\u02ee\u02ef\7x\2\2"+
		"\u02ef\u02f0\7g\2\2\u02f0\u02f1\7n\2\2\u02f1\u009d\3\2\2\2\u02f2\u02f3"+
		"\7U\2\2\u02f3\u02f4\7R\2\2\u02f4\u02f5\7o\2\2\u02f5\u009f\3\2\2\2\u02f6"+
		"\u02f7\7U\2\2\u02f7\u02f8\7r\2\2\u02f8\u02f9\7T\2\2\u02f9\u00a1\3\2\2"+
		"\2\u02fa\u02fb\7U\2\2\u02fb\u02fc\7r\2\2\u02fc\u02fd\7v\2\2\u02fd\u00a3"+
		"\3\2\2\2\u02fe\u02ff\7U\2\2\u02ff\u0300\7U\2\2\u0300\u0301\7k\2\2\u0301"+
		"\u00a5\3\2\2\2\u0302\u0303\7u\2\2\u0303\u0304\7v\2\2\u0304\u0305\7c\2"+
		"\2\u0305\u0306\7v\2\2\u0306\u0307\7w\2\2\u0307\u0308\7u\2\2\u0308\u00a7"+
		"\3\2\2\2\u0309\u030a\7u\2\2\u030a\u030b\7v\2\2\u030b\u030c\7g\2\2\u030c"+
		"\u030d\7r\2\2\u030d\u00a9\3\2\2\2\u030e\u030f\7u\2\2\u030f\u0310\7w\2"+
		"\2\u0310\u0311\7d\2\2\u0311\u0312\7u\2\2\u0312\u0313\7q\2\2\u0313\u0314"+
		"\7t\2\2\u0314\u0315\7v\2\2\u0315\u00ab\3\2\2\2\u0316\u0317\7V\2\2\u0317"+
		"\u0318\7g\2\2\u0318\u0319\7t\2\2\u0319\u00ad\3\2\2\2\u031a\u031b\7\65"+
		"\2\2\u031b\u031c\7V\2\2\u031c\u031d\7C\2\2\u031d\u031e\7R\2\2\u031e\u00af"+
		"\3\2\2\2\u031f\u0320\7v\2\2\u0320\u0321\7t\2\2\u0321\u0322\7w\2\2\u0322"+
		"\u0323\7g\2\2\u0323\u00b1\3\2\2\2\u0324\u0325\7W\2\2\u0325\u0326\7p\2"+
		"\2\u0326\u0327\7E\2\2\u0327\u00b3\3\2\2\2\u0328\u0329\7w\2\2\u0329\u032a"+
		"\7p\2\2\u032a\u032b\7m\2\2\u032b\u032c\7p\2\2\u032c\u032d\7q\2\2\u032d"+
		"\u032e\7y\2\2\u032e\u032f\7p\2\2\u032f\u00b5\3\2\2\2\u0330\u0331\7w\2"+
		"\2\u0331\u0332\7p\2\2\u0332\u0333\7u\2\2\u0333\u0334\7c\2\2\u0334\u0335"+
		"\7v\2\2\u0335\u0336\7k\2\2\u0336\u0337\7u\2\2\u0337\u0338\7h\2\2\u0338"+
		"\u0339\7k\2\2\u0339\u033a\7c\2\2\u033a\u033b\7d\2\2\u033b\u033c\7n\2\2"+
		"\u033c\u033d\7g\2\2\u033d\u00b7\3\2\2\2\u033e\u033f\7W\2\2\u033f\u0340"+
		"\7T\2\2\u0340\u0341\7T\2\2\u0341\u00b9\3\2\2\2\u0342\u0343\7x\2\2\u0343"+
		"\u0344\7g\2\2\u0344\u0345\7t\2\2\u0345\u0346\7u\2\2\u0346\u0347\7k\2\2"+
		"\u0347\u0348\7q\2\2\u0348\u0349\7p\2\2\u0349\u00bb\3\2\2\2\u034a\u034c"+
		"\t\2\2\2\u034b\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034b\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\b^\2\2\u0350\u00bd\3\2"+
		"\2\2\u0351\u0352\7}\2\2\u0352\u0353\7,\2\2\u0353\u0354\3\2\2\2\u0354\u0355"+
		"\b_\3\2\u0355\u00bf\3\2\2\2\u0356\u035c\5\u00c2a\2\u0357\u035b\5\u00c2"+
		"a\2\u0358\u035b\5\u00c4b\2\u0359\u035b\5\4\2\2\u035a\u0357\3\2\2\2\u035a"+
		"\u0358\3\2\2\2\u035a\u0359\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2"+
		"\2\2\u035c\u035d\3\2\2\2\u035d\u00c1\3\2\2\2\u035e\u035c\3\2\2\2\u035f"+
		"\u0360\t\3\2\2\u0360\u00c3\3\2\2\2\u0361\u0362\4\62;\2\u0362\u00c5\3\2"+
		"\2\2\u0363\u0364\7,\2\2\u0364\u0365\7\177\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0367\bc\4\2\u0367\u00c7\3\2\2\2\u0368\u036c\n\4\2\2\u0369\u036a\7,\2"+
		"\2\u036a\u036c\n\5\2\2\u036b\u0368\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u036d"+
		"\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u00c9\3\2\2\2\t"+
		"\2\3\u034d\u035a\u035c\u036b\u036d\5\2\3\2\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
