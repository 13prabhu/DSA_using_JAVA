package practice_set_5_Array_Assignment;
/*Given the array nums after the possible rotation and an integer target, return the 
index of target if it is in nums, or -1 if it is not in nums. 
You must write an algorithm with O(log n) runtime complexity. 
Example 1: 
Input: 
nums = [4, 5, 6, 7, 0, 1, 2], target = 0 
Output: 4 
Example 2: 
Input: 
nums = [4, 5, 6, 7, 0, 1, 2], target = 3 
Output: -1 

Example 3: 
Input: 
nums = [1], target = 0 
Output: -1 
Constraints: 
•  1 <= nums . lengtth <= 5000 
•  -104 <= nums [ i ] <= 104 
•  All values of nums are unique. 
•  nums is an ascending array that is possibly rotated. 
•  -104 <= target <= 104 */
public class ques_2 {
    public static int targetElement(int nums[],int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) {
               return i;
            }
        }
        return -1;
    }

public static void main(String[] args) {

    // int nums[]={4, 5, 6, 7, 0, 1, 2};
    // int target=0;
    // int nums[]={4, 5, 6, 7, 0, 1, 2};
    // int target=3;
    int nums[]={1};
    int target=0;
   
    System.out.println(targetElement(nums, target));
}

    
}
