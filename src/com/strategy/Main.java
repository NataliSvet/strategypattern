package com.strategy;

public class Main {
    public static void main (String[] args){
    Duck duck  = new RedHatDuck();
    duck.display();
    duck.quack();
    duck.swim();
    duck.performFly();

    Duck duck1 = new ToyDack();
    duck1.display();
    duck1.quack();
    duck1.swim();
    duck1.performFly();
    duck1.setFlyBehavior(new FlyRocketPowered());
    duck1.performFly();
    }
}

