package JavaBasics;
public class decToBinary {

    public static void decimal_of_Binary(int number){
        int decNumber=number;
        int pow=0;
        int binNum=0;
        while (number>0) {
            int rem=number%2;
            binNum+=rem*(int)Math.pow(10, pow);
            pow++;
            number/=2;

        }
        System.out.println("Binary of "+decNumber+" is :"+binNum);
    }
public static void main(String[] args) {
    decimal_of_Binary(5);
}
    
}