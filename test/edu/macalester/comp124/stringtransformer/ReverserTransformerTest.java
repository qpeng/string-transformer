package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ReverserTransformerTest {

    private final StringTransformer rev = new ReverserTransformer();

    @Test
    public void handlesEmptyString() {
        assertEquals("", rev.transform(""));
    }

    @Test
    public void reversesLetters() {
        assertEquals("abc", rev.transform("cba"));
        assertEquals("Andrew", rev.transform("werdnA"));
    }
}
