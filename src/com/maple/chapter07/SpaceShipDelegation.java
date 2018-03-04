package com.maple.chapter07;

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();
    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    // Delegated methods
    public void back(int vel) {
        controls.back(vel);
    }

    public void down(int vel) {
        controls.down(vel);
    }

    public void forward(int vel) {
        controls.forward(vel);
    }

    public void left(int vel) {
        controls.left(vel);
    }

    public void right(int vel) {
        controls.right(vel);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public void up(int vel) {
        controls.up(vel);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation(" NSEA Protector ");
        protector.forward(100);
    }
}
