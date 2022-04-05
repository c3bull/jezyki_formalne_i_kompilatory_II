// Generated from C:/projects/SpassAndProver9/src/grammar\Prover9.g4 by ANTLR 4.9.2
package codeGen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Prover9Parser}.
 */
public interface Prover9Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#start_problem}.
	 * @param ctx the parse tree
	 */
	void enterStart_problem(Prover9Parser.Start_problemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#start_problem}.
	 * @param ctx the parse tree
	 */
	void exitStart_problem(Prover9Parser.Start_problemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#formulas}.
	 * @param ctx the parse tree
	 */
	void enterFormulas(Prover9Parser.FormulasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#formulas}.
	 * @param ctx the parse tree
	 */
	void exitFormulas(Prover9Parser.FormulasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#asumptions}.
	 * @param ctx the parse tree
	 */
	void enterAsumptions(Prover9Parser.AsumptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#asumptions}.
	 * @param ctx the parse tree
	 */
	void exitAsumptions(Prover9Parser.AsumptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#goals}.
	 * @param ctx the parse tree
	 */
	void enterGoals(Prover9Parser.GoalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#goals}.
	 * @param ctx the parse tree
	 */
	void exitGoals(Prover9Parser.GoalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Prover9Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Prover9Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(Prover9Parser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(Prover9Parser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(Prover9Parser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(Prover9Parser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(Prover9Parser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(Prover9Parser.FormulaContext ctx);
}
