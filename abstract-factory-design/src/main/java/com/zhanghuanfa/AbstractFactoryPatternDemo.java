package com.zhanghuanfa;

import com.zhanghuanfa.color.Color;
import com.zhanghuanfa.color.ColorFactory;
import com.zhanghuanfa.color.Red;
import com.zhanghuanfa.shape.Circle;
import com.zhanghuanfa.shape.Shape;
import com.zhanghuanfa.shape.ShapeFactory;

/**
 * @author zhanghuanfa  2018-01-26 17:16
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(ShapeFactory.class);
        AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory.class);
        Shape circle = shapeFactory.getShape(Circle.class);
        circle.draw();
        Color red = colorFactory.getColor(Red.class);
        red.fill();
    }
}
