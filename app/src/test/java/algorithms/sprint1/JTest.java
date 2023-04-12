package algorithms.sprint1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static algorithms.sprint1.J.factorize;
import static algorithms.sprint1.J.isSimple;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JTest {
    @Test
    public void test1() {
        assertEquals(List.of(2, 2, 2), factorize(8));
    }

    @Test
    public void test2() {
        assertEquals(List.of(862399), factorize(862399));
    }

    @Test
    public void isSimple1() {
        assertTrue(isSimple(63));
    }
}
