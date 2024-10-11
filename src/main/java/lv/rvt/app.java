package lv.rvt;
import java.util.Scanner;




public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write numbers:");
        
        // Loop until the user enters -1
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;
            }
        }

        // After exiting the loop, print goodbye message
        System.out.println("Thx! Bye!");
    }
}

