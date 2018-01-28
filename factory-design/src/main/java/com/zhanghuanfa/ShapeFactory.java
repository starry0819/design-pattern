package com.zhanghuanfa;

/**
 * 形状工厂
 * @author zhanghuanfa  2018-01-22 14:13
 */
public class ShapeFactory {

    public Shape getShape(Class clazz) {
        Shape shape = null;
        try {
            shape = (Shape) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return shape;
    }

}
