package HW4.HW4.Dots;

import java.lang.Math;


public class DistanceDots {
    public static double getDistance(double x1, double x2, double y1, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;

        double res =  Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2);
        return res;
    }
}
