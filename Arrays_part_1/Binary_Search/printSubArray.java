package Arrays_part_1.Binary_Search;

public class printSubArray {
    public static void subArray(int numbers[]){
         
         for (int i = 0; i < numbers.length; i++) {
            int start=i;
            for (int j = i; j < numbers.length; j++) {
                int last=j;
                int sum=0;
                for (int k = start; k <=last; k++) {
                    System.out.print(numbers[k]+" ");
                    sum+=numbers[k];
                }System.out.println();
                System.out.println("Sum of this subarray is : "+sum);

                // System.out.println();
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8};
        subArray(numbers);

    }
}
