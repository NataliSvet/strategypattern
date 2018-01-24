package com.strategy;

public class RedHatDuck extends Duck {
    @Override
    public void display(){
        System.out.println("I am red hat duck");
    }
    public RedHatDuck(){
    flyBehavior = new FlyWithWings();
}
}
