package edu.macalester.comp124.stringtransformer;

/**
 * String transformer lab.
 * Our code takes an english word and translates it into Pig Latin.
 * Leo disagreed with the interpretation of Pig Latin on the sheet,
 * specifically the last rule, and so our program will instead
 * return "ymay" if given the word "my" as opposed to "myyay."
 * @author Leo Zoeckler and Judy Syrkin-Nikolau.
 */

public class PigLatin extends StringTransformer {

    @Override
    public String transform(String s) {
        boolean endStringWrite = true;
        String endString = "";
        String startString = "";
        char[] array = s.toCharArray();
        int[] vowel = new int[array.length];
        int n = array.length;
        if(s.equals("")){
            return("");
        } else if ((array[0] == 'a') || (array[0] == 'e') || (array[0] == 'i') || (array[0] == 'o') || (array[0] == 'u')) {
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
