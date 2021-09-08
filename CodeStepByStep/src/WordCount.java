/*
Write a method named wordCount that accepts a string as its parameter and returns the number of words in the string. A
word is a sequence of one or more non-space characters (any character other than ' '). For example, the call of
wordCount("hello, how are you?") should return 4.

Constraints: Do not use a Scanner to help you solve this problem. Do not use any data structures such as arrays to help
you solve this problem. Do not use the String method split on this problem. But you can declare as many simple
variables like int, char, etc. as you like. Declaring String variables is also fine.
 */

public class WordCount {
    public static void main(String[] args) {
        System.out.println(wordCount("hello, how are you?"));                       // Expected return = 4
        System.out.println(wordCount("  this  string   has    wide spacing  "));    // Expected return = 5
    }

    public static int wordCount(String input) {
        int words = 0;
        input = input.trim().replaceAll(" +", " ");
        for (int i = 0; i < input.length(); i++) {
            while(i < input.length() && input.charAt(i) != ' ') i++;
            words++;
        }
        return words;
    }

}
