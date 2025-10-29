
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        
        HashMap<String, String> nickNames = new HashMap<>();
        
        nickNames.put("Matthew", "Matt");
        nickNames.put("Michael", "Mix");
        nickNames.put("Arhur", "Artie");
        
        System.out.println(nickNames.get("Matthew"));
        
    } 
}
