package algorithms.sprint1;

import org.junit.jupiter.api.Test;

import static algorithms.sprint1.I.isPowerOfFour;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ITest {
    @Test
    public void test1() {
        assertTrue(isPowerOfFour(64));
    }

    @Test
    public void test2() {
        assertFalse(isPowerOfFour(65));
    }

    @Test
    public void test3() {
        assertTrue(isPowerOfFour(1));
    }

    @Test
    public void test4() {
        assertTrue(isPowerOfFour(4));
    }
}
