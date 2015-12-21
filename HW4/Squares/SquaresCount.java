package HW4.HW4.Squares;

public class SquaresCount {
    public void getSquareCircle (String[] args) {
        double pi, radius, squareCircle;
        pi = 3.14159;
        squareCircle = pi * radius * radius;
        System.out.println(squareCircle);
    }
    public void getSquareTriangle (String[] args) {
        int a = 2;
        double cathet1, cathet2, squareTriangle;
        squareTriangle = cathet1 * cathet2 / a;
        System.out.println(squareTriangle);
    }
    public void getSquareRectangle (String[] args) {
        double side1, side2, squareRectangle;
        squareRectangle = side1 * side2;
        System.out.println(squareRectangle);
    }
}
