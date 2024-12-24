package Practice_set_2;
// wap to check weather a entered year is a leap year or note 

import java.util.Scanner;

public class ques_5 {
    public static void main(String[] args) {
        System.out.println( "Enter year :");
        try(Scanner sc=new Scanner(System.in)){
            int year=sc.nextInt();
            if ((year%4==0 && year%100!=0) || (year%400==0)) {
                System.out.println("Leap year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }
    }
}
