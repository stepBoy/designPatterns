package com.ycu.factory.factory_method.common;

public abstract class AbstractHumanFactory {

    public abstract <T extends AbstractHuman> T createHuman(Class<T> tClass,int id,String name,String sex);
}
