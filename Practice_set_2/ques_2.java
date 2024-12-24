package Practice_set_2;

import java.util.Scanner;

// check if you have fever or note if your temp is above 100 you have fever and if below then you don't have fever
public class ques_2 {
    public static void main(String[] args) {
        System.out.println("Enter your temp :");
       try(Scanner sc= new Scanner(System.in)){

       
        double temp=sc.nextDouble();
        if (temp>100) {
            System.out.println("Fever");
        }
        else{
            System.out.println("You are okay");
        }
    }
}

}
