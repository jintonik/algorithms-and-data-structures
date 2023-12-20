package algorithms.sprint1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G {

    public static String getBinaryNumber(int n) {
        int decimalNUmber = n;
        StringBuilder result = new StringBuilder();
        do {
            result.append(decimalNUmber % 2);
            decimalNUmber = decimalNUmber / 2;
        } while (decimalNUmber  >= 1);
        return result.reverse().toString();
    }
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = readInt(reader);
            System.out.println(getBinaryNumber(n));
        }
    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }
}