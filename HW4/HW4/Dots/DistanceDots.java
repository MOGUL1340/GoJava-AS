package HW4.HW4.Dots;

public class DistanceDots {
    public static double getDistance(double x1, double x2, double y1, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;

        double res =  Math.sqrt(dx * dx + dy * dy);
        return res;
    }
}
