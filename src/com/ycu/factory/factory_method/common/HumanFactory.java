package com.ycu.factory.factory_method.common;

import java.lang.reflect.InvocationTargetException;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends AbstractHuman> T createHuman(Class<T> tClass,int id,String name,String sex) {

        T human = null;

        try {
             human = tClass.getConstructor(Integer.class, String.class, String.class)
                    .newInstance(id, name, sex);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return human;
    }
}
