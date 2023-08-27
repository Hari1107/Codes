/*************************************       Maximum Subarray
      
Given an integer array nums, find the 
subarray with the largest sum, and return its sum.

Example 1:

Input: n = 8
nums = -2 -3 4 -1 -2 1 5 -2
Output: 6
Explanation: The subarray 4 -1 -2 1 5 has the largest sum 7.                                        ***************************/

Code :
import java.util.*;
public class Main {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        for(int i=0;i<nums.length;i++){
            currentSum +=nums[i];
            if(currentSum> maxSum){
                maxSum = currentSum;
            }
            if(currentSum <0){
                currentSum=0;
            }
        }
        return maxSum;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int res = maxSubArray(nums);
        System.out.println(res);
    }
}


