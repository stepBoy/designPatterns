package com.ycu.singleton.singletonType1;

public class Test {

    public static void main(String[] args) {
        com.ycu.singleton.singletonType1.Singleton instance1 = com.ycu.singleton.singletonType1.Singleton.getInstance();
        com.ycu.singleton.singletonType1.Singleton instance2 = com.ycu.singleton.singletonType1.Singleton.getInstance();

        System.out.println(instance1==instance2);
    }
}
