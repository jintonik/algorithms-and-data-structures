package algorithms.sprint1.finals;

import org.junit.jupiter.api.Test;

import static algorithms.sprint1.finals.A.calculateShortestWay;
import static org.junit.jupiter.api.Assertions.*;

class ATest {

    @Test
    void test1() {
        var shortestWay = calculateShortestWay("5", "0 1 4 9 0");
        assertEquals("0 1 2 1 0", shortestWay);
    }

    @Test
    void test2() {
        var shortestWay = calculateShortestWay("6", "0 7 9 4 8 20");
        assertEquals("0 1 2 3 4 5", shortestWay);
    }

    @Test
    void test3() {
        //9
        //98 0 10 77 0 59 28 0 94
        var shortestWay = calculateShortestWay("9", "98 0 10 77 0 59 28 0 94");
        assertEquals("1 0 1 1 0 1 1 0 1", shortestWay);
    }
}