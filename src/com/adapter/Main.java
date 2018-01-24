package com.adapter;

public class Main {
    public static String  text ;
    public static void main(String[] args){
        text = "здесь должно быть Ваше имя";
        ServiceT serviceT = new ServiceT();
        //String name1 = serviceT.greetMessage("Саша Иванов");
        String name1 = serviceT.greetMessage(text);
        System.out.println(name1);
    }
}
