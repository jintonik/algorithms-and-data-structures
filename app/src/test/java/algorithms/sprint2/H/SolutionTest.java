package algorithms.sprint2.H;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @ValueSource(strings = {"{[()]}", "{}[]()", ""})
    void isCorrectBracketSequence_SequenceCorrect(String value) {
        final var sequence = new Stack<String>();
        sequence.addAll(Arrays.asList(value.split("")));
        final var result = Solution.isCorrectBracketSequence(sequence);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"{[()]}}", "{[()]}}}"})
    void isCorrectBracketSequence_SequenceIncorrect(String value) {
        final var sequence = new Stack<String>();
        sequence.addAll(Arrays.asList(value.split("")));
        final var result = Solution.isCorrectBracketSequence(sequence);

        assertFalse(result);
    }
}