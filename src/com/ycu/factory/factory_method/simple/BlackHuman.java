package com.ycu.factory.factory_method.simple;

public class BlackHuman extends AbstractHuman {



    public BlackHuman(Integer id, String name, String sex) {
        super(id, name, sex);
    }

    @Override
    public void talk() {

        System.out.println("我是黑人，说话别人听不懂");

    }
}
