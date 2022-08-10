package com.ycu.factory.factory_method.simple;

public class WhiteHuman extends AbstractHuman {
    public WhiteHuman(Integer id, String name, String sex) {
        super(id, name, sex);
    }

    @Override
    public void talk() {

        System.out.println("我是白人，说话说英语");

    }
}
