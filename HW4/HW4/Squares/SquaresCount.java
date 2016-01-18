package HW4.HW4.Squares;

/** Ниже в коде применяется паттерн Copy/Past, когда код просто копируется из одного места в другое и подставляются новые значения.
 * Исправить это можно, применив Math, там где это необходимо, с соответствующими значениями.
 * Этот код исправлен в окнчательной версии этой домашки */

public class SquaresCount {
    public void getSquareCircle (String[] args) {
        double pi, radius, squareCircle;
        pi = 3.14159; //наверное, это можно отнести к "меджик намберс" - вводится константа.
        squareCircle = pi * radius * radius; //здесь нужно поменять, как написано в коментарии, в начале кода
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
