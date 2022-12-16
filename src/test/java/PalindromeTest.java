import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import problems.Palindrome;

public class PalindromeTest {

    @Test
    @DisplayName("Palindrome positive test with odd number of digits")
    void PalindromePositiveTestOdd() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome(121));
    }

    @Test
    @DisplayName("Palindrome negative test")
    void PalindromeNegativeTest() {
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.isPalindrome(-121));
    }

    @Test
    @DisplayName("Palindrome positive test for one digit")
    void PalindromePositiveTestSingle() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome(1));
    }


    @Test
    @DisplayName("Palindrome positive test for numbers with even amount of digits")
    void PalindromePositiveTestEven() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome(4224));
    }
}
