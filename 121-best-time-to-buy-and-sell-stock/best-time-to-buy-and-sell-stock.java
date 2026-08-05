/*class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int buying_price=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if (buying_price>=prices[i])
            {
                buying_price=prices[i];
                continue;
            }
            profit=Math.max(profit,prices[i]-buying_price);
        }
        return profit;
    }
    public static void main(String[]argd)
    {
        Solution s=new Solution();
        int[]prices={7,1,5,3,6,4};
        System.out.println(s.maxProfit(prices));

    }
}
*/


import java.util.*;
public class Solution
{
    public int maxProfit(int[] prices) 
    {
        int n=prices.length;
        int max_profit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(prices[i]<min)
                min=prices[i];
            int profit=prices[i]-min;
            if(profit>max_profit)
                max_profit=profit;
        }
        return max_profit;
    }
    public static void main(String[]args)
    {
        Solution s=new Solution();
        Scanner in=new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n=in.nextInt();

        System.out.println();

        int prices[]=new int[n];
        System.out.print("Enter array values:");
        for(int i=0;i<n;i++)
        {
            prices[i]=in.nextInt();
        }

        System.out.println(s.maxProfit(prices));

    }
}