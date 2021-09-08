/*
Write a method named factorial that accepts an integer n as a parameter and returns the factorial of n, or n!. A
factorial of an integer is defined as the product of all integers from 1 through that integer inclusive. For example,
the call of factorial(4) should return 1 * 2 * 3 * 4, or 24. The factorial of 0 and 1 are defined to be 1. You may
assume that the value passed is non-negative and that its factorial can fit in the range of type int.
 */

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));   // Expected output = 24
    }

    public static int factorial(int num) {
        int product = 1;
        if (num > 1) for (int i = 2; i <= num; i++) product = product * i;
        return product;
    }
}
