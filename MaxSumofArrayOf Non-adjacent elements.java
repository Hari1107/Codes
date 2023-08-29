/***********************  Maximum sum such that no two elements are adjacent

Given an array arr[] of positive numbers, The task is to find the maximum sum of a subsequence such that no 2 numbers in the sequence should be adjacent in the array.
INPUT :
n=5
arr[] = {5, 5, 10, 100, 10, 5}
Output: 110                          *****************/

Code:
 
import java.util.*;
 public class Main
{ 
    static int rec(int nums[], int idx, int N)
    {
        if (idx >= N)
            return 0;
        return Math.max(nums[idx] + rec(nums, idx + 2, N),
                        rec(nums, idx + 1, N));
    }
  static int findMaxSum(int[] arr, int N)
    {
        return rec(arr, 0, N);
    }
  public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
         System.out.println(findMaxSum(arr, N));
        sc.close();
    }
}
