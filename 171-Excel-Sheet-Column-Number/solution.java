public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i=0; i<s.length(); i++)
        {
         result += ((int)s.charAt(i) - 64) * (Math.pow(26, s.length() - i - 1));
            
        }
        return result;
}
    
}