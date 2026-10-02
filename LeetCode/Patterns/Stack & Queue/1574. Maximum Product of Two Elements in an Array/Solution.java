class Solution {
    public int maxProduct(int[] nums) {
        int high=nums[0];
        int secondHigh=-1;
        for(int i=1; i<nums.length; i++)
        {
                if(high<=nums[i])
                {
                   secondHigh=high;
                   high=nums[i];
                }
                else if(nums[i] > secondHigh)
            {
                secondHigh = nums[i];
            }
        }
        return (high-1)*(secondHigh-1);
    }
}