import java.util.*;
class Solution 
{
    public int romanToInt(String s) 
    {
        Map<Character, Integer> val = new HashMap<>();
        val.put('I', 1);
        val.put('V', 5);
        val.put('X', 10);
        val.put('L', 50);
        val.put('C', 100);
        val.put('D', 500);
        val.put('M', 1000);

        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) 
        {
            char ch = s.charAt(i);
            int curr = val.get(ch);
            if (curr < prev) 
            {
                total -= curr;
            } 
            else 
            {
                total += curr;
            }
            prev = curr;
        }
        return total;
    }
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        String s = "MCMXCIV";
        int result = obj.romanToInt(s);
        System.out.println(result);
    }
}