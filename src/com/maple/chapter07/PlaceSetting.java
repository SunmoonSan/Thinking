package com.maple.chapter07;

class Plate {
    Plate(int i) {
        System.out.println(" Plate constructor ");
    }
}

class DinnerPlate extends Plate {

    DinnerPlate(int i) {
        super(i);
        System.out.println(" DinnerPlate constructor ");
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println(" Utensil constructor ");
    }
}

class Spoon extends Utensil {

    Spoon(int i) {
        super(i);
        System.out.println(" Spoon constructor ");
    }
}

class Fork extends Utensil {

    Fork(int i) {
        super(i);
        System.out.println(" Fork constructor ");
    }
}

class Knife extends Utensil {

    Knife(int i) {
        super(i);
        System.out.println(" Knife constructor ");
    }
}

class Custom {
    Custom(int i) {
        System.out.println(" Custom constructor ");
    }
}

public class PlaceSetting extends Custom {
    private DinnerPlate dinnerPlate = new DinnerPlate(8);
    private Spoon spoon;
    private Fork fork;
    private Knife knife;


    PlaceSetting(int i) {
        super(i+1);
        spoon = new Spoon(i+2);
        fork = new Fork(i+3);
        dinnerPlate = new DinnerPlate(i+5);
        knife = new Knife(i+4);

        System.out.println(" PlaceSetting constructor ");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}

