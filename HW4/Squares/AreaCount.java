package HW4.HW4.Squares;

public class AreaCount {
    public static double getAreaCircle (double radius) {
        areaCircle = Math.PI * Math.pow(radius, 2);
        return areaCircle;
    }
    public static double getAreaTriangle (double cathet1, double cathet2) {
        int a = 2;
        areaTriangle = cathet1 * cathet2 / a;
        return areaTriangle;
    }
    public static double getAreaRectangle (double side1, double side2) {
        areaRectangle = side1 * side2;
        return areaRectangle;
    }
}
