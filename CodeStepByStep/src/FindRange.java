import java.util.Arrays;

/*
Write a method named findRange that accepts an array of integers as a parameter and returns the range of values
contained in the array, which is equal to one more than the difference between its largest and smallest element. For
example, if the largest element is 17 and the smallest is 6, the range is 12. If the largest and smallest values are
the same, the range is 1.

Constraints: You may assume that the array contains at least one element (that its length is at least 1). You should
not modify the contents of the array.
*/

public class FindRange {

    public static void main(String[] args) {
        System.out.println(findRange(new int[]{8, 3, 5, 7, 2, 4}));         // Expected output = 7
        System.out.println(findRange(new int[]{15, 22, 8, 19, 31}));        // Expected output = 24
        System.out.println(findRange(new int[]{3, 10000000, 5, -29, 4}));   // Expected output = 10000030
        System.out.println(findRange(new int[]{100, 5}));                   // Expected output = 96
        System.out.println(findRange(new int[]{32}));                       // Expected output = 1
    }

    public static int findRange(int[] values) {
        int[] newValues = values.clone();
        Arrays.sort(newValues);
        int largest = newValues[values.length-1];
        int smallest = newValues[0];
        return largest-smallest+1;
    }
}
