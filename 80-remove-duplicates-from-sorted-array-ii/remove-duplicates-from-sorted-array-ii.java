class Solution 
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