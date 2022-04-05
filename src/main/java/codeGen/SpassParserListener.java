// Generated from C:/projects/SpassAndProver9/src/grammar\SpassParser.g4 by ANTLR 4.9.2
package codeGen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SpassParser}.
 */
public interface SpassParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SpassParser#problem}.
	 * @param ctx the parse tree
	 */
	void enterProblem(SpassParser.ProblemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#problem}.
	 * @param ctx the parse tree
	 */
	void exitProblem(SpassParser.ProblemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(SpassParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(SpassParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#log_state}.
	 * @param ctx the parse tree
	 */
	void enterLog_state(SpassParser.Log_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#log_state}.
	 * @param ctx the parse tree
	 */
	void exitLog_state(SpassParser.Log_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#logical_part}.
	 * @param ctx the parse tree
	 */
	void enterLogical_part(SpassParser.Logical_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#logical_part}.
	 * @param ctx the parse tree
	 */
	void exitLogical_part(SpassParser.Logical_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_list(SpassParser.Symbol_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_list(SpassParser.Symbol_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(SpassParser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(SpassParser.Declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SpassParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SpassParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#gen_decl}.
	 * @param ctx the parse tree
	 */
	void enterGen_decl(SpassParser.Gen_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#gen_decl}.
	 * @param ctx the parse tree
	 */
	void exitGen_decl(SpassParser.Gen_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#func_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_list(SpassParser.Func_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#func_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_list(SpassParser.Func_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#subsort_decl}.
	 * @param ctx the parse tree
	 */
	void enterSubsort_decl(SpassParser.Subsort_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#subsort_decl}.
	 * @param ctx the parse tree
	 */
	void exitSubsort_decl(SpassParser.Subsort_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#term_decl}.
	 * @param ctx the parse tree
	 */
	void enterTerm_decl(SpassParser.Term_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#term_decl}.
	 * @param ctx the parse tree
	 */
	void exitTerm_decl(SpassParser.Term_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#pred_decl}.
	 * @param ctx the parse tree
	 */
	void enterPred_decl(SpassParser.Pred_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#pred_decl}.
	 * @param ctx the parse tree
	 */
	void exitPred_decl(SpassParser.Pred_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#sort_sym}.
	 * @param ctx the parse tree
	 */
	void enterSort_sym(SpassParser.Sort_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#sort_sym}.
	 * @param ctx the parse tree
	 */
	void exitSort_sym(SpassParser.Sort_symContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#pred_sym}.
	 * @param ctx the parse tree
	 */
	void enterPred_sym(SpassParser.Pred_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#pred_sym}.
	 * @param ctx the parse tree
	 */
	void exitPred_sym(SpassParser.Pred_symContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#fun_sym}.
	 * @param ctx the parse tree
	 */
	void enterFun_sym(SpassParser.Fun_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#fun_sym}.
	 * @param ctx the parse tree
	 */
	void exitFun_sym(SpassParser.Fun_symContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#formula_list}.
	 * @param ctx the parse tree
	 */
	void enterFormula_list(SpassParser.Formula_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#formula_list}.
	 * @param ctx the parse tree
	 */
	void exitFormula_list(SpassParser.Formula_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#origin_type}.
	 * @param ctx the parse tree
	 */
	void enterOrigin_type(SpassParser.Origin_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#origin_type}.
	 * @param ctx the parse tree
	 */
	void exitOrigin_type(SpassParser.Origin_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(SpassParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(SpassParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SpassParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SpassParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#term_list}.
	 * @param ctx the parse tree
	 */
	void enterTerm_list(SpassParser.Term_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#term_list}.
	 * @param ctx the parse tree
	 */
	void exitTerm_list(SpassParser.Term_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#quant_sym}.
	 * @param ctx the parse tree
	 */
	void enterQuant_sym(SpassParser.Quant_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#quant_sym}.
	 * @param ctx the parse tree
	 */
	void exitQuant_sym(SpassParser.Quant_symContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(SpassParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(SpassParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#clause_list}.
	 * @param ctx the parse tree
	 */
	void enterClause_list(SpassParser.Clause_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#clause_list}.
	 * @param ctx the parse tree
	 */
	void exitClause_list(SpassParser.Clause_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#clause_type}.
	 * @param ctx the parse tree
	 */
	void enterClause_type(SpassParser.Clause_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#clause_type}.
	 * @param ctx the parse tree
	 */
	void exitClause_type(SpassParser.Clause_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#cnf_clause}.
	 * @param ctx the parse tree
	 */
	void enterCnf_clause(SpassParser.Cnf_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#cnf_clause}.
	 * @param ctx the parse tree
	 */
	void exitCnf_clause(SpassParser.Cnf_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#dnf_clause}.
	 * @param ctx the parse tree
	 */
	void enterDnf_clause(SpassParser.Dnf_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#dnf_clause}.
	 * @param ctx the parse tree
	 */
	void exitDnf_clause(SpassParser.Dnf_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#cnf_clause_body}.
	 * @param ctx the parse tree
	 */
	void enterCnf_clause_body(SpassParser.Cnf_clause_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#cnf_clause_body}.
	 * @param ctx the parse tree
	 */
	void exitCnf_clause_body(SpassParser.Cnf_clause_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#dnf_clause_body}.
	 * @param ctx the parse tree
	 */
	void enterDnf_clause_body(SpassParser.Dnf_clause_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#dnf_clause_body}.
	 * @param ctx the parse tree
	 */
	void exitDnf_clause_body(SpassParser.Dnf_clause_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#proof_list}.
	 * @param ctx the parse tree
	 */
	void enterProof_list(SpassParser.Proof_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#proof_list}.
	 * @param ctx the parse tree
	 */
	void exitProof_list(SpassParser.Proof_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(SpassParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(SpassParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(SpassParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(SpassParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#rule_appl}.
	 * @param ctx the parse tree
	 */
	void enterRule_appl(SpassParser.Rule_applContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#rule_appl}.
	 * @param ctx the parse tree
	 */
	void exitRule_appl(SpassParser.Rule_applContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#parent_list}.
	 * @param ctx the parse tree
	 */
	void enterParent_list(SpassParser.Parent_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#parent_list}.
	 * @param ctx the parse tree
	 */
	void exitParent_list(SpassParser.Parent_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#parent_}.
	 * @param ctx the parse tree
	 */
	void enterParent_(SpassParser.Parent_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#parent_}.
	 * @param ctx the parse tree
	 */
	void exitParent_(SpassParser.Parent_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#assoc_list}.
	 * @param ctx the parse tree
	 */
	void enterAssoc_list(SpassParser.Assoc_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#assoc_list}.
	 * @param ctx the parse tree
	 */
	void exitAssoc_list(SpassParser.Assoc_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(SpassParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(SpassParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SpassParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SpassParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#proof_type}.
	 * @param ctx the parse tree
	 */
	void enterProof_type(SpassParser.Proof_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#proof_type}.
	 * @param ctx the parse tree
	 */
	void exitProof_type(SpassParser.Proof_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#user_reference}.
	 * @param ctx the parse tree
	 */
	void enterUser_reference(SpassParser.User_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#user_reference}.
	 * @param ctx the parse tree
	 */
	void exitUser_reference(SpassParser.User_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#user_result}.
	 * @param ctx the parse tree
	 */
	void enterUser_result(SpassParser.User_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#user_result}.
	 * @param ctx the parse tree
	 */
	void exitUser_result(SpassParser.User_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#user_rule_appl}.
	 * @param ctx the parse tree
	 */
	void enterUser_rule_appl(SpassParser.User_rule_applContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#user_rule_appl}.
	 * @param ctx the parse tree
	 */
	void exitUser_rule_appl(SpassParser.User_rule_applContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#user_parent}.
	 * @param ctx the parse tree
	 */
	void enterUser_parent(SpassParser.User_parentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#user_parent}.
	 * @param ctx the parse tree
	 */
	void exitUser_parent(SpassParser.User_parentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#user_proof_type}.
	 * @param ctx the parse tree
	 */
	void enterUser_proof_type(SpassParser.User_proof_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#user_proof_type}.
	 * @param ctx the parse tree
	 */
	void exitUser_proof_type(SpassParser.User_proof_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#user_key}.
	 * @param ctx the parse tree
	 */
	void enterUser_key(SpassParser.User_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#user_key}.
	 * @param ctx the parse tree
	 */
	void exitUser_key(SpassParser.User_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#user_value}.
	 * @param ctx the parse tree
	 */
	void enterUser_value(SpassParser.User_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#user_value}.
	 * @param ctx the parse tree
	 */
	void exitUser_value(SpassParser.User_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#settings}.
	 * @param ctx the parse tree
	 */
	void enterSettings(SpassParser.SettingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#settings}.
	 * @param ctx the parse tree
	 */
	void exitSettings(SpassParser.SettingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#setting_entry}.
	 * @param ctx the parse tree
	 */
	void enterSetting_entry(SpassParser.Setting_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#setting_entry}.
	 * @param ctx the parse tree
	 */
	void exitSetting_entry(SpassParser.Setting_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#setting_label}.
	 * @param ctx the parse tree
	 */
	void enterSetting_label(SpassParser.Setting_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#setting_label}.
	 * @param ctx the parse tree
	 */
	void exitSetting_label(SpassParser.Setting_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SpassParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SpassParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#arity}.
	 * @param ctx the parse tree
	 */
	void enterArity(SpassParser.ArityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#arity}.
	 * @param ctx the parse tree
	 */
	void exitArity(SpassParser.ArityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SpassParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SpassParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpassParser#text_}.
	 * @param ctx the parse tree
	 */
	void enterText_(SpassParser.Text_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SpassParser#text_}.
	 * @param ctx the parse tree
	 */
	void exitText_(SpassParser.Text_Context ctx);
}
