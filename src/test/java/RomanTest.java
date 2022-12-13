import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import roman.RomanToInt;

import static org.junit.jupiter.api.Assertions.*;

public class RomanTest {

    RomanToInt romanString = new RomanToInt();

    int first = romanString.romanToInt("III");
    int second = romanString.romanToInt("LVIII");
    int third = romanString.romanToInt("MCMXCIV");

    @Test
    @DisplayName("Expected output of method should be correct")
    void correctOutputTest() {
        assertEquals(3, first);
        assertEquals(58, second);
        assertEquals(1994, third);
    }
}
