package Arrays_part_1.Binary_Search;

public class reverseArray {
    public static void reverse_an_array(int numbers[]){
        int start=0;
        int last=numbers.length-1;
        while (start<last) {
            int temp=numbers[start];
            numbers[start]=numbers[last];
            numbers[last]=temp;
            start++;
            last--;
        }
       
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
       reverse_an_array(numbers);
       for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
       }
    }
}
