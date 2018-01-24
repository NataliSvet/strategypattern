package com.strategy;

public class GrayHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("i am grey duck");
    }

    public GrayHeadDuck() {
        flyBehavior = new FlyWithWings();
    }
}