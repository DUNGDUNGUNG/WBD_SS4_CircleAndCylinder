package com.codegym.shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(3.5,"yellow");
        System.out.println(circle1);

        circle.setRadius(5.5);
        circle.setColor("green");
        System.out.println("radius: " + circle.getRadius() + " and color: " + circle.getColor());
    }
}
