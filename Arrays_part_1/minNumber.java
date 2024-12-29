package Arrays_part_1;

public class minNumber {
    public static int min_avail_number(int numbers[]){
       int min_value=Integer.MAX_VALUE;
       for(int i=0;i<numbers.length;i++){
        if (min_value>numbers[i]) {
            min_value=numbers[i];
        }
       }
       return min_value;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,7,2,10,88,42,1,56,7,6};
        System.out.println("The available min value is : "+min_avail_number(numbers));

    }
    

}
