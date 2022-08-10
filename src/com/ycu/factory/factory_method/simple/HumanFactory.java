package com.ycu.factory.factory_method.simple;

public class HumanFactory {

    public static <T extends AbstractHuman> T createHuman(Class<T> tClass,int id,String name,String sex){

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
