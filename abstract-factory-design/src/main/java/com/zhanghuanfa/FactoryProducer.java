package com.zhanghuanfa;

/**
 * @author zhanghuanfa  2018-01-26 16:07
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(Class<? extends AbstractFactory> clazz) {
        AbstractFactory abstractFactory = null;
        try {
            abstractFactory = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return abstractFactory;
    }
}
