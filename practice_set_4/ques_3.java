package practice_set_4;
/*Question 3 : Write a Java program to checkif a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)
Anumberis called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
palindrome because the reverse of 321 is 123, which is not equal to 321.


*/

import java.util.Scanner;

public class ques_3 {
    // +++++++++++++++++++++++++++++++first method   (Brut force method)+++++++++++++++++++++++++++++++
    // public static int count(int num){
    //     int length=0;
    //     while (num>0) {
    //         num=num/10;
    //         length++;
           
    //     }
    //     return length;
    // }
    
    // public static boolean isPalindrome(int num){
    //     int pow=count(num);
    //     int temp=num; 
    //     int result=0;
    //     while (num>0) {
    //         int last_digit=num%10;
    //         result+=last_digit*(int)Math.pow(10,pow-1);
    //         pow--;
    //         num/=10;

    //     }
    //     if (temp==result) {
    //         return true;
    //     }
    //     return false;
    // }

// ++++++++++++++++++++++++++++++++++++++++++=Second and optimal method ++++++++++++++++++++++++++++++++++++++++++++

public static boolean isPalindrome(int num){
    int temp=num;
int reverse=0;
int rem;
while (num!=0) {
    rem=num%10;
    reverse=reverse*10+rem;
    num/=10;

}
if (temp==reverse) {
    return true;
}
return false;

}

    public static void main(String[] args) {
        // System.out.println("Ans for palindrome number is "+isPalindrome(4567));
        // count(15656545);
        try(Scanner sc=new Scanner(System.in)){
            int num=sc.nextInt();
            boolean ans=isPalindrome(num);
            System.out.println("Palindrome:  "+ans);
        }
        
    }
}
