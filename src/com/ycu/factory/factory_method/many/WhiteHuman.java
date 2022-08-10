package com.ycu.factory.factory_method.many;

import com.ycu.factory.factory_method.simple.HumanFactory;

public class WhiteHuman implements Human {
    @Override
    public void talk() {
        System.out.println("我是白人，说话说英语");
    }
}
