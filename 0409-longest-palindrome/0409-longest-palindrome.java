class Solution {
    public int longestPalindrome(String s) 
    {
        int ch[]=new int[128];
        for(char c:s.toCharArray())
        {
            ch[c]++;
        }
        int res=0;
        for(int i=0;i<ch.length;i++)
        {
            int val=ch[i];
            res+=(val/2)*2;
            if(res%2==0 && val%2==1)
            {
                res++;
            }
        }
        return res;
    }
}