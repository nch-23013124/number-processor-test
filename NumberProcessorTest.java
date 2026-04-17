import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberProcessorTest {

    @Test
    void testMixed() {
        int[] arr = {2, 3};
        assertEquals(-1, NumberProcessor.processNumbers(arr));
    }    
}
