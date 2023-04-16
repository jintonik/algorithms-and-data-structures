package algorithms.sprint1.finals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A {

    public static String calculateShortestWay(String streetLength, String housesNumbers) {
        var numbers = housesNumbers.split(" ");
        var shortestWay = new ArrayList<String>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals("0")) {
                shortestWay.add("0");
            }
            else {
                int counter = 0;
                while (counter <= numbers.length) {
                    counter++;
                    if (i - counter >= 0) {
                        if (numbers[i - counter].equals("0")) {
                            shortestWay.add(String.valueOf(counter));
                            break;
                        }
                    }
                    if (i + counter < numbers.length) {
                        if (numbers[i + counter].equals("0")) {
                            shortestWay.add(String.valueOf(counter));
                            break;
                        }
                    }
                }
            }
        }
        return String.join(" ", shortestWay);
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
