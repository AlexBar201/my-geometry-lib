package com.example;

public class Rectangle {

    //Длина прямоугольника
    private double a;

    //Ширина прямоугольника
    private double b;

    public Rectangle(double length, double width){
        this.a = length;
        this.b = width;
    }

    //Метод вычисления площади прямоугольника
    public double areaRectangle(){
        return a * b;
    }

    //Метод вычисления периметра прямоугольника
    public double perimeterRectangle(){
        return (a + b) * 2;
    }

    //Геттер длины прямоугольника
    public double getA() {
        return a;
    }

    //Сеттер длины прямоугольника
    public void setA(double a) {
        this.a = a;
    }

    //Геттер ширины прямоугольника
    public double getB() {
        return b;
    }

    //Сеттер ширины прямоугольника
    public void setB(double b) {
        this.b = b;
    }
}
