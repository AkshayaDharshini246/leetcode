/*import java.util.Arrays;
class Solution
{
    public int removeDuplicates(int[]nums)
    {
        int j=0;
        int n=nums.length;
        int []temp=new int[n];
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                temp[j]=nums[i];
                j++;
            }
        }
        temp[j++]=nums[n-1];
        for(int i=0;i<j;i++)
        {
            nums[i]=temp[i];
        }
        return j;
    }
    public static void main(String[]args)
    {
        Solution s=new Solution();
        int[]nums={1,1,2};
        System.out.println(s.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
*/

import java.util.Scanner;
public class Solution
{
    public int removeDuplicates(int[]nums)
    {
        int count=0;
        int n=nums.length;
        int j=0;
        int temp[]=new int[n];
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                temp[j]=nums[i];
                j++;
            }
        }
        temp[j++]=nums[n-1];
        for(int i=0;i<n;i++)
        {
            nums[i]=temp[i];
        }
        System.out.print(Arrays.toString(nums));
        return j;
    }
    public static void main(String[]args)
    {
        Solution s=new Solution();
        Scanner in=new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n=in.nextInt();

        System.out.println();

        int nums[]=new int[n];
        System.out.print("Enter array values:");
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }

        System.out.println(s.removeDuplicates(nums));

    }
}