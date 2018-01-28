package com.zhanghuanfa.color;

import com.zhanghuanfa.AbstractFactory;
import com.zhanghuanfa.factory.Shape;
import com.zhanghuanfa.shape.Shape;

/**
 * @author zhanghuanfa  2018-01-26 16:08
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(Class clazz) {
        return null;
    }

    @Override
    protected Color getColor(Class clazz) {
        Color color = null;
        try {
            color = (Color) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return color;
    }
}
