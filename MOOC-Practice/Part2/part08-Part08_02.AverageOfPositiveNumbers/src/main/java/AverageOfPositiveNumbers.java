
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter=0, total=0;
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0 ){
                break;
            }
            if (input > 0){
                counter++;
                total+=input;
            }
        }
        if (counter > 0){
            System.out.println((1.0*total)/counter);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
