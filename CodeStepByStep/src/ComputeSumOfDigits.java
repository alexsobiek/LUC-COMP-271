import java.util.Scanner;

/*
Write a console program in a class named ComputeSumOfDigits that prompts the user to type an integer and computes the
sum of the digits of that integer. You may assume that the user types a non-negative integer. Match the following
output format:

Type an integer: 827104
Digit sum is 22
*/

public class ComputeSumOfDigits {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Type an integer: ");
        int num = stdin.nextInt();
        String[] numbers = String.valueOf(num).split("(?<=.)");
        int total = 0;
        for (String n : numbers) total += Integer.parseInt(n);
        System.out.println("Digit sum is " + total);
    }
}
