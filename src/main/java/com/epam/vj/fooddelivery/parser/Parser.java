package com.epam.vj.fooddelivery.parser;

public class Parser {

    public Text parseText(String text){
        Text t = new Text();
        String[] paragraphs = text.split("(?<=(\\r\\n){2})(?![\\r\\n])");
        System.out.println("Paragraphs: " + paragraphs.length);
        for (String p : paragraphs) {
            t.addParagraph(parseParagtaph(p));
        }
        return t;
    }

    private Paragraph parseParagtaph(String paragraph){
        Paragraph p = new Paragraph();
        String[] sentenses = paragraph.split("(?<=[!?.]\\s)(?!\\s)");
        System.out.println("Sentenses: " + sentenses.length);
        for (String s : sentenses) {
            p.addSentense(parseSentense(s));
        }
        return p;
    }

    private Sentense parseSentense(String sentense){
        Sentense s = new Sentense();
        String[] words = sentense.split("(?<=(\\s))(?!\\s)");
        System.out.println("Words: " + words.length);
        for (String word : words) {
            s.addWord(parseWord(word));
        }
        return s;
    }

    private Word parseWord(String word){
        Word w = new Word();
        Symbol[] s = new Symbol[word.length()];
        for (int i = 0; i < word.length(); i++) {
            s[i]=Symbol.addSymbol(word.charAt(i));
        }
        System.out.println("Symbols: " + word.length());
        return w;
    }
}
