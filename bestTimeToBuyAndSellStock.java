/***********                       Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. ***********/
code:
import java.util.*;
public class Main {
    public static int maxProfit(int[] prices) {
        if(prices==null || prices.length==0)
        {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int price:prices){
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int p[] = new int[n];
        for(int i=0;i<n;i++){
             p[i] = sc.nextInt();
        }
        System.out.println(maxProfit(p));
    }
}
