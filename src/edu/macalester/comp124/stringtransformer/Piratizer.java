package edu.macalester.comp124.stringtransformer;/*
Created by Cole Erickson, cericks4@macalester.edu
Date: 10/1/13 Time: 10:27 AM

*/

public class Piratizer extends StringTransformer {

    @Override
    public String transform(String s) {
//        for (int i = 0; i < s.length(); i++) {
//            char y = s.charAt(i);
//            if (y == 'r') {
//                s.replace(y, )
//
//            }
//
//        }
        return s.replaceAll("r", "rrr");

    }

    @Override
    public String toString() {
        return "Piratizer";
    }


}
