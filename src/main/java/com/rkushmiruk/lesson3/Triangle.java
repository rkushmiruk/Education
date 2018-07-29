package com.rkushmiruk.lesson3;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double area() {
        return ((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y)) / 2;
    }

    private double lengthOfSide(Point a, Point b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    }

    public double perimeter() {
        return lengthOfSide(a, b) + lengthOfSide(a, c) + lengthOfSide(b, c);
    }

}
