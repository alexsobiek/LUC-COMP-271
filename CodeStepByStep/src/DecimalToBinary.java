/*
Write a method named decimalToBinary that accepts an integer as a parameter and returns an integer whose digits look
like that number's representation in binary (base-2). For example, the call of decimalToBinary(43) should return 101011.

Constraints: Do not use a string in your solution. Also do not use any built-in base conversion methods like
Integer.toString.
 */

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(43));    // Expected return = 101011
    }

    public static int decimalToBinary(int n) {
        int bin = 0;
        int power = 1;
        while (n>1) {
            bin += power * (n%2);
            power *= 10;
            n = n/2;
        }
        bin += power * n;
        return bin;
    }
}
