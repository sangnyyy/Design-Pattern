package me.sml.strategy;

public class Main {
    public static void main(String[] args) {
        Moving train = new MovingVehicle();
        train.setMovable(new RailLoadMovable());
        System.out.println(train.move());

        train.setMovable(new LoadMovable());
        System.out.println(train.move());

    }

}
