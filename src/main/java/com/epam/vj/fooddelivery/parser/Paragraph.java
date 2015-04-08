package com.epam.vj.fooddelivery.parser;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    List<Sentense> sentenses = new ArrayList<Sentense>();

    public void addSentense(Sentense sentense) {
        sentenses.add(sentense);
    }
}
