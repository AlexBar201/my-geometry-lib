public class Sphere {

    private static double r;

    public Sphere(double radiusSphere){
        r = radiusSphere;
    }

    public static double areaSphere(){
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double volumeSphere(){
        return ((double) 4 / 3) * Math.PI * Math.pow(r, 3);
    }

    public static double getR() {
        return r;
    }

    public static void setR(double r) {
        Sphere.r = r;
    }
}
