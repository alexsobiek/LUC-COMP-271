/*
Write a method named containsTwice that accepts a string and a character as parameters and returns true if that
character occurs two or more times in the string. For example, the call of containsTwice("hello", 'l') should
return true because there are two 'l' characters in that string.
 */

public class ContainsTwice {
    public static void main(String[] args) {
        System.out.println(containsTwice("hello", 'l'));
    }

    public static boolean containsTwice(String word, char character) {
        int occurrences = 0;
        for (char c : word.toCharArray()) if (c == character) occurrences++;
        return occurrences > 1;
    }

}
