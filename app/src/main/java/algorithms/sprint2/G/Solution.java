package algorithms.sprint2.G;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder outputBuffer = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int linesNumber = Integer.parseInt(reader.readLine());
        Stack numbers = new Stack();
        for (int i = 0; i < linesNumber; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String command = tokenizer.nextToken();
            if (command.equals("pop") && numbers.pop().equals("error")) {
                outputBuffer.append(numbers.pop()).append("\n");
            }
            if (command.equals("get_max")) {
                outputBuffer.append(numbers.getMax()).append("\n");
            }
            if (command.equals("push")) {
                int number = Integer.parseInt(tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "");
                numbers.push(number);
            }
        }
        System.out.println(outputBuffer);
    }

    static class Stack {
        private final List<Integer> items;

        public Stack() {
            items = new LinkedList<>();
        }

        public void push(int item) {
            items.add(item);
        }

        public String pop() {
            return items.size() == 0 ? "error" : String.valueOf(items.remove(items.size() - 1));
        }

        public int peek() {
            return items.get(items.size() - 1);
        }

        public int size() {
            return items.size();
        }

        public String getMax() {
            if (items.size() == 0) {
                return "None";
            }
            return String.valueOf(Collections.max(items));
        }
    }
}