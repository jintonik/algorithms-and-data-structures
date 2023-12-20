package algorithms.sprint1.finals;

import java.io.*;

public class A {

    public static String calculateShortestWay(String streetLength, String housesNumbers) {
        var numbers = housesNumbers.split(" ");
        var stringBuilder = new StringBuilder();
        int housesNumber = Integer.parseInt(streetLength);
        int previousZeroIndex = -1;
        for (int i = 0; i < housesNumber; i++) {
            int left;
            int right;
            if (numbers[i].equals("0")) {
                if (previousZeroIndex != -1) {
                    for (int j = previousZeroIndex + 1; j <= i; j++) {
                        left = Math.abs(previousZeroIndex - j);
                        right = Math.abs(i - j);
                        stringBuilder.append(Math.min(left, right));
                        stringBuilder.append(" ");
                    }
                } else {
                    for (int j = 0; j <= i; j++) {
                        stringBuilder.append(Math.abs(i - j));
                        stringBuilder.append(" ");
                    }
                }
                previousZeroIndex = i;
            }
            if (i == housesNumber - 1) {
                for (int j = previousZeroIndex + 1; j <= i; j++) {
                    stringBuilder.append(Math.abs(j - previousZeroIndex));
                    stringBuilder.append(" ");
                }
            }
        }
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
