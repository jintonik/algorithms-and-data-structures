package algorithms.sprint1.finals;

import org.junit.jupiter.api.Test;

import java.util.List;

import static algorithms.sprint1.finals.B.fastHands;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BTest {
    @Test
    public void test1() {
        int actualResult = fastHands(3, List.of("1231", "2..2", "2..2", "2..2"));
        assertEquals(2, actualResult);
    }

    @Test
    public void test2() {
        int actualResult = fastHands(4, List.of("1111", "9999", "1111", "9911"));
        assertEquals(1, actualResult);
    }

    @Test
    public void test3() {
        int actualResult = fastHands(4, List.of("1111", "1111", "1111", "1111"));
        assertEquals(0, actualResult);
    }

    @Test
    public void test4() {
        int actualResult = fastHands(4, List.of("....", "....", "....", "...."));
        assertEquals(0, actualResult);
    }
}
