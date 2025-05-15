import java.util.Scanner;

public class MonthlyTemps {
    public static void main(String[] args) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        int[] temperatures = {32, 35, 45, 55, 65, 75, 80, 78, 70, 60, 50, 38};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the 2025 Annual Temperature App!");
        System.out.println();

        while (true) {
            // Prompt user
            System.out.println("Type the desired month (e.g. January or December), type 'year' to view the full report, or type 'exit' to quit:");
            System.out.print("Enter your choice: ");
            String userInput = scanner.nextLine();

            System.out.println(); // Spacer

            // Exit condition
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Later Gator!");
                break;
            }

            // Show full year report
            if (userInput.equalsIgnoreCase("year")) {
                int total = 0;
                int highest = temperatures[0];
                int lowest = temperatures[0];

                System.out.println("Monthly Temperatures:");
                for (int i = 0; i < 12; i++) {
                    System.out.println(months[i] + ": " + temperatures[i] + "°F");
                    total += temperatures[i];

                    if (temperatures[i] > highest) {
                        highest = temperatures[i];
                    }

                    if (temperatures[i] < lowest) {
                        lowest = temperatures[i];
                    }
                }

                double average = total / 12.0;

                System.out.println(); // Spacer
                System.out.printf("Yearly Average: %.2f°F\n", average);
                System.out.println("Highest Monthly Average: " + highest + "°F");
                System.out.println("Lowest Monthly Average: " + lowest + "°F");
                System.out.println(); // Spacer

            } else {
                boolean matched = false;

                for (int i = 0; i < 12; i++) {
                    if (userInput.equalsIgnoreCase(months[i])) {
                        System.out.println(months[i] + ": " + temperatures[i] + "°F");
                        matched = true;
                        break;
                    }
                }

                if (!matched) {
                    System.out.println("Invalid month entered.");
                }

                System.out.println(); // Spacer
            }
        }

        scanner.close();
    }
}
