import java.util.Scanner;
// Area of circle program
public class areaOfCircle {
    public static void main(String[] args) {
        float pi=3.14f;
        
         try(Scanner sc=new Scanner(System.in)){
        int r=sc.nextInt();
        float areaOfCircle=pi*r*r;
        System.out.println(areaOfCircle);
    }
}
}
