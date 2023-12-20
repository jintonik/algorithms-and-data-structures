package algorithms.sprint2;

import algorithms.sprint2.G.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Stack;

public class GTest {
    @Test
    public void test1() {
        String arguments = "10\n"
                + "pop\n"
                + "pop\n"
                + "push 4\n"
                + "push -5\n"
                + "push 7\n"
                + "pop\n"
                + "pop\n"
                + "get_max\n"
                + "pop\n"
                + "get_max";
        var commands = new Stack<String>();
        commands.addAll(Arrays.stream(arguments.split("\n")).toList());
    }
}
