package com.ycu.singleton.singletonType3;

public class Singleton {

    private Singleton(){}


    private static class SingletonInstance{

        private static final Singleton SINGLETON = new Singleton();

    }

    public static Singleton getInstance(){


        return SingletonInstance.SINGLETON;
    }










}
