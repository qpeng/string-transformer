package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverserTest {
    
    private final StringTransformer reversed = new Reverser();
    
    @Test
    public void handlesEmptyString() {
        assertEquals("", reversed.transform(""));
    }
    
    @Test
    public void capitalizesAll() {
        assertEquals("A", reversed.transform("A"));
        assertEquals("ZONGLE", reversed.transform("ELGNOZ"));
    }
}
