import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberProcessorTest {

    @Test
    void testMixed() {
        int[] arr = {2, 3};
        assertEquals(-1, NumberProcessor.processNumbers(arr));
    } 

    // Path coverage
    @Test
    void testAllEven() {
        int[] arr = {2, 4};
        assertEquals(6, NumberProcessor.processNumbers(arr));
    }

    @Test
    void testAllOdd() {
        int[] arr = {1, 3};
        assertEquals(-4, NumberProcessor.processNumbers(arr));
    }

    @Test
    void testMixed() {
        int[] arr = {2, 3};
        assertEquals(-1, NumberProcessor.processNumbers(arr));
    }

    @Test
    void testEmpty() {
        int[] arr = {};
        assertEquals(0, NumberProcessor.processNumbers(arr));
    }
}
