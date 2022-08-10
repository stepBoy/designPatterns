package com.ycu.factory.factory_method.common;

public class Test {

    public static void main(String[] args) {

        AbstractHuman human = new HumanFactory()
                .createHuman(BlackHuman.class, 1, "jack", "man");

        human.walk();

        human.talk();

        System.out.println("========================");

        AbstractHuman human1 = new HumanFactory()
                .createHuman(WhiteHuman.class, 2, "tom", "man");

        human1.walk();

        human1.talk();

    }
}
