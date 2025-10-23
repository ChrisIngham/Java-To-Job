
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class TextUI {
    private Scanner scan;
    private SimpleDictionary items;
    
    public TextUI(Scanner scanner, SimpleDictionary item){
        this.items = item;
        this.scan = scanner;

    }
    
    public void start(){
        String output = "";
        OUTER:
        while (true) {
            System.out.println("Command: ");
            switch (this.scan.nextLine()) {
                case "end":
                    output = "Bye bye!";
                    break OUTER;
                case "add":
                    System.out.println("Word");
                    String word = this.scan.nextLine();
                    System.out.println("Translation");
                    String translation = this.scan.nextLine();
                    this.items.add(word, translation);
                    break;
                case "search":
                    System.out.println("To be translated");
                    String input = this.scan.nextLine();
                    if (this.items.translate(input) == null){
                        System.out.println("Word " + input + " was not found");
                        break;
                    }
                    System.out.println(this.items.translate(input));
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
        System.out.println(output);
    }
}
