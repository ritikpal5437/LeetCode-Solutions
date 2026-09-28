class Solution {
    public int missingNumber(int[] nums) {
    
        int n=nums.length;
        int sum;
        sum=(n*(n+1))/2;
        int arraySum=0;
        for(int i=0; i<nums.length; i++)
        {
            arraySum=arraySum+nums[i];
        }
        int result;
        result=sum-arraySum;
        return result;
    }
}
    