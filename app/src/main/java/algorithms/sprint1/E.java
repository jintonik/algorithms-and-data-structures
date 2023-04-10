package algorithms.sprint1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class E {

    public static String getLongestWord(String text) {
        var words = text.split(" ");
        var maxWord = words[0];
        for (String word : words) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }
        return maxWord;
    }
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int textLength = readInt(reader);
            String text = reader.readLine();
            String longestWord = getLongestWord(text);
            System.out.println(longestWord);
            System.out.println(longestWord.length());
        }

    }

    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

}