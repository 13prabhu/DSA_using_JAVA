package Sorting;

public class insertionSort {
    public static void insertionAlgo(int arr[]){
            for (int i =1; i < arr.length; i++) {
                int curr=arr[i];
                int prev=i-1;

                while (prev>=0 && arr[prev]>curr) {
                    arr[prev+1]=arr[prev];
                    prev--;
                }
                  // insertion
            arr[prev+1]=curr;
            }
          
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,9,7,3,4,6};
        insertionAlgo(arr);
        printArray(arr);
    }
}
