package com.ycu.factory.factory_method.simple;

public class YellowHuman extends AbstractHuman {
    public YellowHuman(Integer id, String name, String sex) {
        super(id, name, sex);
    }

    @Override
    public void talk() {

        System.out.println("我是黄种人，说话讲汉语");

    }
}
