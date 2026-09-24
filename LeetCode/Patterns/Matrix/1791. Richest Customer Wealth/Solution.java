class Solution {
    public int maximumWealth(int[][] accounts) {
        //person = col
        //account=col
        int ans =Integer.MIN_VALUE;
        for(int[] ints:accounts){
            // when u start a anew col , take a new sum for that row
            int sum=0;
            for(int anInt : ints){
                sum += anInt;
            }
            //now we have sum of all acounts of person
            //check wiht all ans
            if(sum> ans){
                ans=sum;

            }
            }
            return ans;
        
    }
}