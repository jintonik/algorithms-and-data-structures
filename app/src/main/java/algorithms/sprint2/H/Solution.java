package algorithms.sprint2.H;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {
    public static boolean isCorrectBracketSequence(Stack<String> sequence) {
        if ((sequence.size() == 1) && (sequence.get(0).equals(""))) {
            return true;
        }

        if (sequence.size() % 2 != 0) {
            return false;
        }

        if (isBracketsNumberNotEqual("{", "}", sequence)) {
            return false;
        }
        if (isBracketsNumberNotEqual("[", "]", sequence)) {
            return false;
        }
        if (isBracketsNumberNotEqual("(", ")", sequence)) {
            return false;
        }

        for (int i = 0; i < sequence.size() / 2; i++) {
            if ((sequence.get(i).equals("{") && sequence.get(sequence.size() - 1 - i).equals("}")) ||
                    (sequence.get(i).equals("[") && sequence.get(sequence.size() - 1 - i).equals("]")) ||
                    (sequence.get(i).equals("(") && sequence.get(sequence.size() - 1 - i).equals(")"))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final var string = reader.readLine();
        Stack<String> brackets = new Stack<>();
        brackets.addAll(Arrays.asList(string.split("")));

        System.out.println(capitaliseAnswer(isCorrectBracketSequence(brackets)));
    }

    private static boolean isBracketsNumberNotEqual(String firstBracket, String secondBracket, Stack<String> brackets) {
        int firstBracketsNumber = 0;
        int secondBracketsNumber = 0;
        for (String bracket : brackets) {
            if (firstBracket.equals(bracket)) {
                firstBracketsNumber++;
            }
            if (secondBracket.equals(bracket)) {
                secondBracketsNumber++;
            }
        }
        return firstBracketsNumber != secondBracketsNumber;
    }

    private static String capitaliseAnswer(boolean result) {
        return Pattern.compile("^.").matcher(Boolean.toString(result)).replaceFirst(m -> m.group().toUpperCase());
    }
}