import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import problems.TwoSum;

public class TwoSumsTest {

    TwoSum twoSums = new TwoSum();

    static int target = 9;
    static int[] firstArray = {2,7,11,15};
    static int[] expected = {0,1};


    @Test
    @DisplayName("Tests that twoSums returns the correct result array when indices are equal on oppsite" +
            "side of array")
    void positiveTestExpectedReturnArrayForEqualIValue() {
        assertArrayEquals(expected, twoSums.twoSum(firstArray,target));
    }
}
