/*
Write a method named swapPairs that accepts an array of strings as a parameter and switches the order of values in a
pairwise fashion. Your method should switch the order of the first two values, then switch the order of the next two,
switch the order of the next two, and so on.
 */

import java.util.Arrays;

public class SwapPairs {

    public static void main(String[] args) {
        // Expected output = {"score", "four", "seven", "and", "ago", "years"}
        System.out.println(Arrays.toString(swapPairs(new String[]{"four", "score", "and", "seven", "years", "ago"})));
        // Expected output = {"be", "to", "not", "or", "be", "to", "hamlet"}
        System.out.println(Arrays.toString(swapPairs(new String[]{"to", "be", "or", "not", "to", "be", "hamlet"})));
    }

    public static String[] swapPairs(String[] array) {
        String[] copy = array.clone();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0 && i == array.length-1) array[i] = copy[i-1];
            else if (i % 2 == 0 && i == array.length - 1) array[i] = copy[i];
            else if (i % 2 == 0 && i + 1 < array.length) array[i] = copy[i + 1];
            else array[i] = copy[i - 1];
        }
        return array;
    }

}
