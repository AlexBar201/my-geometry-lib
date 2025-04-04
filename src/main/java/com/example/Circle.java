package com.example;

public class Circle {

    //Радиус круга
    private double r;

    public Circle(double radius){
        this.r = radius;
    }

    //Метод вычисления площади круга
    public double areaCircle(){
        return Math.PI * Math.pow(r, 2);
    }

    //Метод вычисления периметра круга
    public double perimeterCircle(){
        return 2 * Math.PI * r;
    }

    //Геттер
    public double getR() {
        return r;
    }

    //Сеттер
    public void setR(double r) {
        this.r = r;
    }
}
