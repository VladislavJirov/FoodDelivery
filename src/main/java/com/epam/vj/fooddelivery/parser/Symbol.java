package com.epam.vj.fooddelivery.parser;

import java.util.HashMap;
import java.util.Map;

public class Symbol {
    private char value;

    private static Map<Character, Symbol> symbols = new HashMap<Character, Symbol>();

    public Symbol(Character ch) {
        value = ch;
    }

    public static Symbol addSymbol(char ch) {
        ;
        Symbol symbol = symbols.get(ch);
        if (symbol == null) {
            symbol = new Symbol(ch);
            symbols.put(ch, symbol);
        }
        return symbol;

    }
}
