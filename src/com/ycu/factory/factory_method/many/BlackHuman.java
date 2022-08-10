package com.ycu.factory.factory_method.many;

public class BlackHuman implements Human {
    @Override
    public void talk() {
        System.out.println("我是黑人，说话别人听不懂");
    }
}
