/*import java.util.Arrays;
class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        int j=0;
        int n=nums.length;
        int[]result=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=val)
            {
                result[j]=nums[i];;
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=result[i];
        }
        return j;
    }
    public static void main(String[]args)
    {
        Solution s=new Solution();
        int[]nums={3,2,2,3};
        System.out.println(s.removeElement(nums,3));
        System.out.println(Arrays.toString(nums));
    }
}
*/



import java.util.*;
class Solution
{
    public int removeElement(int[] nums, int val) 
    {
        int n=nums.length;
        int result[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=val)
            {
                result[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=result[i];
        }
        System.out.print(Arrays.toString(nums));
        return k;
    }
    public static void main(String[]args)
    {
        Solution s=new Solution();
        Scanner in=new Scanner(System.in);

        System.out.println("Enter val:");
        int val=in.nextInt();

        System.out.println();

        System.out.print("Enter n value:");
        int n=in.nextInt();

        System.out.println();

        int nums[]=new int[n];
        System.out.print("Enter array values:");
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }

        System.out.println(s.removeElement(nums,val));
        //System.out.print(Arrays.toString(nums));
    }
}