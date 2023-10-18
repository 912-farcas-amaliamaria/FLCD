package org.example;


public class Main {
    public static void main(String[] args) {

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
        System.out.println(symbolTableConstants);
    }
}