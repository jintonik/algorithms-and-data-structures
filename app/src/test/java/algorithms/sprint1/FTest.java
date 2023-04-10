package algorithms.sprint1;

import org.junit.jupiter.api.Test;

import static algorithms.sprint1.F.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FTest {
    @Test
    public void test() {
        var phrase = "A man, a plan, a canal: Panama";
//        var phrase = "madam";
        assertTrue(isPalindrome(phrase));
    }
}
