package practice_set_3;

import java.util.Scanner;

// WAP to find the factorial of a number 
public class ques_3 {
    public static void main(String[] args) {
        int number;
        int factoial=1;
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number you want to find factoial :");
            number= sc.nextInt();
           
            for(int i=2;i<=number;i++){
               factoial*=i;
            }
            System.out.println("Factorial of "+number + " is "+factoial);

        }
    }
}
