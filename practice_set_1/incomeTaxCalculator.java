import java.util.Scanner;

public class incomeTaxCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your annual income");
        
         try(Scanner sc= new Scanner(System.in)){

        int income=sc.nextInt();
        int tax;
        if (income<500000) {
            System.out.println("Tax to paid = 0");
        }
        else if(income>=500000 && income<1000000){
             tax=(int)(income*0.2);
            System.out.println("Tax to paid = "+tax);
        }
        else{
             tax=(int)(income*0.3);
            System.out.println("Tax to paid = "+tax);
        }
        System.out.println("This is your income tax");
        }
    }
}
