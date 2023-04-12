package algorithms.sprint1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static algorithms.sprint1.J.factorize;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void test3() {
        assertEquals(List.of(3, 3, 7), factorize(63));
    }

    @Test
    public void test4() {
        assertEquals(List.of(13, 70578583), factorize(917521579));
    }
}
