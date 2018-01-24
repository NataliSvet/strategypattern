package com.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;

    public  void  setFlyBehavior(FlyBehavior fb){
      flyBehavior = fb;
    }

    public void swim(){
        System.out.println("swim...");
    }
    public void quack(){
        System.out.println("crya crya");
    }

    public  void performFly(){
        flyBehavior.fly();
    }

    abstract public void display();

    // wrong!!!
//    public void flay(){
//
//    }
}


