package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: igreene
 * Date: 10/1/13
 * Time: 11:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class VowelBeeperTest {

    private final StringTransformer bleeper = new VowelBleeper();

    @Test
    public void handlesEmptyString() {
        assertEquals("", bleeper.transform(""));
    }

    @Test
    public void bleepsOut() {
        assertEquals("*", bleeper.transform("A"));
        assertEquals("sh*t", bleeper.transform("shit"));
    }
}
