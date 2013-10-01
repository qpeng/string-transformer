package edu.macalester.comp124.stringtransformer;

public class ReverserTransformer extends StringTransformer {

    @Override
    public String transform(String s) {
        int len = s.length();
        String newWord = "";
        for (int i = len-1; i >= 0; i--){
            newWord = newWord + s.charAt(i);

        }


        return newWord;
    }

    @Override
    public String toString() {
        return "Reverser";
    }

}
