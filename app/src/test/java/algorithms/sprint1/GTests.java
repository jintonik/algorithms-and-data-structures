package algorithms.sprint1;

import org.junit.jupiter.api.Test;

import static algorithms.sprint1.G.getBinaryNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GTests {
    @Test
    public void test() {
        int decimalNumber = 14;
        var result = getBinaryNumber(decimalNumber);
        assertEquals("1110", result);
    }
}
