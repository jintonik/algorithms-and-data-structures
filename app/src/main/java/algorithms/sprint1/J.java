package algorithms.sprint1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class J {

    public static List<Integer> factorize(int n) {
        var integers = new ArrayList<Integer>();
        var simpleNumbers = new ArrayList<Integer>();
        if (isSimple(n)) {
            return Collections.singletonList(n);
        }
        int number = n;
        for (int i = 2; i <= n; i++) {
            if (number % i == 0) {

            }
        }
        for (int simpleNumber : simpleNumbers) {
        }
//        int divideResult = n;
//        while (divideResult % i == 0) {
//            divideResult = divideResult / i;
//            integers.add(i);
//        }
        return integers;
    }

    public static boolean isSimple(int number) {
        if (number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.printf("The number '%s' could be divided by '%s'.", number, i);
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = readInt(reader);
            List<Integer> factorization = factorize(n);
            for (int elem : factorization) {
                writer.write(elem + " ");
            }
        }
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}