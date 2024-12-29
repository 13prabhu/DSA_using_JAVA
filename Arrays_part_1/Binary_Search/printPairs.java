package Arrays_part_1.Binary_Search;

public class printPairs {
    public static void pairs(int numbers[]){
        int tp=0;
         for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                tp++;
                 System.out.print("("+curr+","+numbers[j]+")");
            }
            System.out.println();
         }
         System.out.println("Total number of pairs is :"+tp);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12};
          pairs(numbers);
    }
}
