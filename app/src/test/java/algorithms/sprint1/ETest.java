package algorithms.sprint1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ETest {
    @Test
    public void test() {
        var text = "i love segment tree";
        var result = E.getLongestWord(text);
        assertEquals("segment", result);
    }
}
