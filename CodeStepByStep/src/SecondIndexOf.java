/*
Write a method named secondIndexOf that returns the index of the second occurrence of a particular value in an array
of integers. If the value does not appear in the array at least twice, you should return -1. For example, if an array
called list stores the following values:

// index  0  1   2   3  4   5   6  7   8  9  10
int[] list = {42, 7, -9, 14, 8, 39, 42, 8, 19, 0, 42};

Then the call secondIndexOf(list, 42) should return 6 because the index of the second occurrence of value 42 in the
array is at index 6. The call secondIndexOf(list, 14) should return -1 because value 14 does not occur at least twice
in the array.
 */

public class SecondIndexOf {
    public static void main(String[] args) {
        int[] list = {42, 7, -9, 14, 8, 39, 42, 8, 19, 0, 42};
        System.out.println(secondIndexOf(list, 42)); // Expected value = 6
        System.out.println(secondIndexOf(list, 14)); // Expected value = -1
    }

    public static int secondIndexOf(int[] array, int expected) {
        int occurrences = 0;
        int output = -1;
        int i = 0;
        while(i < array.length && occurrences != 2) {
            if (array[i] == expected) occurrences++;
            i++;
        }
        if (occurrences == 2) output = i-1;
        return output;
    }
}
