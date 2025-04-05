package com.example;

public class Rectangle {

    //Длина прямоугольника
    private static double a;

    //Ширина прямоугольника
    private static double b;

    public Rectangle(double length, double width){
        a = length;
        b = width;
    }

    //Метод вычисления площади прямоугольника
    public static double areaRectangle(){
        return a * b;
    }

    //Метод вычисления периметра прямоугольника
    public static double perimeterRectangle(){
        return (a + b) * 2;
    }

    //Геттер длины прямоугольника
    public static double getA() {
        return a;
    }

    //Сеттер длины прямоугольника
    public static void setA(double a) {
        Rectangle.a = a;
    }

    //Геттер ширины прямоугольника
    public static double getB() {
        return b;
    }

    //Сеттер ширины прямоугольника
    public static void setB(double b) {
        Rectangle.b = b;
    }
}
