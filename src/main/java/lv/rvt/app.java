package lv.rvt;
import java.util.Scanner;




public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;  // Variable to keep track of the sum of numbers

        System.out.println("Write numbers:");
        
        // Loop until the user enters -1
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;  // Stop the loop when -1 is entered
            }

            sum += number;  // Add the number to the sum
        }

        // After exiting the loop, print the total sum
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);  // Print the sum
    }
}
