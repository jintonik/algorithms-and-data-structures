package algorithms.sprint1.finals;

import java.io.*;
import java.util.ArrayList;

public class A {

    public static String calculateShortestWay(String streetLength, String housesNumbers) {
        var numbers = housesNumbers.split(" ");  // 0, 1, 4, 9, 0
        var stringBuilder = new StringBuilder();       // 0, 1, 2, 1, 0
        int housesNumber = Integer.parseInt(streetLength);
        int zeroDistance = 0;                          //98 0 10 77 0 59 28 0 94
        for (int i = 0; i < housesNumber; i++) {       // 0 1  2  3 4  5  6 7  8
            int left;
            int right;
            int previousZeroIndex = i - zeroDistance;
            if (numbers[i].equals("0") && previousZeroIndex == 0) {
                for (int j = 0; j <= i; j++) {
                    stringBuilder.append(Math.abs(i - j));
                    stringBuilder.append(" ");
                }
            }
            if (!numbers[i].equals("0")) {
                zeroDistance++;
            }
            if (numbers[i].equals("0") && previousZeroIndex > 0) {
                for (int j = previousZeroIndex + 1; j < i; j++) {
                    left = Math.abs(previousZeroIndex - j);
                    right = Math.abs(i - j);
                    stringBuilder.append(Math.min(left, right));
                    stringBuilder.append(" ");
                }
                zeroDistance = 0;
            }
            if (i == housesNumber - 1 && previousZeroIndex > 0) {
                for (int j = previousZeroIndex + 1; j <= i ; j++) {
                    stringBuilder.append(Math.abs(i - previousZeroIndex));
                    stringBuilder.append(" ");
                }
            }
        }
//
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i].equals("0")) {
//                zeroIndexes.add(i);
//            }
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i].equals("0")) {
//                stringBuilder.append(0);
//                stringBuilder.append(" ");
//            } else {
//                int diff = Math.abs(i - zeroIndexes.get(0));
//                for (Integer zeroIndex : zeroIndexes) {
//                    if (Math.abs(i - zeroIndex) < diff) {
//                        diff = Math.abs(i - zeroIndex);
//                    }
//                }
//                stringBuilder.append(diff);
//                stringBuilder.append(" ");
//            }
//        }
        var result = stringBuilder.toString();
        return result.substring(0, result.length() - 1);
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
