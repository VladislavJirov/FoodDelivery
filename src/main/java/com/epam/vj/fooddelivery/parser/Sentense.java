package com.epam.vj.fooddelivery.parser;

import java.util.ArrayList;
import java.util.List;

public class Sentense {

    List<Word> words = new ArrayList<Word>();

    public void addWord(Word word) {
        words.add(word);
    }
}

