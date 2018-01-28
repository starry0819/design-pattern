package com.zhanghuanfa;

/**
 * 工厂模式demo
 * @author zhanghuanfa  2018-01-26 15:46
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape(Circle.class);
        circle.draw();
        Shape rectangle = shapeFactory.getShape(Rectangle.class);
        rectangle.draw();
        Shape square = shapeFactory.getShape(Square.class);
        square.draw();
    }
}
