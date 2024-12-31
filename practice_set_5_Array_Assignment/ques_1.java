package practice_set_5_Array_Assignment;

// Question 1: Given an integer array nums, return true if any value appears at least twice in the 
// array, and return false if every element is distinct. 
// Example 1: 
// Input: 
// nums = [1, 2, 3, 1] 
// Output: true 
// Example 2: 
// Input: 
// nums = [1, 2, 3, 4] 
// Output: false 
// Example 3: 
// Input: 
// nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] 
// Output: true 
// Constraints: 
// •  1 <= nums . lengtth <= 105 
// •  -109 <= nums [ i ] <= 109
public class ques_1 {
    public static boolean repeatingElement(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            // System.out.println("first loop value "+nums[i]);
            for (int j = i+1; j < nums.length; j++) {
                // System.out.println("Second loop values"+nums[j]);
                if (nums[i]==nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // first example
        // int nums[]={1,2,3,1};
        

        // ++++++++++++++++++++++++++++++++

        // second example
        // int nums []= {1, 2, 3, 4} ;

        // +++++++++++++++++++++++++++++++++
        // Third example
        int nums[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
       System.out.println( repeatingElement(nums));

    }
}
