package com.adapter;

public class ServiceT extends Service implements Contract {

    @Override
    public String greetMessage(String name) {
        return super.sayHello(name);

    }
}
