import java.util.Objects;

public class StringUtilities {
    public static void main(String[] args) {
        System.out.println(isPalindrome("did")); // normal test - true
        System.out.println(isPalindrome("Race car")); // spaces and caps test - true
        System.out.println(isPalindrome(null)); // null test - false

    }

    /**
     * Returns a boolean for whether or the input String is a palindrome or not.
     * @param string Input String
     * @return Boolean
     */
    static boolean isPalindrome(String string) {
        boolean result = !(string == null) && string.length() > 0;
        if (result) {
            string = wash(string);
            int len = string.length();
            int i = 0;
            while (result && i < len/2) {
                result = string.charAt(i) == string.charAt(len-i-1);
                i++;
            }
        }
        return result;
    }

    /**
     * Removes all spaces, non-letters, and converts the String to lower case.
     * @param string Input String
     * @return Washed String
     */
    static String wash(String string) {
        return string
                .toLowerCase()
                .replaceAll(" ", "")
                .replaceAll("/[^a-zA-Z ]/,", "");
    }
}
