/*
Write a method named isPalindrome that accepts a string parameter and returns true if that string is a palindrome, or
false if it is not a palindrome.

For this problem, a palindrome is defined as a string that contains exactly the same sequence of characters forwards as
backwards, case-insensitively. For example, "madam" or "racecar" are palindromes, so the call of
isPalindrome("racecar") would return true. Spaces, punctuation, and any other characters should be treated the same as
letters; so a multi-word string such as "dog god" could be a palindrome, as could a gibberish string such as
"123 $$ 321". The empty string and all one-character strings are palindromes by our definition. Your code should ignore
case, so a string like "Madam" or "RACEcar" would also count as palindromes.
 */

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));                  // Expected output = true
        System.out.println(isPalindrome("racecar"));                // Expected output = true
        System.out.println(isPalindrome("X"));                      // Expected output = true
        System.out.println(isPalindrome(" !  "));                   // Expected output = false
        System.out.println(isPalindrome("she sells seashells"));    // Expected output = false
    }

    public static boolean isPalindrome(String string) {
        boolean isPalindrome = !(string == null);
        int i = 0;
        if (isPalindrome) {
            string = string
                        .toLowerCase()
                        .replaceAll("/[^a-zA-Z ]/", "");
            while (isPalindrome && i < string.length()/2) {
                isPalindrome = string.charAt(i) == string.charAt(string.length()-i-1);
                i++;
            }
        }
        return isPalindrome;
    }
}



