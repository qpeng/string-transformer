package edu.macalester.comp124.stringtransformer;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class L33tTest {

    private final StringTransformer l33t = new L33t();

    @Test
    public void changesLetters(){
        assertEquals("murc13l4g0", l33t.transform("Murcielago.,"));  // Murcielago (bat in spanish) has all the vowels we need to test \
        assertEquals("s3ñ0r", l33t.transform("SEÑOR"));
    }

}
