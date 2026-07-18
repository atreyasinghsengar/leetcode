class Solution {
    public int findGCD(int[] nums) 
    {
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        int b=nums[0];
        for(int i=b;i>=1;i--)
        {
            if(b%i==0 && a%i==0)
            {
                return i;
            }
        }
        return 1;
    }
}