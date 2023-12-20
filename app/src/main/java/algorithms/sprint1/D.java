package algorithms.sprint1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
import java.io.IOException;


public class D {

    public static int getWeatherRandomness(List<Integer> temperatures) {
        int temperaturesNumber = 0;
        if (temperatures.size() == 1) {
            return 1;
        }
        if (temperatures.get(0) > temperatures.get(1)) {
            temperaturesNumber++;
        }
        int maxIndex = temperatures.size() - 1;
        if (temperatures.get(maxIndex) > temperatures.get(maxIndex - 1)) {
            temperaturesNumber++;
        }
        for (int i = 1; i < temperatures.size() - 1; i++) {
            int temperature = temperatures.get(i);
            if ((temperature > temperatures.get(i - 1))
                    && (temperature > temperatures.get(i + 1))) {
                temperaturesNumber++;

            }
        }
        return temperaturesNumber;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> temperatures = readList(reader);
            int chaosNumber = getWeatherRandomness(temperatures);
            System.out.println(chaosNumber);
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}