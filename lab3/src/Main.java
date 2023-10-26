package org.example;


public class Main {
    public static void main(String[] args) {
/*
        SymbolTable symbolTableIdentifiers = new SymbolTable();

        symbolTableIdentifiers.add("a");
        symbolTableIdentifiers.add("a");
        symbolTableIdentifiers.add("b");
        symbolTableIdentifiers.add("abb");
        symbolTableIdentifiers.add("b");

        System.out.println("identifiers");
        System.out.println(symbolTableIdentifiers);


        SymbolTable symbolTableConstants = new SymbolTable();

        symbolTableConstants.add("'a'");
        symbolTableConstants.add("'a'");
        symbolTableConstants.add("'a'");
        symbolTableConstants.add("5");
        symbolTableConstants.add("5");
        symbolTableConstants.add("\"5\"");
        symbolTableConstants.add("'5'");
        symbolTableConstants.add("\"a\"");
        symbolTableConstants.add("\"a\"");

        System.out.println("constants");
        System.out.println(symbolTableConstants);*/

        Parser parser = new Parser();
        try{
            parser.scan("/in/p1.txt");
/*            parser.scan("/in/p2.txt");
            parser.scan("/in/p3.txt");
            parser.scan("/in/p1err.txt");*/
            System.out.println("Lexically correct!");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        parser.getSymbolTableConstants().writeToFile("sybTblConst.txt");
        parser.getSymbolTableIdentifiers().writeToFile("sybTblIdent.txt");
        parser.writePIF("PIF.out");
        //System.out.println(parser.parseTokensIn(1, 9));
    }
}