package Sorting;

public class bubbleShort {
    public static void bubbleShortAlgo(int arr[]){
    //    Number of turn for every bubbke sort algo will be one less than arr.length-1
        for (int turn = 0; turn < arr.length-1; turn++) {
            // now we will run inner loop under arr.length-turn-1
            for (int j = 0; j < arr.length-turn-1; j++) {
                // Swap if element found greater tha next one
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    // Print the sorted array
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5,7,8,1};
         bubbleShortAlgo(arr);
         printArray(arr);
    }
}
