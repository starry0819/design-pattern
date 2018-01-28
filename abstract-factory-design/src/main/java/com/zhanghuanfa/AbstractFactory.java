package com.zhanghuanfa;

import com.zhanghuanfa.color.Color;
import com.zhanghuanfa.shape.Shape;

/**
 * @author zhanghuanfa  2018-01-26 15:56
 */
public abstract class AbstractFactory {
    protected abstract Shape getShape(Class clazz);

    protected abstract Color getColor(Class clazz);
}