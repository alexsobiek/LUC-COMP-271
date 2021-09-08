import java.util.Arrays;

/*
Write a method called copyRange that copies part of an array into another array. Your method accepts five parameters:
the two arrays a1 and a2, two starting indexes i1 and i2, and a length l, and copies the first l elements of a1 starting
at index i1 into array a2 starting at index i2.

For example, given the following two arrays:


int[] a1 = {1, 2, 3, 4, 5, 6};
int[] a2 = {21, 22, 23, 24, 25, 26};
copyRange(a1, a2, 0, 3, 2);
After the preceding call, the contents of a2 would be {21, 22, 23, 1, 2, 26}. You may assume that the parameters'
values are valid, that the arrays are large enough to hold the data, and so on.
 */

public class CopyRange {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {21, 22, 23, 24, 25, 26};
        copyRange(a1, a2, 0, 3, 2);
        System.out.println(Arrays.toString(a2)); // Expected output {21, 22, 23, 1, 2, 26}
    }


    public static void copyRange(int[] a1, int[] a2, int i1, int i2, int length) {
        // Copy length of elements of a1 starting at i1 into a2 starting at i2

        for (int i = i2; i <= length; i++) {
            a2[i] = a1[i1];
            i1++;
        }

    }

}
