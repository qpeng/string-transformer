package edu.macalester.comp124.stringtransformer;

/**
 * Created with IntelliJ IDEA.
 * User: igreene
 * Date: 10/1/13
 * Time: 10:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class VowelBleeper extends StringTransformer{

    @Override
    public String transform(String s) {
//      String s2 = s.replace('a', '*');
//      s2 = s2.replace('e', '*');
//      s2 = s2.replace('i', '*');
//      s2 = s2.replace('o', '*');
//      s2 = s2.replace('u', '*');
        s = changeVow(s);
        return s;
    }

    @Override
    public String toString() {
        return "V*w*ls Bl**p*d **t!";
    }

    public String changeVow(String s) {
        s = s.replace('a', '*');
        s = s.replace('e', '*');
        s = s.replace('i', '*');
        s = s.replace('o', '*');
        s = s.replace('u', '*');
        s = s.replace('A', '*');
        s = s.replace('E', '*');
        s = s.replace('I', '*');
        s = s.replace('O', '*');
        s = s.replace('U', '*');
        return s;
    }
}
