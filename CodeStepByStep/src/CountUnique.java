import java.util.HashSet;

/*
Write a method named countUnique that accepts an array of integers as a parameter and returns a count of the number of
unique values that occur in the array. If the array contains multiple occurrences of the same element value, only one
of those occurrences should count toward your total. For example, if an array named numbers stores
{7, 7, 2, 2, 1, 2, 2, 7}, the call of countUnique(numbers) should return 3 because there are 3 unique values: 7, 2,
and 1.

Constraints: In solving this problem, do not create any other data structures such as arrays, strings, etc., though you
may create as many simple variables (e.g. int, double) as you like. Do not modify the array passed to your method as
the parameter, such as by sorting or rearranging its element values.
 */

public class CountUnique {

    public static void main(String[] args) {
        System.out.println(countUnique(new int[]{7, 7, 2, 2, 1, 2, 2, 7}));     // Expected result = 3
        System.out.println(countUnique(new int[]{42}));                         // Expected result = 0
    }

    public static int countUnique(int[] values){
        HashSet<Integer> checked = new HashSet<>();
        int unique = 0;
        if (values.length > 0) {
            for (int value : values) checked.add(value);
            unique = checked.size();
        }
        return unique;
    }

}
