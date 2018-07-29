package com.rkushmiruk.lesson3;

public class Main {

    public static void main(String[] args) {
        //First Triangle
        Point point11 = new Point(6, 2);
        Point point12 = new Point(3, 4);
        Point point13 = new Point(8, 7);

        Triangle triangle1 = new Triangle(point11, point12, point13);

        System.out.println(triangle1.area());
        System.out.println(triangle1.perimeter());

        //Second Triangle
        Point point21 = new Point(6, 2);
        Point point22 = new Point(-3, 4);
        Point point23 = new Point(8, -7);

        Triangle triangle2 = new Triangle(point21, point22, point23);

        System.out.println(triangle2.area());
        System.out.println(triangle2.perimeter());

        //Third Triangle
        Point point31 = new Point(6, 3);
        Point point32 = new Point(5, -4);
        Point point33 = new Point(11, 7);

        Triangle triangle3 = new Triangle(point31, point32, point33);

        System.out.println(triangle3.area());
        System.out.println(triangle3.perimeter());

    }

}
