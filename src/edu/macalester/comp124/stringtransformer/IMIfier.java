package edu.macalester.comp124.stringtransformer;

import java.util.Random;

/**
 * Created by Kathryn Hathaway and Brooke Boatman
 */

public class IMIfier extends IdentityTransformer{
    @Override
    public String transform(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[aeiou]", "");
        Random random = new Random();
        int insert = random.nextInt(4);
        if (insert == 1) {
            int word = random.nextInt(6);
            if (word == 0) {
                s += " lol";
            }
            if (word == 1) {
                s += " lmao";
            }
            if (word == 2) {
                s += " omg";
            }
            if (word == 3) {
                s += " jk";
            }
            if (word == 4) {
                s += " rofl";
            }
            if (word == 5) {
                s += " u jelly bro?";
            }
        }
        return s;
    }

    @Override
    public String toString() {
        return "IM-ified";
    }
}
