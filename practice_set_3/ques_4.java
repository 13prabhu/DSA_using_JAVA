package practice_set_3;
// wap to print multiplication table of number entered by the user;

import java.util.Scanner;

public class ques_4 {
    public static void main(String[] args) {
        int number;
        try(Scanner sc=new Scanner(System.in)){
          System.out.print("Enter the number of which you want to print table :");
           number= sc.nextInt();
           for(int i =1;i<11;i++){
            System.out.println(number+"x"+i+"= "+number*i);
           }

        }
    }
}
