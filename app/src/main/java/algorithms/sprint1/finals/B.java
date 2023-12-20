package algorithms.sprint1.finals;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class B {

    public static int fastHands(int keysNumber, List<String> trainerFields) {
        var numbers = getNumbers(trainerFields);
        if (numbers.isEmpty()) {
            return 0;
        }
        var timeSet = new HashSet<>(numbers);
        int score = 0;
        for (int time : timeSet) {
            final var selectedItemsNumber = getSelectedItemsPerTime(time, numbers);
            if (keysNumber * 2 >= selectedItemsNumber.size()) {
                score++;
            }
        }
        return score;
    }

    private static List<Integer> getNumbers(List<String> trainerFields) {
        var numbers = new ArrayList<Integer>();
        var stringsWithoutDots = new ArrayList<String>();

        for (String row : trainerFields) {
            stringsWithoutDots.add(row.replace(".", ""));
        }
        for (String row : stringsWithoutDots) {
            for (String stringNumber : row.split("")) {
                var number = getIntegerNumber(stringNumber);
                if (number != -1) {
                    numbers.add(Integer.valueOf(stringNumber));
                }
            }
        }
        return numbers;
    }

    private static int getIntegerNumber(String stringNumber) {
        try {
            return Integer.parseInt(stringNumber);
        }
        catch (NumberFormatException e) {
            return -1;
        }
    }

    private static List<Integer> getSelectedItemsPerTime(int time, List<Integer> numbers) {
        final List<Integer> selectedItems = new ArrayList<>();
        for (int number : numbers) {
            if (time == number) {
                selectedItems.add(number);
            }
        }
        return selectedItems;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int keysNumber = Integer.parseInt(reader.readLine());
            var trainerStrings = new ArrayList<String>();
            for (int i = 1; i <= 4; i++) {
                trainerStrings.add(reader.readLine());
            }
            var shortestWay = fastHands(keysNumber, trainerStrings);
            System.out.println(shortestWay);
        }
    }
}
