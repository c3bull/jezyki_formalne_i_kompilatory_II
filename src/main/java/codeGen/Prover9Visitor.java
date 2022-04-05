// Generated from C:/projects/SpassAndProver9/src/grammar\Prover9.g4 by ANTLR 4.9.2
package codeGen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Prover9Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Prover9Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#start_problem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_problem(Prover9Parser.Start_problemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#formulas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormulas(Prover9Parser.FormulasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#asumptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsumptions(Prover9Parser.AsumptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#goals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoals(Prover9Parser.GoalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(Prover9Parser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(Prover9Parser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(Prover9Parser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(Prover9Parser.FormulaContext ctx);
}
