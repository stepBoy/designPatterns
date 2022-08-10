package com.ycu.factory.factory_method.many;

public class Test {
    public static void main(String[] args) {

        Human human = new BlackHumanFactory().createHuman();

        human.talk();

        Human human1 = new WhiteHumanFactory().createHuman();

        human1.talk();

        System.out.println("testGit");
        System.out.println("testGit");

        System.out.println("=================");












    }
}
