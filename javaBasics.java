// Function to find the binomial cofficient of two number using the factorial function;

public class javaBasics {

    public static int factorial(int number){
            int fact=1;
        for(int i=1;i<=number;i++){
            fact*=i;
        }
        return fact;
    }

    public static int binomial(int n,int r){
           int binomial_cofficient=factorial(n)/(factorial(r)*factorial(n-r));
           return binomial_cofficient;
    }
    public static void main(String[] args) {
        // System.out.println(factorial(5));
        System.out.println("Binomial cofficient of two numbers entered by the user is = " + binomial(10,5));
    }
}
