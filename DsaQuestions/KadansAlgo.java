package DsaQuestions;
// Find maxSubArray sum using kadanes algorithm time complexity should be 0(n)
public class KadansAlgo {
    public static int KadanesMaxSubArraySum(int numbers[]){
          int currSum=0;
          int maxSubArraySum=Integer.MIN_VALUE;
          for (int i = 0; i < numbers.length; i++) {
            currSum+=numbers[i];
            if (currSum<0) {
                currSum=0;
            }
            maxSubArraySum=Math.max(maxSubArraySum, currSum);
          }
          return maxSubArraySum;
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum sum of SubArray is : "+KadanesMaxSubArraySum(numbers));
    }
}
