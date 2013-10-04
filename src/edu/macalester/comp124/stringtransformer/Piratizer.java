package edu.macalester.comp124.stringtransformer;/*
Created by Cole Erickson, cericks4@macalester.edu
Date: 10/1/13 Time: 10:27 AM

*/

import acm.util.RandomGenerator;


public class Piratizer extends StringTransformer {

    @Override
    public String transform(String s) {
        RandomGenerator randomGenerator = new RandomGenerator();
        int number = randomGenerator.nextInt(1,4);
        if (number == 1) {

            String newString1 = s + " Ahoy!";
            return newString1;
        }

        String newString2 = s.replace("r", "rrr");
        return newString2;

    }

    @Override
    public String toString() {
        return "Piratizer";
    }


}
