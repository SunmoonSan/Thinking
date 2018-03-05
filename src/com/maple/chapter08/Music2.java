package com.maple.chapter08;

class Stringed extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
}

class Brass extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
}

public class Music2 {

    public static void tune(Wind wind) {
        wind.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed stringed) {
        stringed.play(Note.MIDDLE_C);
    }

    public static void tune(Brass brass) {
        brass.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
