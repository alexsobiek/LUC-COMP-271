package palindrome;

public class PalindromeResult {
    private final boolean isPalindrome;
    private final int equalityUsage;

    public PalindromeResult(boolean isPalindrome, int equalityUsage) {
        this.isPalindrome = isPalindrome;
        this.equalityUsage = equalityUsage;
    }

    public boolean isPalindrome() {
        return isPalindrome;
    }
    public int getEqualityUsage() {
        return equalityUsage;
    }
}

