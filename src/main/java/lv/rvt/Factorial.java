package lv.rvt;
import java.util.Scanner;




public class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the result for factorial calculation
        long factorial = 1;

        // Calculate factorial, handling 0! which is defined as 1
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Output the factorial result
        System.out.println("Factorial of " + number + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }
}

