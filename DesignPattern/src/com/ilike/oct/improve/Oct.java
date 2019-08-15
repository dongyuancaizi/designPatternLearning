package com.ilike.oct.improve;

/**
 * 开闭原则
 */
public class Oct {


    public static void main(String[] args) {
        //测试
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.drawShape(new Rectangle());
        graphEditor.drawShape(new Circle());
        graphEditor.drawShape(new Triangle());
        graphEditor.drawShape(new Other());
    }
}

/**
 * 用于绘图的类[使用方]
 */
class GraphEditor{

    /**
     * 接受shape对象，根据m_type绘制不同的图形
     * @param shape
     */
    public void drawShape(Shape shape){
        shape.draw();
    }
}

/**
 * 基类
 */
 abstract class Shape{
    int m_type;

    public abstract void draw();
}

/**
 * 矩形
 */
class Rectangle extends Shape {
    public Rectangle() {
        super.m_type=1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

/**
 * 圆形
 */
class Circle extends Shape {
    public Circle() {
        super.m_type=2;
    }
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

/**
 * 三角形
 */
class Triangle extends Shape {
    public Triangle() {
        super.m_type=3;
    }
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

/**
 * 其他图形
 */
class Other extends Shape {
    public Other() {
        super.m_type=4;
    }
    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}

