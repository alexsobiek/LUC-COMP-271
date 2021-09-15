/*'
Write a method named isUnique that takes an array of integers as a parameter and that returns a boolean value
indicating whether or not the values in the array are unique (true for yes, false for no). The values in the list
are considered unique if there is no pair of values that are equal.
 */

import java.util.HashSet;

public class IsUnique {
    public static void main(String[] args) {

    }

    public static boolean isUnique(int[] values){
        HashSet<Integer> checked = new HashSet<>();
        int duplicates = 0;
        if (values.length > 1) {
            for (int i = 0; i < values.length; i++) {
                if (checked.contains(values[i])) continue;
                checked.add(values[i]);
                for (int j = i+1; j < values.length ; j++) if (i != j && values[i] == values[j]) duplicates++;
            }
        }
        return duplicates == 0;
    }

}
