package service;

import codeGen.SpassParser;
import codeGen.SpassParserBaseVisitor;

public class SpassToProver9Visitor extends SpassParserBaseVisitor {

    public String finalText = "";

    public String getFinalText() {
        return finalText;
    }

    @Override
    public Object visitFormula_list(SpassParser.Formula_listContext ctx) {

        String formula_type = ctx.origin_type().getText();
        switch (formula_type) {
            case "axioms":
                translateAxioms(ctx);
                break;

            case "conjectures":
                translateConjectures(ctx);
                break;

            default:
        }
        return null;
    }

    private void translateAxioms(SpassParser.Formula_listContext ctx) {
        finalText += ("formulas(assumptions).\n");
        super.visitFormula_list(ctx);
        finalText += ("end_of_list.\n");
    }

    private void translateConjectures(SpassParser.Formula_listContext ctx) {
        finalText += ("formulas(goals).\n");
        finalText += ("F(U,W).\n\n");
        super.visitFormula_list(ctx);
        finalText += ("end_of_list.\n");
    }

    @Override
    public String visitDescription(SpassParser.DescriptionContext ctx) {

        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i).toString().equals("name")) {
                finalText += "\n%name" + ctx.children.get(i + 3).getText();

            } else if (ctx.children.get(i).toString().equals("author")) {
                finalText += "\n%author" + ctx.children.get(i + 3).getText();
            } else if (ctx.children.get(i).toString().equals("status")) {
                finalText += "\n%status " + ctx.children.get(i + 2).getText();
            } else if (ctx.children.get(i).toString().equals("description")) {
                finalText += "\n%description" + ctx.children.get(i + 3).getText();
            } else if (ctx.children.get(i).toString().equals("end_of_list")) {
                finalText += "\n\n";
            }
        }
        return null;
    }

    @Override
    public Object visitTerm(SpassParser.TermContext ctx) {

        if (ctx.quant_sym() != null) {
            if (ctx.quant_sym().getText() == "forall")
                return super.visitTerm(ctx);
        } else if (ctx.symbol() != null) {
            if (ctx.symbol().Implies() != null) {
                finalText += ("F(U,V).\n" +
                        "F(V,W).\n");
                finalText += (ctx.term(0).getText().replace("and", "&") + " -> " + ctx.term(1).getText() + ".\n");
                return super.visitTerm(ctx);
            }
        }
        return super.visitTerm(ctx);
    }
}
