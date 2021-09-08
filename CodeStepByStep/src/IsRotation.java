/*
Write a method named isRotation that accepts two strings as parameters and returns true if they are rotations of each
other. Two strings are considered rotations if they contain the same characters in the same relative order when wrapped
around. For example, the call of isRotation("abcde", "deabc") should return true. The call of
isRotation("abcde", "edcba") should return false because the characters are not in the same order. A string is also
considered to be its own rotation.
 */

public class IsRotation {
    public static void main(String[] args) {
        System.out.println(isRotation("abcde", "deabc"));       // Expected result = true
        System.out.println(isRotation("deabc", "abcde"));       // Expected result = true
        System.out.println(isRotation("abcde", "edcba"));       // Expected result = false

    }

public static boolean isRotation(String a1, String a2) {
    boolean result = a1.equals(a2);
    int i = 1;
    while(!result && i < a1.length()) {
        result = a1.substring(0, i).equals(a2.substring(a2.length()-i)) &&
                a1.substring(i).equals(a2.substring(0, a2.length()-i));
        i++;
    }
    return result;
}

}
