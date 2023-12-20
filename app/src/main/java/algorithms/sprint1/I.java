package algorithms.sprint1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class I {

    public static boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        int number = 4;
        while (true) {
            if (number == n) {
                return true;
            }
            if (number > n) {
                return false;
            }
            number *= 4;
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = readInt(reader);
            if (isPowerOfFour(n)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

}