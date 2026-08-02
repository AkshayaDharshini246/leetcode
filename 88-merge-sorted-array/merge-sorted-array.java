/*import java.util.Arrays;
class Solution 
{
    public void merge(int[] nums1,int m, int[] nums2,int n) 
    {
        int[]result=new int[m+n];
        for(int i=0;i<m;i++)
        {
            result[i]=nums1[i];
        }
        for(int j=0;j<n;j++)
        {
            result[m+j]=nums2[j];
        }
        Arrays.sort(result);
        for(int i=0;i<m+n;i++)
        {
            nums1[i]=result[i];
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        int[]nums1={1,2,3,0,0,0};
        int[]nums2={2,5,6};
        s.merge(nums1,3,nums2,3);
    }
}
*/



import java.util.*;
class Solution
{
   public void merge(int[] nums1,int m, int[] nums2,int n) 
   {
        int[]result=new int[m+n];
        for(int i=0;i<m;i++)
        {
            result[i]=nums1[i];
        }
        for(int j=0;j<n;j++)
        {
            result[m+j]=nums2[j];
        }
        Arrays.sort(result);
        for(int i=0;i<m+n;i++)
        //if(result[i]!=0)
        {
            nums1[i]=result[i];
        }
        System.out.print(Arrays.toString(result));
   } 
   public static void main(String[]args)
   {
    Solution s=new Solution();
    Scanner in=new Scanner(System.in);
    System.out.print("Enter value of m:");
    int m=in.nextInt();
    System.out.println();
    int nums1[]=new int[m];
    System.out.print("Enter nums1 values");
    for(int i=0;i<m;i++)
    {
        nums1[i]=in.nextInt();
    }
    int n=in.nextInt();
    System.out.print("Enter value of n:");
    System.out.println();
    int nums2[]=new int[n];
    System.out.print("Enter nums2 values");
    for(int i=0;i<m;i++)
    {
        nums1[i]=in.nextInt();
    }
    s.merge(nums1,m,nums2,n);
   }
}