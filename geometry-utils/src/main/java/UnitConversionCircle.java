public class UnitConversionCircle {

    //Преобразование радиуса круга в строку
    public static String radiusToString(double radius){
        return String.valueOf(radius) + "см";
    }

    //Преобразование радиуса круга в int
    public static int radiusToInt(double radius){
        return (int) Math.round(radius);
    }

    //Преобразование радиуса круга в float
    public static float radiusToFloat(double radius){
        return (float) radius;
    }

    //Преобразование радиуса круга в byte
    public static byte radiusToByte(double radius){
        return (byte) Math.round(radius);
    }

    //Преобразование радиуса круга в short
    public static short radiusToShort(double radius){
        return (short) Math.round(radius);
    }
}
