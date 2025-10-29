
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        ArrayList<Bird> birds = new ArrayList<>();
        while (true){
            System.out.println("Command: ");
            String input = scan.nextLine();
            
            if (input.equals("Quit")){
                break;
            }
            
            // add
            if (input.equals("Add")){
                System.out.println("Name: ");
                String name = scan.nextLine();
                
                System.out.println("Name in latin: ");
                String latName = scan.nextLine();
                
                birds.add(new Bird(name, latName));
                
                        
            }
            // Observation
            if (input.equals("Observation")){
                System.out.println("Bird? ");
                String name = scan.nextLine();
                
                Boolean found = false;
                for (Bird bird : birds){
                    if(bird.getName().equals(name)){
                        bird.observe();
                        found = true;
                        break;
                    }
                    if (!(found)){
                        System.out.println("Not a bird! ");
                    }
                }
            }
            // All
            if (input.equals("All")){
                for (Bird bird : birds){
                    System.out.println(bird);
                }
            }
            // One
            if (input.equals("One")){
                System.out.println("Bird? ");
                String name = scan.nextLine();
                for (Bird bird : birds){
                    if (bird.getName().equals(name)){
                        System.out.println(bird);
                    }
                }
            }
        
        
        }
    }

}
