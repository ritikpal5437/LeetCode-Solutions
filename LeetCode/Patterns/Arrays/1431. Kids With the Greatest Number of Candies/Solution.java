class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=0;
        List<Boolean> list=new ArrayList<>();
        for(int i=1; i<n; i++)
        {
            if(candies[max]<candies[i])
            {
                max=i;
            }
        }
        int maxa=candies[max];
    for(int k=0; k<n; k++)
    {
        if(maxa>candies[k]+extraCandies)
         list.add(false);
        else
        list.add(true);
    }
    return list;

    }
}