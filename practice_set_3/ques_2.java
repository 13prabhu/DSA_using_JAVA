package practice_set_3;

import java.util.Scanner;

// wap that read set of integers and then print the sum of the odd and even integers 
public class ques_2 {
    public static void main(String[] args) {
        // int integer=6457812;
        // int evenSum=0;
        // int oddSum=0;
        // while (integer>0) {
        //     int val=integer%10;
        //     if (val%2==0) {
        //         evenSum+=val;
        //     }
        //     else{
        //         oddSum+=val;
        //     }
        //     integer=integer/10;

        // }
        // System.out.println("Sum of even integers is : "+ evenSum);
        // System.out.println("Sum of odd integers is :" + oddSum);

        
        // the above programme read the set of integer and print the sum of even and odd integer in the number 
        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // WAP to check the entered number is even or odd and sum the entered number and odd numbers entered by the user;

        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;
        
        
        try(Scanner sc= new Scanner(System.in)){

       
       do{
        System.out.print("Entered the number : ");
        number=sc.nextInt();
        if (number%2==0) {
            evenSum+=number;
        }
        else{
            oddSum+=number;

        }
System.out.print("Press 1 if you wwant to continue and press 0 if you want to quit : ");
        choice=sc.nextInt();
       } while(choice==1);
      
       System.out.println("Sum of even numbers : "+evenSum);
        System.out.println("Sum of odd numbers : "+oddSum);
    }
}
}
