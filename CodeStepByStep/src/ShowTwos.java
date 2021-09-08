/*
Write a method named showTwos that shows the factors of 2 in a given integer. For example, the following calls should
produce the following console output:

Call	        Output
showTwos(7);	7 = 7
showTwos(18);	18 = 2 * 9
showTwos(68);	68 = 2 * 2 * 17
showTwos(120);	120 = 2 * 2 * 2 * 15
The idea is to express the number as a product of factors of 2 and an odd number. The number 120 has 3 factors of 2
multiplied by the odd number 15. For odd numbers (e.g. 7), there are no factors of 2, so you just show the number
itself. Assume that your method is passed a number greater than 0.
 */

public class ShowTwos {
    public static void main(String[] args) {
        showTwos(7);    // Expected output: 7 = 7
        showTwos(18);   // Expected output: 18 = 2 * 9
        showTwos(68);	// Expected output: 68 = 2 * 2 * 17
        showTwos(120);	// Expected output: 120 = 2 * 2 * 2 * 15
    }

    public static void showTwos(int n) {
        System.out.print(n + " = " );
        if (n % 2 == 0)
            while (n % 2 == 0) {
                System.out.print("2 * ");
                n = n/2;
            }
        System.out.print(n + "\n");
    }

}
