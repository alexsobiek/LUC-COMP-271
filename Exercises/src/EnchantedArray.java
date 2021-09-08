import java.util.Objects;

public class EnchantedArray {
    private String[] a; // Underlying array of the class
    private int inUse;

    /**
     * Default Constructor
     */
    public EnchantedArray() {
        a = new String[10]; // Arbitrary value
        inUse = 0;
    }

    /**
     * Parameterized Constructor
     * @param size Number of elements in array
     */
    public EnchantedArray(int size) {
        a = new String[size];
        inUse = 0;
    }

    /**
     * Adds a new String to the array
     * @param string String to add
     */
    public void add(String string) {
        if (inUse < a.length) inUse++;
        else { // a is full, make more room
            String[] b = new String[a.length + 1]; // Increase array by 1
            System.arraycopy(a, 0, b, 0, a.length);
            a = b;
        }
        a[inUse] = string;
    }

    /**
     * Returns the string from the given index
     * @param index Position in the array
     * @return String
     */
    public String get(int index) {
        String s = null;
        if (index <= inUse) s = a[index];
        return s;
    }

    /**
     * Checks the array for the given string
     * @param string String to search for
     * @return boolean
     */
    public boolean contains(String string) {
        boolean result = false;
        int i = 0;
        while (!result && i < a.length) {
            result = a[i].equals(string);
            i++;
        }
        return result;
    }

    /**
     * Returns the inUse value
     * @return int
     */
    public int getInUse() {
        return inUse;
    }
}
