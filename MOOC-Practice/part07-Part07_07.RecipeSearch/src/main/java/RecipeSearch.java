
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        try ( Scanner scanner = new Scanner(System.in)) {

            ArrayList<String> recList = new ArrayList<>();

            System.out.println("File to read: ");
            String file = scanner.nextLine();

            Scanner fileScanner = new Scanner(Paths.get(file));
            Map<String, List<String>> mapRec = new HashMap<>();

            /*
        could rewrite to add each value from the receipe.txt to a ArrayList
        then 0,1 = one
        2,3 = two
        etc
             */
            while (fileScanner.hasNextLine()) {
                //sets first line equal to name of recipe
                String name = fileScanner.nextLine();

                // skip blank lines
                if (name.isEmpty()) {
                    continue;
                }

                String time = fileScanner.nextLine();

                // add to lost
                recList.add(name);
                recList.add(time);

                /*
                
                Map title to all the ingredients
               
                 */
                mapRec.putIfAbsent(name, new ArrayList<>());

                // while loop to skip until the start of the next recipe
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    mapRec.get(name).add(line);
                    if (line.isEmpty()) {
                        break;
                    }
                }
            }

            while (true) {
                System.out.println("Commands: \nlist - lists the recipes\nstop - stops the program \n\nEnter command: ");
                String command = scanner.nextLine();

                if (command.equals("stop")) {
                    break;
                }

                if (command.equals("list")) {
                    System.out.println("Recipes: ");
                    // iterate over the array to print the reciepes
                    for (int i = 0; i < recList.size() - 1; i += 2) {
                        System.out.println(recList.get(i) + ", cooking time: " + recList.get(i + 1));
                    }

                }

                if (command.equals("find name")) {
                    System.out.println("Searched word: ");
                    String input = scanner.nextLine();

                    for (int i = 0; i < recList.size() - 1; i += 2) {
                        if (recList.get(i).contains(input)) {
                            System.out.println(recList.get(i) + ", cooking time: " + recList.get(i + 1));

                        }
                    }

                }

                if (command.equals("find cooking time")) {
                    System.out.println("Max cooking time: ");
                    int input = Integer.valueOf(scanner.nextLine());

                    for (int i = 1; i < recList.size(); i += 2) {
                        if (Integer.valueOf(recList.get(i)) <= input) {
                            System.out.println(recList.get(i - 1) + ", cooking time: " + recList.get(i));
                        }
                    }
                }

                if (command.equals("find ingredient")){
                    System.out.println("Ingredient");
                    String input = scanner.nextLine();
                    for (String recName : mapRec.keySet()){
                        for (String recIngred : mapRec.get(recName)){
                            if (input.equals(recIngred)){
                                System.out.println(recList.get(recList.indexOf(recName)) + ", cooking time: " + recList.get(recList.indexOf(recName) +1));
                            }
                        }
                    }
                }
            }

        } catch (IOException e) {

        }

    }

}
