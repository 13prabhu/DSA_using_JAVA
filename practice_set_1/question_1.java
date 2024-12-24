// package practice_set_1;

import java.util.Scanner;

// in a program input 3 numbers A,B,C you have to output the average of three numbers
public class question_1 {
    public static void main(String[] args) {
        System.out.println("Enter the values =>");
        try(Scanner sc =new Scanner(System.in)){
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int avg=(A+B+C)/3;
        System.out.println(avg);
    }
}
}
