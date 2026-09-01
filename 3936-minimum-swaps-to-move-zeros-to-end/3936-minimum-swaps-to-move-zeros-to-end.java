class Solution {
    public int minimumSwaps(int[] nums) {
        int c=0;
        int i=0,j=nums.length-1;
        while(i<j)
        {
            if(nums[i]==0 && nums[j]!=0)
            {
                nums[i]=nums[j];
                nums[j]=0;
                i++;j--;c++;
            }
            else if(nums[j]==0) j--;
            else i++;
        }
        return c;
    }
}