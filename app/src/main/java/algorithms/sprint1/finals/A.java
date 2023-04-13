package algorithms.sprint1.finals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class A {

    public static String calculateShortestWay(String streetLength, String housesNumbers) {

        //0 1 4 9 0

        var numbers = Arrays.stream(housesNumbers.split(" "))
                .map(Integer::parseInt)
                .toList()
                .toArray(new Integer[Integer.parseInt(streetLength)]);
        var shortestWay = new ArrayList<Integer>();
        int numbersIncrease = 0;
        int numbersDecrease = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {

            }
        }
        return "";
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
