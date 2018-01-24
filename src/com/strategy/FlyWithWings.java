package com.strategy;

import com.sun.org.apache.xpath.internal.SourceTree;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am fly!");


    }
}
