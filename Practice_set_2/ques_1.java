package Practice_set_2;

import java.util.Scanner;

// WAP to get a number from user and check it is +ve or -ve
public class ques_1 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a number to check");
    
       try( Scanner sc=new Scanner(System.in)){

       
        number=sc.nextInt();
        if (number>0) {
            System.out.println("The given number is positive");
        }
        else{
            System.out.println("The given number is negative");
        }

    }
}
}
