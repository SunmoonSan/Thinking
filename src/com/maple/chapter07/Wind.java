package com.maple.chapter07;

class Instrument {
    public void play() {}
    static void tune(Instrument instrument) {
        instrument.play();
    }
}

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
