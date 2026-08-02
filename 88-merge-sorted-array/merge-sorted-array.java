import java.util.Arrays;
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
