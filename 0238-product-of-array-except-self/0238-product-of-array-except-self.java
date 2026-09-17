class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int product=1,a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                a++;
                continue;
            }
            product=product*nums[i];
        }
        if(a>1)
        {
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=0;
            }
            return nums;
        }
        else if(a==1)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0)
                {
                    nums[i]=product;
                }
                else
                {
                    nums[i]=0;
                }
            }
            return nums;
        }
        for(int i=0;i<nums.length;i++)
        {
            int c=product/nums[i];
            nums[i]=c;
        }
        return nums;
    }
}