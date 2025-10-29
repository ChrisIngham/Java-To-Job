
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printKeys(HashMap<String, String> hashmap){
        for (String values : hashmap.keySet()){
            System.out.println(values);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for (String values : hashmap.keySet()){
            if (values.contains(text)){
                System.out.println(values);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for (String values: hashmap.keySet()){
            if (values.contains(text)){
                System.out.println(hashmap.get(values));
            }
        }
    }

}
