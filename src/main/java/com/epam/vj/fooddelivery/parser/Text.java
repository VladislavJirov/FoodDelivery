package com.epam.vj.fooddelivery.parser;

import java.util.ArrayList;
import java.util.List;

public class Text {

    List<Paragraph> paragraphs = new ArrayList<Paragraph>();

    public void addParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }
}
