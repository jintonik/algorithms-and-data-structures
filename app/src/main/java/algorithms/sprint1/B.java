package algorithms.sprint1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

    public static boolean checkParity(int a, int b, int c) {
        final var evenNumbers = new ArrayList<>();
        final var numbers = List.of(a, b, c);
        for (Integer number : numbers) {
            if ((number % 2) == 0) {
                evenNumbers.add(number);
            }
        }
        return (evenNumbers.size() == 0) || (evenNumbers.size() == numbers.size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (checkParity(a, b, c)) {
            System.out.println("WIN");
        } else {
            System.out.println("FAIL");
        }
        scanner.close();
    }

}