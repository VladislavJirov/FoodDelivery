package com.epam.vj.fooddelivery.parser;

import java.util.ArrayList;
import java.util.List;

public class Word {

    List<Symbol> symbols = new ArrayList<Symbol>();

    public void addSymbol(Symbol symbol) {
        symbols.add(symbol);
    }
}
