class Solution 
{
    public boolean canJump(int[] nums) 
    {
        int stepsleft=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            stepsleft--;
            if(stepsleft<0)
            {
                return false;
            }
            if(i==n-1)
            {
                 return true;
            }
            if(stepsleft<nums[i])
            {
                stepsleft=nums[i];
            }
        }
        return true;
        
    }
}