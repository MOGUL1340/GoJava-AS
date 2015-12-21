package HW4.HW4.Converter;

public class TemperatureConverter {
    public double main(String[] args) {
    }
    public static double getCelsiusToFarengheit(double cel) {
        return cel * 1.8 + 32;
    }
    public static double getFarengheitToCelsius(double far) {
        return (far - 32) / 1.8;
    }
}
