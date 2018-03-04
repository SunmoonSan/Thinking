package com.maple.chapter07;

public class Chess extends BoardGame {

    Chess() {
        super(11);
        System.out.println(" Chess constructor ");
    }

    public static void main(String[] args) {
        Chess c = new Chess();
    }
}

class Game {

    Game() {
        System.out.println(" Game constructor no param");
    }

    Game(int i) {
        System.out.println(" Game constructor " + i);
    }
}

class BoardGame extends Game {

    BoardGame() {
        System.out.println(" BoardGame constructor no param ");
    }

    BoardGame(int i) {
//        super(i);
        System.out.println(" BoardGame constructor " + i);
    }
}
