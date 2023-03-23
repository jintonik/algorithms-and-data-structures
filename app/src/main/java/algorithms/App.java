package algorithms;

import java.util.ArrayList;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    private static List<Integer> movingAverage(int[] timeSeries, int k) {
        var result = new ArrayList<Integer>();
        for (int beginIndex = 0; beginIndex < timeSeries.length - k; beginIndex++) {
            int endIndex = beginIndex + k;
            int currentSum = 0;
            for (int arrayElementIndex = beginIndex; arrayElementIndex < endIndex; arrayElementIndex++) {
                currentSum += timeSeries[arrayElementIndex];
            }
            int currentAverage = currentSum / k;
            result.add(currentAverage);
        }
        return result;
    }

    private static List<Integer> movingAverageUpdated(int[] timeSeries, int k) {
        var result = new ArrayList<Integer>();
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += timeSeries[i];
        }
        result.add(currentSum / k);
        for (int i = 0; i < timeSeries.length - k; i++) {
            currentSum -= timeSeries[i];
            currentSum += timeSeries[i + k];
            int currentAverage = currentSum / k;
            result.add(currentAverage);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        int[] timeSeries = {1,2,4,2,1,7,5,4,6,7,};
        int k = 2;
        for (int element : movingAverageUpdated(timeSeries, k)) {
            System.out.println(element);
        }
    }
}
