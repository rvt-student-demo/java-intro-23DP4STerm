package lv.rvt;
import java.util.Scanner;




public class SumNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Variables to keep track of the sum and count of numbers
        int sum = 0;
        int count = 0;
        int number;

        // Keep asking for input until the user enters 0
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();

            // Add the number to the sum and increment the count if it's not zero
            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);

        // Output the results
        System.out.println("Total numbers entered (excluding 0): " + count);
        System.out.println("Sum of the numbers: " + sum);

        // Close the scanner
        scanner.close();
    }
}

