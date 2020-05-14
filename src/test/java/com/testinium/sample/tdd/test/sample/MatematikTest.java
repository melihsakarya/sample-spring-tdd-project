package com.testinium.sample.tdd.test.sample;

import com.testinium.sample.tdd.sample.Matematik;
import static org.junit.Assert.*;
import org.junit.Test;

public class MatematikTest {

    Matematik mat = new Matematik();

    @Test
    public void toplamaTest(){
        int sonuc = mat.topla(2, 4);
        assertEquals(sonuc, 6);
    }

    @Test
    public void carpmaTest(){
        int sonuc = mat.carp(2, 4);
        assertEquals(sonuc, 8);
    }

    @Test
    public void carpmaSifirKontrolTest(){
        assertEquals(mat.carp(-2, 2), 2);
    }

    @Test
    public void cikarmaTest(){
        assertEquals(mat.cikarma(8,2), 6);
    }

    @Test
    public void sifirKontrolCikarmaTest(){
        assertEquals(mat.cikarma(8,20), 0);
    }

}
