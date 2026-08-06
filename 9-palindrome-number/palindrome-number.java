/*class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int original_number=x;
        int palindrome_number=0;
        while(x>0)
        {
            int num=x%10;
            palindrome_number=palindrome_number*10+num;
            x=x/10;
        }
        if(original_number==palindrome_number)
        {
            return true;
        }
        return false;
    }
        public static void main(String[]args)
        {
            Solution s=new Solution();
            System.out.println(s.isPalindrome(121));
        }
}
*/




import java.util.*;
public class Solution
{
    public boolean isPalindrome(int x)
    {
        int num=x;
        int rev_num=0;
        while(x>0)
        {
            int n=x%10;
            rev_num=rev_num*10+n;
            x=x/10;        
        }
        if(num==rev_num)
            return true;
        return false;
    }
    public static void main(String[]args)
    {
        Solution s=new Solution();
        Scanner in=new Scanner(System.in);
        System.out.print("ENter x value:");
        int x=in.nextInt();
        System.out.println(s.isPalindrome(x));

    }
}