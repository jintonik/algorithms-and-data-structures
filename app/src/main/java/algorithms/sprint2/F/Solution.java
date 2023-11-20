package algorithms.sprint2.F;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void printStack(List<String> commands) {
        var numbers = new Stack<Integer>();
        for (String element : commands) {
            var command = parseCommand(element);
            if (command.getCommandText().contains("push")) {
                numbers.push(command.commandArgument);
            }
            if (command.getCommandText().contains("pop")) {
                popNumberOrPrintError(numbers);
            }
            if (command.getCommandText().contains("get_max")) {
                printMaxNumber(numbers);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        var input = new Scanner(System.in);
        var lines = new ArrayList<String>();
        String lineNew;
        while (input.hasNextLine()) {
            lineNew = input.nextLine();
            if (lineNew.isEmpty()) {
                break;
            }
            lines.add(lineNew);
        }
        printStack(lines);
    }

    private static void printMaxNumber(Stack<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("None");
            return;
        }
        var maxNumber = numbers.stream()
                .max(Integer::compareTo)
                .orElse(null);
        System.out.println(maxNumber);
    }

    private static void popNumberOrPrintError(Stack<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("error");
            return;
        }
        numbers.pop();
    }

    private static Command parseCommand(String command) {
        var arguments = command.split(" ");
        var commandObj = new Command();
        commandObj.setCommandText(arguments[0]);
        commandObj.setCommandArgument(arguments.length == 2 ? Integer.parseInt(arguments[1]) : -1);
        return commandObj;
    }

    private static class Command {
        private String commandText;
        private Integer commandArgument;

        public String getCommandText() {
            return commandText;
        }

        public void setCommandText(String commandText) {
            this.commandText = commandText;
        }

        public int getCommandArgument() {
            return commandArgument;
        }

        public void setCommandArgument(int commandArgument) {
            this.commandArgument = commandArgument;
        }
    }
}