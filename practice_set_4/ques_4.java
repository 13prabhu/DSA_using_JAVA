package practice_set_4;

import java.util.Scanner;

// Write a Java method to compute the sum of the digits in an integer
public class ques_4 {
   public static int sumOfDigits(int num){
       int sum=0;
    while (num!=0) {
        int last_digit=num%10;
        sum+=last_digit;
        num/=10;
    }
    return sum;
   }

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the integer :");
            int integer=sc.nextInt();
        
        System.out.println("Sum of digits in integer is "+sumOfDigits(integer));
        }
    }
}
