package algorithms.sprint1;

import org.junit.jupiter.api.Test;

import static algorithms.sprint1.H.sumOfBinaries;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HTest {
    @Test
    public void test9() {
        var result = sumOfBinaries("0", "101111");
        assertEquals("101111", result);
    }
    @Test
    public void test10() {
        var result = sumOfBinaries("1100", "101111");
        assertEquals("111011", result);
    }
    @Test
    public void test11() {
        var result = sumOfBinaries("11001", "10111100");
        assertEquals("11010101", result);
    }
    @Test
    public void test13() {
        var result = sumOfBinaries(
                "1101110101000001000100101000100101100010101100001111001101011111111",
                "10101001011000011110101111101000101111110111110011000101111000011000101001000010101000");
        assertEquals("10101001011000100000011110010000111000011100110111110010001101111010100010101110100111", result);
    }
}
