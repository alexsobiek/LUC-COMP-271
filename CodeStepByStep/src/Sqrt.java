/*
Write a method named sqrt that accepts an integer N as a parameter and returns the square root of N as an integer.
The challenge here is that you must not use Math.sqrt or Math.pow or other library methods to calculate the square
root; rather, you must compute it yourself. You should return the square root as a truncated integer; for example,
the square root of 7 is approximately 2.65, but your method should return 2. You may assume that the value of N
passed is a positive integer.
 */

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(sqrt(16));   // Expected output = 4
        System.out.println(sqrt(7));    // Expected output = 2
    }

    public static int sqrt(int num) {
        int root = 1;
        while(num >= (root*root)) root++;
        return root-1;
    }
}
