// Generated from C:/projects/SpassAndProver9/src/grammar\SpassParser.g4 by ANTLR 4.9.2
package codeGen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpassParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpassParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpassParser#problem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProblem(SpassParser.ProblemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(SpassParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#log_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_state(SpassParser.Log_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#logical_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_part(SpassParser.Logical_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#symbol_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_list(SpassParser.Symbol_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_list(SpassParser.Declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SpassParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#gen_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGen_decl(SpassParser.Gen_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#func_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_list(SpassParser.Func_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#subsort_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsort_decl(SpassParser.Subsort_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#term_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_decl(SpassParser.Term_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#pred_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPred_decl(SpassParser.Pred_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#sort_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_sym(SpassParser.Sort_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#pred_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPred_sym(SpassParser.Pred_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#fun_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_sym(SpassParser.Fun_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#formula_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula_list(SpassParser.Formula_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#origin_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrigin_type(SpassParser.Origin_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(SpassParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SpassParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#term_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_list(SpassParser.Term_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#quant_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuant_sym(SpassParser.Quant_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(SpassParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#clause_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_list(SpassParser.Clause_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#clause_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause_type(SpassParser.Clause_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#cnf_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCnf_clause(SpassParser.Cnf_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#dnf_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDnf_clause(SpassParser.Dnf_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#cnf_clause_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCnf_clause_body(SpassParser.Cnf_clause_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#dnf_clause_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDnf_clause_body(SpassParser.Dnf_clause_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#proof_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProof_list(SpassParser.Proof_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(SpassParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(SpassParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#rule_appl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_appl(SpassParser.Rule_applContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#parent_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent_list(SpassParser.Parent_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#parent_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent_(SpassParser.Parent_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#assoc_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssoc_list(SpassParser.Assoc_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(SpassParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SpassParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#proof_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProof_type(SpassParser.Proof_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#user_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_reference(SpassParser.User_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#user_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_result(SpassParser.User_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#user_rule_appl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_rule_appl(SpassParser.User_rule_applContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#user_parent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_parent(SpassParser.User_parentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#user_proof_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_proof_type(SpassParser.User_proof_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#user_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_key(SpassParser.User_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#user_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_value(SpassParser.User_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#settings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettings(SpassParser.SettingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#setting_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetting_entry(SpassParser.Setting_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#setting_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetting_label(SpassParser.Setting_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SpassParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#arity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArity(SpassParser.ArityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SpassParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpassParser#text_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_(SpassParser.Text_Context ctx);
}
