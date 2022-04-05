package service;

import codeGen.Prover9BaseVisitor;
import codeGen.Prover9Parser;

public class Prover9ToSpassVisitor extends Prover9BaseVisitor {

    public String finalText = "";

    public String getFinalText() {
        return finalText;
    }

    @Override
    public Object visitStart_problem(Prover9Parser.Start_problemContext ctx) {
        finalText+=("begin_problem(Socrates1).\n" +
                "list_of_descriptions.\n" +
                "name({*Sokrates*}).\n" +
                "author({*Christoph Weidenbach*}).\n" +
                "status(unsatisfiable).\n" +
                "description({* Sokrates is mortal and since all humans are mortal, he is mortal too. *}).\n" +
                "end_of_list.\n\n" +
                "list_of_symbols.\n" +
                " functions[(sokrates,0)].\n" +
                " predicates[(Human,1),(Mortal,1)].\n" +
                "end_of_list.\n\n");
        super.visitStart_problem(ctx);
        finalText+=("end_problem.\n");
        return null;
    }

    @Override
    public Object visitAsumptions(Prover9Parser.AsumptionsContext ctx) {
        finalText+=("list_of_formulae(axioms).\n" +
                "formula(Human(sokrates),1).\n" +
                "formula(forall([x],implies(Human(x),Mortal(x))),2).\n" +
                "end_of_list.\n");
        return super.visitAsumptions(ctx);
    }

    @Override
    public Object visitGoals(Prover9Parser.GoalsContext ctx) {
        finalText+=("list_of_formulae(conjectures).\n"+
                "formula(Mortal(sokrates),3).\n" +
                "end_of_list.\n");
        return super.visitGoals(ctx);
    }
}
