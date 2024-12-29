package Arrays_part_1;
// find the largest nu,ber in an array
public class largestNumber {
    public static int largestNumber_In_Aray(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if (largest<numbers[i]) {
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,100,12,1,24,6,78,42};
        System.out.println("Largest available number in this array is : "+largestNumber_In_Aray(numbers));
    }
}
