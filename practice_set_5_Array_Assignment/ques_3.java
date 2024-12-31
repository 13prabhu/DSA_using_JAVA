package practice_set_5_Array_Assignment;
/*Question 3: You are given an array prices where prices[i] is the price of a given stock on 
the ith day. 
Return the maximum profit you can achieve from this transaction. If you cannot 
achieve any profit, return 0. 
Example 1: 
Input: 
prices = [7, 1, 5, 3, 6, 4] 
Output: 5 
Explaination: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. 
Note that buying on day 2 and selling on day 1 is not allowed because 
you must buy before you sell. 
Example 2: 
Input: 
Prices = [7, 6, 4, 3, 1] 
Output: 0 
Explanation: 
Constraints: 
In this case, no transactions are done and the max profit = 0. 
•  1 <= prices . length <= 105 
•  0 <= prices [ i ] <= 104 */
public class ques_3 {
   public static int maxProfit(int prices[]){
    int maxProfit=0;
    int buyPrice=prices[0];
    for (int i = 1; i < prices.length; i++) {
        if (buyPrice<prices[i]) {
            int profit=prices[i]-buyPrice;
            maxProfit=Math.max(maxProfit, profit);
        }else{
            buyPrice=prices[i];
        }
    }
   
    return maxProfit;

   }
    public static void main(String[] args) {
        // int prices[]={7, 1, 5, 3, 6, 4};  Exapmle one 
        int prices[]={7, 6, 4, 3, 1};   //Example 2
        System.out.println("Maximum earned  profit is :"+maxProfit(prices));

    }
}
