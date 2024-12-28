public class primeNumber {

    public static boolean isPrimeNumber(int number){
           if (number==2) {
            return true;
           }
        //   for(int i=2;i<=number-1;i++){
        //     if (number%i==0) {
        //          return false;
        //     }

        // +++++++++++++++++++Second Approach ++++++++++++++++++++++++++++++++
            for(int i=2;i<=Math.sqrt(number);i++){
                if (number%i==0) {
                    return false;
                }
            }
          
          return true;
    }

     public static void printPrimeNumbersInRange(int range){
        for(int i=2;i<=range;i++){
           if (isPrimeNumber(i)) {
            System.out.print(i +" ");
           }
        }
        
     }

    // ++++++++++++++++++++++++++Print all prime numbers in a range ++++++++++++++++++++++++++++++++++
    public static void main(String[] args) {
        // System.out.println("Ans for the number is :" +isPrimeNumber(10789));
        printPrimeNumbersInRange(10);
    }
}
