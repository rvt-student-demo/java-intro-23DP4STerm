package lv.rvt;
import java.util.Scanner;




public class PrintToHundred {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number less than 100: ");
        int number = scanner.nextInt();

        // Print numbers from the input number to 100
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }

        // Close the scanner
        scanner.close();
    }
}
