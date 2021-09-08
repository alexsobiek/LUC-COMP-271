import java.util.Scanner;

/*
Write a console program in a class named FizzBuzz that prompts the user for an integer, then prints all of the numbers
from one to that integer, separated by spaces. Use a loop to print the numbers. But for multiples of three, print
"Fizz" instead of the number, and for the multiples of five print "Buzz". For numbers which are multiples of both three
and five print "FizzBuzz". Drop to a new line after printing each 20 numbers.
 */

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Max value? ");
        int n = stdin.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) System.out.print("FizzBuzz ");
            else if (i % 3 == 0) System.out.print("Fizz ");
            else if (i % 5 == 0) System.out.print("Buzz ");
            else System.out.print(i + " ");
            if (i % 20 == 0) System.out.println();
        }
    }
}

