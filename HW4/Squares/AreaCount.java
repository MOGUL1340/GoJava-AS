package HW4.HW4.Squares;

java.lang.Math.abs(4);

public class AreaCount {
    public static double getAreaCircle (double radius, double areaCircle) {
        areaCircle = Math.PI * Math.pow(radius, 2);
        return areaCircle;
    }
    public static double getAreaTriangle (int a = 2, double cathet1, double cathet2, double areaTriangle) {
        areaTriangle = cathet1 * cathet2 / a;
        return areaTriangle;
    }
    public static double getAreaRectangle (double side1, double side2, double areaRectangle) {
        areaRectangle = side1 * side2;
        return areaRectangle;
    }
}
