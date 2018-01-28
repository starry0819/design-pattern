package com.zhanghuanfa.shape;

import com.zhanghuanfa.AbstractFactory;
import com.zhanghuanfa.color.Color;

/**
 * 形状工厂
 * @author zhanghuanfa  2018-01-22 14:13
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    protected Shape getShape(Class clazz) {
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

    @Override
    protected Color getColor(Class clazz) {
        return null;
    }

}
