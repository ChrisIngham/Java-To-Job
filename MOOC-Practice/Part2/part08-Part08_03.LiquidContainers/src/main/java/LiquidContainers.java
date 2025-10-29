
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0, second = 0;
        while (true) {

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount >= 0) {
                if (command.equals("add")) {
                    // add liquids to first container
                    // total < 100
                    first += amount;
                    if (first > 100) {
                        first = 100;
                    }
                }

                if (command.equals("move")) {
                    // move from first to second
                    // if amount > first, just move all first
                    // total < 100, for second
                    if (amount > first) {
                        second += first;
                        first = 0;
                    } else {
                        second += amount;
                        first -= amount;
                    }

                    if (second > 100) {
                        second = 100;
                    }
                }

                if (command.equals("remove")) {
                    // remove from second
                    // cannot remove to negative
                    second -= amount;
                    if (second < 0) {
                        second = 0;
                    }
                }
            }

        }
    }

}
