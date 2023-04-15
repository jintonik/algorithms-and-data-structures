package algorithms.sprint1.finals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class A {

    public static String calculateShortestWay(String streetLength, String housesNumbers) {
        var numbers = Arrays.stream(housesNumbers.split(" "))
                .map(Integer::parseInt)
                .toList()
                .toArray(new Integer[Integer.parseInt(streetLength)]);
        var shortestWay = new ArrayList<String>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                shortestWay.add("0");
            }
            else {
                shortestWay.add(String.valueOf(calculateMinimalDelta(i, numbers)));
            }
        }
        return String.join(" ", shortestWay);
    }

    private static int calculateMinimalDelta(int nonZeroIndex, Integer[] numbers) {
        int wayToZeroRight = 0;
        for (int i = nonZeroIndex; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                break;
            }
            wayToZeroRight++;
        }
        int wayToZeroLeft = 0;
        for (int i = nonZeroIndex; i >= 0; i--) {
            if (numbers[i] == 0) {
                break;
            }
            wayToZeroLeft++;
        }
        return Math.min(wayToZeroLeft, wayToZeroRight);
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            var streetLength = reader.readLine();
            var housesNumbers = reader.readLine();
            var shortestWay = calculateShortestWay(streetLength, housesNumbers);
            System.out.println(shortestWay);
        }
    }
}
