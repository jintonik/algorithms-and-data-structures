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
            for (int v = beginIndex; v < endIndex; v++) {
                currentSum += timeSeries[v];
            }
            int currentAverage = currentSum / k;
            result.add(currentAverage);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        int[] timeSeries = {1,2,4,2,1,7,5,4,6,7,};
        int k = 2;
        for (int element : movingAverage(timeSeries, k)) {
            System.out.println(element);
        }
    }
}
