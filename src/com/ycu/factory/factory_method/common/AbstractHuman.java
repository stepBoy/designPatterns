package com.ycu.factory.factory_method.common;

public abstract class AbstractHuman {

    private Integer id;
    private String name;

    private String sex;


    public AbstractHuman(Integer id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public void walk(){

        System.out.println("我是人，我会走路");
    }

    public abstract void talk();
}
