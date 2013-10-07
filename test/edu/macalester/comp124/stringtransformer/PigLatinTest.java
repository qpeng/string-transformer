package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigLatinTest {

    private final StringTransformer pig = new PigLatin();

    @Test
    public void handlesEmptyString() {
        assertEquals("", pig.transform(""));
    }

    @Test
    public void vowelPigTest() {
        assertEquals("awesomeyay", pig.transform("awesome"));
        assertEquals("upsideyay", pig.transform("upside"));
        assertEquals("oddyay", pig.transform("odd"));
    }

    @Test
    public void conPigTest() {
        assertEquals("oolcay", pig.transform("cool"));
        assertEquals("acalestermay", pig.transform("macalester"));
        assertEquals("ingstray", pig.transform("string"));
        assertEquals("ythmrhay", pig.transform("rhythm"));
        assertEquals("ellowyay", pig.transform("yellow"));
        assertEquals("ymay", pig.transform("my"));
    }
}
