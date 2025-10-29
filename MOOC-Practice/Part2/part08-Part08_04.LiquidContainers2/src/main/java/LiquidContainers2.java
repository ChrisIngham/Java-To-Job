
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        while (true) {

            System.out.println("First: " + first);
            System.out.println("Second: " + second);
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
                    first.add(amount);
                }

                if (command.equals("move")) {
                    // move from first to second
                    // if amount > first, just move all first
                    // total < 100, for second
                    if (amount > first.contains()) {
                        second.add(first.contains());
                        first.remove(amount);
                    } else {
                        second.add(amount);
                        first.remove(amount);

                    }
                }

                if (command.equals("remove")) {
                    // remove from second
                    // cannot remove to negative
                    second.remove(amount);
                }
            }
        }

    }
}

