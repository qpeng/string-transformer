package edu.macalester.comp124.stringtransformer;

public class Reverser extends StringTransformer {

    public String transform(String s) {
        String rev= "";
        for (int i=0;i<s.length();i++) {
            rev+=s.charAt(s.length()-1-i);
        }
        return rev;
    }
    
    @Override
    public String toString() {
        return "Reverser";
    }
}
