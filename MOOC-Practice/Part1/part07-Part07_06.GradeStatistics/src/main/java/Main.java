
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        System.out.println("Enter point totals, -1 stops: ");
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Integer> passingGrades = new ArrayList<>();
        int total = 0;
        int passingTotal = 0;
        
        while(true){
            int value = Integer.valueOf(scanner.nextLine());
            
            if (value == -1){
                break;
            }
            if (value > 0 && value <=100){
                if (value >= 50){
                    passingGrades.add(value);
                }
                grades.add(value);
            }
        }
        
        // need to print averages for all
        int grade0 = 0, grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0;
        for (int values : grades){
            total += values;
            if (values >= 90){
                grade5++;
            }else if (values >= 80){
                grade4++;
            }else if (values >= 70){
                grade3++;
            }else if (values >= 60){
                grade2++;
            }else if (values >=50){
                grade1++;
            }else{
                grade0++;
            }
        }
        System.out.println("Point average (all): " + (1.0*total / grades.size()));
        
        for (int values: passingGrades){
            passingTotal += values;
        }
        // for case where array is empty
        if (passingGrades.isEmpty()){
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        }else{
            // need to print passing average 
            // passing percentage
            System.out.println("Point average (passing): " + (1.0*passingTotal/passingGrades.size()));
            System.out.println("Pass percentage: " + (1.0*passingGrades.size()/grades.size())*100);
        }
        
        //grade distrubution
        System.out.println("Grade distribution: ");
        System.out.println("5: " + "*".repeat(grade5));
        System.out.println("4: " + "*".repeat(grade4));
        System.out.println("3: " + "*".repeat(grade3));
        System.out.println("2: " + "*".repeat(grade2));
        System.out.println("1: " + "*".repeat(grade1));
        System.out.println("0: " + "*".repeat(grade0));
    }
}
