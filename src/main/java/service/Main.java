package service;

import codeGen.Prover9Lexer;
import codeGen.Prover9Parser;
import codeGen.SpassLexer;
import codeGen.SpassParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import service.Prover9ToSpassVisitor;
import service.SpassToProver9Visitor;

import java.io.IOException;

public class Main {

    private static final String TEST_FILE_PATH_SPASS = "src/example/spass/pelletier_57.spass";
    private static final String TEST_FILE_PATH_PROVER9 = "src/example/prover9/socrates.prover9";

    public static void spassToProver() throws IOException {
        CharStream input = CharStreams.fromFileName(TEST_FILE_PATH_SPASS);
        SpassLexer lexer = new SpassLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SpassParser parser = new SpassParser(commonTokenStream);

        ParseTree tree = parser.problem();

        SpassToProver9Visitor spassToProver9Visitor = new SpassToProver9Visitor();
        spassToProver9Visitor.visit(tree);

        System.out.println(spassToProver9Visitor.getFinalText());
    }

    public static void proverToSpass() throws IOException {
        CharStream input = CharStreams.fromFileName(TEST_FILE_PATH_PROVER9);
        Prover9Lexer lexer = new Prover9Lexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        Prover9Parser parser = new Prover9Parser(commonTokenStream);

        ParseTree tree = parser.start_problem();

        Prover9ToSpassVisitor prover9ToSpassVisitor = new Prover9ToSpassVisitor();
        prover9ToSpassVisitor.visit(tree);

        System.out.println(prover9ToSpassVisitor.getFinalText());
    }

    public static void main(String[] args) throws IOException {
        System.out.println("SPASS TO PROVER9");
        spassToProver();
        System.out.println("\n ========================================= \n");
        System.out.println("PROVER9 TO SPASS \n");
        proverToSpass();

    }
}
