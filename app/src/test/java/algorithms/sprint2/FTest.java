package algorithms.sprint2;

import algorithms.sprint2.F.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FTest {

    @Test
    public void test1() {
        String arguments = "8\n"
                + "get_max\n"
                + "push 7\n"
                + "pop\n"
                + "push -2\n"
                + "push -1\n"
                + "pop\n"
                + "get_max\n"
                + "get_max";
        var list = Arrays.stream(arguments.split("\n")).toList();
        Solution.printStack(list);
    }

    @Test
    public void test2() {
        String arguments = "7\n"
                + "get_max\n"
                + "pop\n"
                + "pop\n"
                + "pop\n"
                + "push 10\n"
                + "get_max\n"
                + "push -9";
        var list = Arrays.stream(arguments.split("\n")).toList();
        Solution.printStack(list);
    }
}
