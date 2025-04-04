package com.example;

public class Triangle {

    //Сторона треугольника
    private double a;

    //Сторона треугольника
    private double b;

    //Основание треугольника
    private double c;

    //Высота треугольника
    private double h;

    //Угол между двумя сторонами треугольника
    private float angle;

    public Triangle(double sideOne, double sideTwo, double sideThree){
        this.a = sideOne;
        this.b = sideTwo;
        this.c = sideThree;
    }

    public Triangle(double sideOne, double sideTwo, float angle){
        this.a = sideOne;
        this.b = sideTwo;
        this.angle = angle;
    }

    public Triangle(double base, double height){
        this.c = base;
        this.h = height;
    }

    //Метод для вычисления периметра треугольника
    public double perimeterTriangle(){
        return a + b + c;
    }

    //Метод для вычисления площади треугольника через три стороны
    public double areaThreeSideTriangle(){
        double p = perimeterTriangle();
        return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    }

    //Метод для вычисления площади через две стороны и угол между ними
    public double areaTwoSideAngleTriangle(){
        return a * b * 0.5 * Math.sin(angle);
    }

    //Метод вычисления площади через основание и высоту
    public double areaBaseHeightTriangle(){
        return c * h * 0.5;
    }

    //Геттер для стороны треугольника
    public double getA() {
        return a;
    }

    //Сеттер для стороны треугольника
    public void setA(double a) {
        this.a = a;
    }

    //Геттер для стороны треугольника
    public double getB() {
        return b;
    }

    //Сеттер для стороны треугольника
    public void setB(double b) {
        this.b = b;
    }

    //Геттер для основания треугольника
    public double getC() {
        return c;
    }

    //Сеттер для основания треугольника
    public void setC(double c) {
        this.c = c;
    }

    //Геттер для высоты треугольника
    public double getH() {
        return h;
    }

    //Сеттер для высоты треугольника
    public void setH(double h) {
        this.h = h;
    }

    //Геттер для угла между двумя сторонами треугольника
    public float getAngle() {
        return angle;
    }

    //Сеттер для угла между двумя сторонами треугольника
    public void setAngle(float angle) {
        this.angle = angle;
    }
}
