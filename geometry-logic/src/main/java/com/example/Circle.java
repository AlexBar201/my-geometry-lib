package com.example;

public class Circle {

    //Радиус круга
    private static double r;

    public Circle(double radius){
        r = radius;
    }

    //Метод вычисления площади круга
    public static double areaCircle(){
        return Math.PI * Math.pow(r, 2);
    }

    //Метод вычисления периметра круга
    public static double perimeterCircle(){
        return 2 * Math.PI * r;
    }

    //Геттер
    public static double getR() {
        return r;
    }

    //Сеттер
    public static void setR(double r) {
        Circle.r = r;
    }
}
