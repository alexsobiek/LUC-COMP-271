/*
Write a method named indexOf that returns the index of a particular value in an array of integers. The method should
return the index of the first occurrence of the target value in the array. If the value is not in the array, it should
return -1. For example, if an array called list stores the following values:


int[] list = {42, 7, -9, 14, 8, 39, 42, 8, 19, 0};
Then the call indexOf(list, 8) should return 4 because the index of the first occurrence of value 8 in the array is at
index 4. The call indexOf(list, 2) should return -1 because value 2 is not in the array.
 */

public class IndexOf {

    public static void main(String[] args) {
        int[] list = {42, 7, -9, 14, 8, 39, 42, 8, 19, 0};
        System.out.println(indexOf(list, 8));       // Expected result = 4
        System.out.println(indexOf(list, 2));       // Expected result = -1
    }

    public static int indexOf(int[] array, int value) {
        int index = -1;
        int i = 0;
        while (i < array.length && index == -1) {
            if (array[i] == value) index = i;
            i++;
        }
        return index;
    }
}
