package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();

        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            String[] parts = input.split(",");
            names.add(parts[0]);
            birthYears.add(Integer.parseInt(parts[1]));
        }

        String longestName = "";
        int sum = 0;

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            sum += birthYears.get(i);

            if (name.length() > longestName.length()) {
                longestName = name;
            }sebastian,2017
            lucas,2017
            lily,2017
            hanna,2014
            gabriel,2009
        }

        double averageBirthYear = (double) sum / birthYears.size();

        System.out.println("Longest name: " + longestName);
        System.out.printf("Average of the birth years: %.1f%n", averageBirthYear);
    }
}

    