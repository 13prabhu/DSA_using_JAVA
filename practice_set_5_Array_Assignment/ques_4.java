package practice_set_5_Array_Assignment;
/*Question 4: Given n non-negative integers representing an elevation map where the width of 
each bar is 1, compute how much water it can trap after raining. 
Example 1: 
Input: 
height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1] 
Output: 6 

Example 2: 
Input: 
height = [4, 2, 0, 3, 2, 5] 
Output: 9 
Constraints: 
•  n == height . length 
•  1 <= n <= 2 * 104 
[0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) 
•  0 <= height [ i ] < = 105 */
public class ques_4 {
      public static int trappedWaterFunc(int height[]){
          
          int trappedWater=0;
          int n=height.length;



        //   Calculate maxLeftHeight
        int maxLeftHeight[]=new int[n];
        maxLeftHeight[0]=height[0];
        for (int i = 1; i < n; i++) {
            maxLeftHeight[i]=Math.max(height[i],maxLeftHeight[i-1]);
           
        }
        
        // Calculate MaxRightHeight
        int maxRightHeight[]=new int [n];
        maxRightHeight[n-1]=height[n-1];
        for (int i = n-2; i >=0; i--) {
            maxRightHeight[i]=Math.max(height[i],maxRightHeight[i+1]);
           
        }


        // Calculate Water leveel and trapped water
        for (int i = 0; i < n; i++) {
            int waterLevel=Math.min(maxLeftHeight[i],maxRightHeight[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
      }
      

    public static void main(String[] args) {
        // Example one 
        // int height[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};  
        // output should be 6

        // Example two;
        // output should be 9
        int height[]={4, 2, 0, 3, 2, 5}; 

         System.out.println("Total trapped water is : "+trappedWaterFunc(height));
    }
}
