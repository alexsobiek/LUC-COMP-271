import java.util.HashSet;

/*
Write a method named countDuplicates that accepts an array of integers
as a parameter and that returns the number of duplicate values in the array.
A duplicate value is a value that also occurs earlier in the array.
For example, if an array named a contains [1, 4, 2, 4, 7, 1, 1, 9, 2, 3, 4, 1],
then the call of countDuplicates(a) should return 6 because there are three duplicates of the value 1,
one duplicate of the value 2, and two duplicates of the value 4.

Constraints: The array could be empty or could contain only a single element; in such cases,
your method should return 0. Do not modify the contents of the array.
*/

public class CountDuplicates {
    public static void main(String[] args) {
        System.out.println(countDuplicates(new int[]{1, 4, 2, 4, 7, 1, 1, 9, 2, 3, 4, 1}));  // expected return = 6
        System.out.println(countDuplicates(new int[]{0, 0, -1, -1, -1, 5, 5, 5, 0, 0}));     // expected return = 7
        System.out.println(countDuplicates(new int[]{42, 42, 42, 42}));                      // expected return = 3
        System.out.println(countDuplicates(new int[]{2, 4, 6}));                             // expected return = 0
        System.out.println(countDuplicates(new int[]{1, 3, 3}));                             // expected return = 1
        System.out.println(countDuplicates(new int[]{2, 4, 6, 8, 10, 12, -2, -4}));          // expected return = 0
        System.out.println(countDuplicates(new int[]{2, 4, 6, 8, 10, 12, -2, -4, 2}));       // expected return = 1
    }

    public static int countDuplicates(int[] values){
        HashSet<Integer> checked = new HashSet<>();
        if (values.length > 1) {
            int duplicates = 0;
            for (int i = 0; i < values.length; i++) {
                if (checked.contains(values[i])) continue;
                checked.add(values[i]);
                for (int j = i+1; j < values.length ; j++) if (i != j && values[i] == values[j]) duplicates++;
            }
            return duplicates;
        } else return 0;
    }
}
