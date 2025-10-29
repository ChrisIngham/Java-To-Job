
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList<>();
        
        while (true){
            System.out.println("Identifier? (empty will stop)");
            String iden = scanner.nextLine();
            if (iden.equals("")){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")){
               break;
            }
            
            Archive archive = new Archive(iden, name);

            
            boolean inList = false;
            for (Archive stuff : list){
                if (archive.equals(stuff)){
                    inList = true;
                }
            }
            
            if (!(inList)){
                list.add(archive);
            }
            
            
            
        }
        for (Archive items : list){
                System.out.println(items);
            }
            


    }
}
