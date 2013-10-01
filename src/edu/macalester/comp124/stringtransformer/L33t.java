package edu.macalester.comp124.stringtransformer;

public class L33t extends StringTransformer {

    @Override
    public String transform(String s){
        s = s.toLowerCase();
        s = s.replace("a", "4");
        s = s.replace("e", "3");
        s = s.replace("o", "0");
        s = s.replace("i", "1");
        s = s.replace(".", "");
        s = s.replace(",", "");
        return s;
    }

    @Override
    public String toString(){
        return "L33t Sp34k";
    }
}
