package lv.rvt;
import java.util.Scanner;




public class app {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;  // Variable to keep track of the sum
        int count = 0;  // Variable to count how many numbers have been entered

        System.out.println("Write numbers:");
        
        // Loop until the user enters -1
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;  // Stop the loop when -1 is entered
            }

            sum += number;  // Add the number to the sum
            count++;  // Increment the count for each valid number
        }

        // After exiting the loop, print the total sum, count, and mean
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);

        // Only calculate the mean if at least one number was entered
        if (count > 0) {
            double mean = (double) sum / count;  // Calculate the mean (using double for accuracy)
            System.out.println("Average: " + mean);  // Print the mean
        } else {
            System.out.println("Average: N/A");  // In case no numbers were entered
        }
    }
}
