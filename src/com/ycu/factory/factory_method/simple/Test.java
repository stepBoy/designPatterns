package com.ycu.factory.factory_method.simple;



public class Test {
    public static void main(String[] args) {

        BlackHuman human = HumanFactory.createHuman(BlackHuman.class, 1, "jack", "man");

        human.talk();

        human.walk();




    }
}
