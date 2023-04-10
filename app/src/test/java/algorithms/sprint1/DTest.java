package algorithms.sprint1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DTest {
    @Test
    public void test() {
        var temperatures = List.of(-1, -10, -8, 0, 2, 0, 5);
        var result = D.getWeatherRandomness(temperatures);
        assertEquals(3, result);
    }
}
