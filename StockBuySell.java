/*

n = 6
prices [7, 1, 5, 3, 6, 4]
Max Profit = 5

*/

import java.util.Scanner;

class StockBuySell{
    public static int maxProfit(int[] prices, int n) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for(int i=0;i<n;i++){
            cost = Math.min(prices[i],cost);
            profit = Math.max(profit, prices[i]-cost);
        }
        return profit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++)
            prices[i] = sc.nextInt();
        System.out.println("Max Profit = "+maxProfit(prices, n));
    }
}