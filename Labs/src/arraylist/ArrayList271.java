package arraylist;

import java.lang.reflect.Array;
import java.util.Arrays;

@SuppressWarnings("unchecked")
public class ArrayList271<T> {
    private T t;
    private T[] a;
    private int pointer = -1;

    /**
     * Constructor
     */
    public ArrayList271() {
        a = (T[]) new Object[10];
    }

    /**
     * Constructor
     * @param size Initial Array Size
     */
    public ArrayList271(int size) {
        a = (T[]) new Object[size];
    }

    /**
     * Expands the array by the provided size
     * @param size Integer
     */
    private void expandArray(int size) {
        T[] b = (T[]) new Object[a.length + size]; // Increase array by 1
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }

    /**
     * Adds an Object to the array
     * @param object Object
     */
    public void add(T object) {
        if (pointer < a.length-1) pointer++;
        else expandArray(10);
        if (!contains(object)) a[pointer] = object;
    }

    /**
     * Concatenates two arrays together
     * @param a T[]
     * @param b T[]
     * @return T[]
     */
    private T[] concatenate(T[] a, T[] b) {
        T[] c = (T[]) Array.newInstance(a.getClass().getComponentType(), a.length + b.length);
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }

    /**
     * Removes an Object to the array
     * @param object Object
     */
    public void remove(T object) {
        int location = find(object);
        if (location > -1) { // exists
            T[] l = Arrays.copyOfRange(a, 0, location);
            T[] r = Arrays.copyOfRange(a, location+1, pointer+1);
            pointer--;
            a = concatenate(l, r);
        }
    }

    /**
     * Gets the Object at the supplied index
     * @param index Integer
     */
    public T get(int index) {
        T o = null;
        if (index <= pointer) o = a[index];
        return o;
    }

    /**
     * Finds an Object in the ArrayList271
     * @param object Object
     * @return int
     */
    public int find(T object) {
        int i = 0;
        boolean exists = false;
        while(!exists && i < a.length) {
            exists = a[i].equals(object);
            i++;
        }
        if (!exists) i = -1;
        return i-1;
    }

    /**
     * Returns whether an object exists in the ArrayList271 or not
     * @param object Object
     * @return boolean
     */
    public boolean contains(T object) {
        boolean result = false;
        int i = 0;
        while (!result && i < a.length) {
            if (a[i] != null) result = a[i].equals(object);
            i++;
        }
        return result;
    }

    /**
     * Returns the raw array
     * @return T[]
     */
    public T[] toArray() {
        return Arrays.copyOfRange(a, 0, pointer+1);
    }

    /**
     * Returns a formatted String of the array
     * @return String
     */
    public String toString() {
        return Arrays.toString(toArray());
    }

}
