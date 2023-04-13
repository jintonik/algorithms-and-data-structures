package algorithms.sprint1.finals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

    public static String calculateShortestWay(String streetLength, String housesNumbers) {
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
