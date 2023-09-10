package tasks.kata8;

import java.math.BigDecimal;

//Your job is to find the gravitational force between two spherical objects (obj1 , obj2).
public class GravityForce {
    public static double solution(double[] arrVal, String[] arrUnit) {
        double[] massConversionFactors = {1.0, 0.001, 1e-6, 1e-9, 0.453592};
        double[] distanceConversionFactors = {1.0, 0.01, 1e-3, 1e-6, 0.3048};

        double m1 = arrVal[0] * massConversionFactors[indexOfUnit(arrUnit[0])];
        double m2 = arrVal[1] * massConversionFactors[indexOfUnit(arrUnit[1])];
        double r = arrVal[2] * distanceConversionFactors[indexOfUnit(arrUnit[2])];

        return (6.67e-11 * m1 * m2) / (r * r);
    }

    private static int indexOfUnit(String unit) {
        return switch (unit) {
            case "kg" -> 0;
            case "g" -> 1;
            case "mg" -> 2;
            case "μg" -> 3;
            case "lb" -> 4;
            case "m" -> 0;
            case "cm" -> 1;
            case "mm" -> 2;
            case "μm" -> 3;
            case "ft" -> 4;
            default -> throw new IllegalArgumentException("Invalid unit: " + unit);
        };
    }
}
