package HW4.HW4.Squares;

public class SquaresCount {
    public static double getSquareCircle (double pi = 3.14159, double radius, double squareCircle) {
        squareCircle = pi * radius * radius;
        return squareCircle;
    }
    public static double getSquareTriangle (int a = 2, double cathet1, double cathet2, double squareTriangle) {
        squareTriangle = cathet1 * cathet2 / a;
        return squareTriangle;
    }
    public static double getSquareRectangle (double side1, double side2, double squareRectangle) {
        squareRectangle = side1 * side2;
        return squareRectangle;
    }
}
