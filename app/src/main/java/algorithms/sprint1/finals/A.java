package algorithms.sprint1.finals;

import java.io.*;
import java.util.ArrayList;

public class A {

    public static String calculateShortestWay(String streetLength, String housesNumbers) {
        var numbers = housesNumbers.split(" ");  // 0, 1, 4, 9, 0
        var shortestWay = new ArrayList<String>();              // 0, 1, 2, 1, 0
        var zeroIndexes = new ArrayList<Integer>();             // 0, 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals("0")) {
                zeroIndexes.add(i);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals("0")) {
                shortestWay.add("0");
            } else {
                int diff = Math.abs(i - zeroIndexes.get(0));
                for (Integer zeroIndex : zeroIndexes) {
                    if (Math.abs(i - zeroIndex) < diff) {
                        diff = Math.abs(i - zeroIndex);
                    }
                }
                shortestWay.add(String.valueOf(diff));
            }
        }
        return String.join(" ", shortestWay);
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter outputStream = new BufferedWriter(new FileWriter("output.txt"))) {
            var streetLength = reader.readLine();
            var housesNumbers = reader.readLine();
            var shortestWay = calculateShortestWay(streetLength, housesNumbers);
            outputStream.write(shortestWay);
        }
    }
}
