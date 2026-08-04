
/*class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int j=1;
        int count=1;
        int n=nums.length;
        int result[]=new int[n];
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
                count++;
            else
                count=1;
            if(count<=2)
            {
                result[j]=nums[i];
                j++;
            }
        }
        for(int i=1;i<n;i++)
        {
            nums[i]=result[i];
        }
        System.out.println(Arrays.toString(nums));
        return j;
    }
    public static void main(String[]args)
    {
        Solution s=new Solution();
        int[]nums={1,1,1,2,2,3};
        System.out.println(s.removeDuplicates(nums));
    }
}
*/




import java.util.Scanner;
public class Solution
{
    public int removeDuplicates(int[] nums) 
    {
        int n=nums.length;
        int count=1;
        int j=1;
        int result[]=new int[n];
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
                count++;
            else
                count=1;
            if(count<=2)
            {
                result[j]=nums[i];
                j++;
            }
                
        }
        for(int i=1;i<n;i++)
        {
            nums[i]=result[i];
        }
        //System.out.print(Arrays.toString(nums));
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
        System.out.print(Arrays.toString(nums));

    }
}
