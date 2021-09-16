package palindrome;

public class StringUtilities {

    /**
     * Removes all spaces, non-letters, and converts the String to lower case.
     * @param string Input String
     * @return Washed String
     */
    static String wash(String string) {
        return string
                .toLowerCase()
                .replaceAll(" ", "")
                .replaceAll("/[^a-zA-Z ]/", "");
    }

    /**
     * Returns a PalindromeResult record containing the result and equality operator usage.
     * @param string Input String
     * @return PalindromeResult
     */
    static PalindromeResult isPalindrome(String string) {
        boolean isPalindrome = !(string == null) && string.length() > 0;
        int i = 0;
        if (isPalindrome) {
            string = wash(string);
            while (isPalindrome && i < string.length()/2) {
                isPalindrome = string.charAt(i) == string.charAt(string.length()-i-1);
                i++;
            }
        }
        return new PalindromeResult(isPalindrome, i);
    }

    /**
     * Original isPalindrome() method. Returns a PalindromeResult record containing the result and equality operator usage.
     * @param string Input String
     * @return PalindromeResult
     */
    static PalindromeResult isPalindromeOriginal(String string) {
        int equalityUsage = 0;
        /* Assume that string is a palindrome */
        boolean isPalindrome = true;
        /* Convert to lowercase, remove everything but letters */
        string = string.toLowerCase().replaceAll("[^a-z]", "");
        /* Create a local variable with string length, for readability */
        int len = string.length();
        /* Check every pair of letters, from both sides of the string moving towards its center */
        for (int i = 0; i < len / 2; i++) {
            /* Left letter of pair */
            char leftOfCenter = string.charAt(i);
            /* Right letter of pair. Remember that len-1 is the last letter of a string due to 0-based counting. */
            char rightOfCenter = string.charAt(len - 1 - i);
            /* Are pair letters the same? True if same, false otherwise.*/
            boolean pairSame = leftOfCenter == rightOfCenter;
            equalityUsage++;
            /*
            Update result. Remember AND operation's truth table:
                 p      q      p && q
                 false  false  false
                 false  true   false
                 true   false  false
                 true   true   true
             */
            isPalindrome = isPalindrome && pairSame;
        } // end for
        return new PalindromeResult(isPalindrome, equalityUsage);
    }
}
