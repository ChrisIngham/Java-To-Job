
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("pride", 1813, "...."));
        hashmap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "...."));
        printValueIfNameContains(hashmap, "ide");
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String values : hashmap.keySet()) {
            System.out.println(values);
        }
    }

    public void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String values : hashmap.keySet()) {
            if (values.contains(text)) {
                System.out.println(values);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String values : hashmap.keySet()) {
            if (values.contains(text)) {
                System.out.println(hashmap.get(values));
            }
        }
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (String values : hashmap.keySet()) {
            System.out.println(hashmap.get(values));
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (String values : hashmap.keySet()) {
            if (hashmap.get(values).getName().contains(text)) {
                System.out.println( hashmap.get(values));
            }
        }
    }

}
