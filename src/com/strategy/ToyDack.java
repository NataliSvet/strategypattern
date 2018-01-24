package com.strategy;

public class ToyDack extends  Duck {
    public ToyDack(){
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("toy");
    }
}
