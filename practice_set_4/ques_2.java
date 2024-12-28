package practice_set_4;
// Write a method named isEven that accepts an int argument. The method
//  should return true if the argument is even, or false otherwise. Also write a program to test your
//  method
public class ques_2 {
    public static boolean isEven(int num){
        if (num%2==0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Ans is "+isEven(16));
    }
}
