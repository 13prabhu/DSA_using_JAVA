 package Practice_set_2;

import java.util.Scanner;

// WAP to enter number between 1-7 and the day of the number should be printed 
 public class ques_3 {

    public static void main(String[] args) {
        System.out.println("Enter a number between 1-7");
        try(Scanner sc=new Scanner(System.in)){
            int day=sc.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
                default:
                System.out.println("Enter a valid number");
                break;
            }
        }
    }
}