package com.example;

public class Triangle {

    //Сторона треугольника
    private static double a;

    //Сторона треугольника
    private static double b;

    //Основание треугольника
    private static double c;

    //Высота треугольника
    private static double h;

    //Угол между двумя сторонами треугольника
    private static float angle;

    public Triangle(double sideOne, double sideTwo, double sideThree){
        a = sideOne;
        b = sideTwo;
        c = sideThree;
    }

    public Triangle(double sideOne, double sideTwo, float angle){
        a = sideOne;
        b = sideTwo;
        Triangle.angle = angle;
    }

    public Triangle(double base, double height){
        c = base;
        h = height;
    }

    //Метод для вычисления периметра треугольника
    public static double perimeterTriangle(){
        return a + b + c;
    }

    //Метод для вычисления площади треугольника через три стороны
    public static double areaThreeSideTriangle(){
        double p = perimeterTriangle();
        return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    }

    //Метод для вычисления площади через две стороны и угол между ними
    public static double areaTwoSideAngleTriangle(){
        return a * b * 0.5 * Math.sin(angle);
    }

    //Метод вычисления площади через основание и высоту
    public static double areaBaseHeightTriangle(){
        return c * h * 0.5;
    }

    //Геттер для стороны треугольника
    public static double getA() {
        return a;
    }

    //Сеттер для стороны треугольника
    public static void setA(double a) {
        Triangle.a = a;
    }

    //Геттер для стороны треугольника
    public static double getB() {
        return b;
    }

    //Сеттер для стороны треугольника
    public static void setB(double b) {
        Triangle.b = b;
    }

    //Геттер для основания треугольника
    public static double getC() {
        return c;
    }

    //Сеттер для основания треугольника
    public static void setC(double c) {
        Triangle.c = c;
    }

    //Геттер для высоты треугольника
    public static double getH() {
        return h;
    }

    //Сеттер для высоты треугольника
    public static void setH(double h) {
        Triangle.h = h;
    }

    //Геттер для угла между двумя сторонами треугольника
    public static float getAngle() {
        return angle;
    }

    //Сеттер для угла между двумя сторонами треугольника
    public static void setAngle(float angle) {
        Triangle.angle = angle;
    }
}
