package com.testinium.sample.tdd.sample;

public class Matematik {

    public int topla(int x, int y){
        return x + y;
    }

    public int carp(int sayi1, int sayi2) {
        if(sayi1 < 0 ){
            sayi1 = 1;
        }
        return sayi1 * sayi2;
    }

    public int cikarma(int sayi1, int sayi2) {
        int sonuc = sayi1 - sayi2;
        if(sonuc > 0) {
            return sonuc;
        }
        else{
            return 0;
        }
    }
}
