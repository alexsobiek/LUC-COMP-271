package palindrome;

import arraylist.ArrayList271;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ProcessBook {

    private static int wordsRead = 0;
    private static int palindromesFoundWithForLoop = 0;
    private static int palindromesFoundWithWhileLoop = 0;
    private static int equalityOperatorUsageWithForLoop = 0;
    private static int equalityOperatorUsageWithWhileLoop = 0;

    private static final ArrayList271<String> palindromes = new ArrayList271<>(100);

    public static void main(String[] args) {
        findPalindromes("https://www.gutenberg.org/cache/epub/66203/pg66203.txt");
        reportResults();
    }

    /**
     * Reads the content of a web page into a Scanner object
     * @param link URL to read from
     * @return Scanner
     */
    static Scanner connectToBook(String link) {
        Scanner s = null;
        try {
            URL url = new URL(link);
            s = new Scanner(url.openStream());
        } catch (IOException e) {
            System.out.println(link + " is not a valid URL!");
            e.printStackTrace();
        }
        return s;
    }

    // https://www.gutenberg.org/cache/epub/66203/pg66203.txt
    static void findPalindromes(String url) {
        Scanner s = connectToBook(url);
        while(s.hasNext()) {
            String next = s.next();
            // For Loop
            PalindromeResult forLoop = StringUtilities.isPalindromeOriginal(next);
            if (forLoop.isPalindrome()) palindromesFoundWithForLoop++;
            equalityOperatorUsageWithForLoop += forLoop.getEqualityUsage();

            //While Loop
            PalindromeResult whileLoop = StringUtilities.isPalindrome(next);
            if (forLoop.isPalindrome()) palindromesFoundWithWhileLoop++;
            equalityOperatorUsageWithWhileLoop += whileLoop.getEqualityUsage();
            wordsRead++;

            palindromes.add(next);

        }
    }

    static void reportResults() {
        System.out.println("Scanned " + wordsRead + " words to find");
        System.out.println(palindromesFoundWithForLoop +
                " with the for-loop method (equality operator called " +
                equalityOperatorUsageWithForLoop + " times).");
        System.out.println(palindromesFoundWithWhileLoop +
                " with the while-loop method (equality operator called " +
                equalityOperatorUsageWithWhileLoop + " times).");
    }

}
