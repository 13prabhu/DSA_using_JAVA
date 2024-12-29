package Arrays_part_1.Binary_Search;

public class search_index {
    public static int binary_search(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (key==numbers[mid]) {
                return mid;
            }
            if (key>numbers[mid]) {
                // right search
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,8,10,12,14,18,20,22,24,26};
        int key=14;
        System.out.println("The index number of key is :"+binary_search(numbers, key));
            

    }
}
