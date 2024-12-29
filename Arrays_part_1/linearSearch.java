package Arrays_part_1;
// Find the index of an integer in an array
// linear search
public class linearSearch {
public static int linearSearch_finding_index_number(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
        if (numbers[i]==key) {
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12};
        int key=4;
        System.out.println("Index number of key is :"+linearSearch_finding_index_number(numbers, key));

    }
}
