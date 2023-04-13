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
        var simpleDividers = new ArrayList<Integer>();
//        for (int i = 2; i <= n; i++) {
//            if (n % i == 0) {
//                n = n / i;
//                simpleDividers.add(i);
//            }
//        }
        int divider = 2;
        do {
            if (n % divider == 0) {
                n = n / divider;
                simpleDividers.add(divider);
            } else {
                divider++;
            }
        } while (divider <= n);
        return simpleDividers;
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