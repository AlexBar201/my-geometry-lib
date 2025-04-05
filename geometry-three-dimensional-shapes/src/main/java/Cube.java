public class Cube {

    private static double a;

    public Cube(double sideLength){
        a = sideLength;
    }

    public static double areaCube(){
        return 6 * Math.pow(a, 2);
    }

    public static double volumeCube(){
        return Math.pow(a, 3);
    }

    public static double getA() {
        return a;
    }

    public static void setA(double a) {
        Cube.a = a;
    }
}
