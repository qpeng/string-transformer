package edu.macalester.comp124.stringtransformer;

import java.util.Arrays;

public class PigLatin extends StringTransformer {

    @Override
    public String transform(String s) {
        boolean endStringWrite = true;
        String endString = "";
        String startString = "";
        char[] array = s.toCharArray();
        int[] vowel = new int[array.length];
        int n = array.length;
        if ((array[0] == 'a') || (array[0] == 'e') || (array[0] == 'i') || (array[0] == 'o') || (array[0] == 'u')) {
            String newWord = s + "yay";
            return newWord;
        } else {
            for (int j = 0; j < n; j++){
                if ((array[j] != 'a') && (array[j] != 'e') && (array[j] != 'i') && (array[j] != 'o') && (array[j] != 'u' && (array[j] != 'y'))) {
                    vowel[j] = 0;
                } else {
                    vowel[j] = 1;
                }
            }
            for (int i = 0; i < n; i++){
                if ((array[i] != 'a') && (array[i] != 'e') && (array[i] != 'i') && (array[i] != 'o') && (array[i] != 'u') && (array[i] != 'y')) {
                    if(endStringWrite && (vowel[i] == 0)){
                        endString = endString + array[i];
                    } else {
                        startString = startString + array[i];
                    }
                } else {
                    if ((array[i] == 'y') && (i == 0)){
                        endString = endString + array[i];
                    } else {
                    startString = startString + array[i];
                    endStringWrite = false;
                    }
                }
            }
            String wordFinal = startString + endString + "ay";
            return wordFinal;
        }
    }

    @Override
    public String toString() {
        return "All Pigged out :)";
    }

}
