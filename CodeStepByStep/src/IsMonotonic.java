/*
Write a method named isMonotonic that accepts an array of integers as a parameter and returns true if the array's
element values are monotonic; that is, whether the array is entirely in ascending or descending order. For example,
if an array called a stores {2, 5, 7, 18} or {9, 6, 2, 2, 0, -4}, then the call of isMonotonic(a) should return true.
If the array not in monotonic order, such as {4, 8, 7, 11, 12}, return false. An empty, one-element, or two-element
array is always considered to be monotonic.

An optimal solution runs in O(N) time and uses a constant amount of extra space. You should not modify the contents of
the array passed to your method.
 */

public class IsMonotonic {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{2, 5, 7, 18}));        // Expected return = true
        System.out.println(isMonotonic(new int[]{9, 6, 2, 2, 0, -4}));  // Expected return = true
        System.out.println(isMonotonic(new int[]{4, 8, 7, 11, 12}));    // Expected return = false
    }
    public static boolean isMonotonic(int[] array) {
        boolean result = true;
        if (array.length > 2) {
            boolean ascending = array[0] <= array[1];
            for (int i = 1; i < array.length-1; i++) {
                if (ascending) result = result && array[i] <= array[i+1];
                else {
                    result = result && array[i] >= array[i+1];
                }
            }
        }
        return result;
    }
}
