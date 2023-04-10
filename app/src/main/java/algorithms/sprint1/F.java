package algorithms.sprint1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class F {

    private static final String REG_EXP = "[^A-Za-z0-9]+";

    public static boolean isPalindrome(String text) {
        var symbols = text.replaceAll(REG_EXP,"").toLowerCase().toCharArray();
        int maxSymbol = symbols.length - 1;
        for (int i = 0; i < symbols.length / 2; i++) {
            if (symbols[i] != symbols[maxSymbol - i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String text = reader.readLine();
            if (isPalindrome(text)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}