import java.util.ArrayList;
import java.util.Collections;

public class MinMaxCalculation {

    public static double min(double ... numbers) {
        double minValue = numbers[0];

        // Iterate through the array to find the minimum value
        for (double num : numbers) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    public static double max(double ... numbers) {
        double maxValue = numbers[0];

        // Iterate through the array to find the minimum value
        for (double num : numbers) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }
}