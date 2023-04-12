package algorithms.sprint1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class J {

    public static List<Integer> factorize(int n) {
        var integers = new ArrayList<Integer>();
        int divider = 2;
        while(n > 1) {
            if (n % divider == 0) {
                n = n / divider;
                integers.add(divider);
            } else {
                divider++;
            }
        }
        return integers;
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