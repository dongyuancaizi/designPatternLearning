package com.ilike.oct;

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
        if(shape.m_type==1){
            drawRectangle(shape);
        }else if(shape.m_type==2){
            drawCircle(shape);
        }else if(shape.m_type==3){
            drawTriangle(shape);
        }

    }

    /**
     * 绘制圆形
     * @param shape
     */
    private void drawCircle(Shape shape) {
        System.out.println("绘制圆形");
    }

    /**
     * 绘制矩形
     * @param shape
     */
    private void drawRectangle(Shape shape) {
        System.out.println("绘制矩形");
    }

    /**
     * 绘制三角形
     * @param shape
     */
    private void drawTriangle(Shape shape) {
        System.out.println("绘制三角形");
    }


}

/**
 * 基类
 */
class Shape{
    int m_type;
}

/**
 * 矩形
 */
class Rectangle extends Shape{
    public Rectangle() {
        super.m_type=1;
    }
}

/**
 * 圆形
 */
class Circle extends Shape{
    public Circle() {
        super.m_type=2;
    }
}

/**
 * 新增画三角形
 */
class Triangle extends Shape{
    public Triangle() {
        super.m_type=3;
    }
}

