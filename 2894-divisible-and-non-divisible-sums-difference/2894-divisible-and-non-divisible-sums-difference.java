class Solution {
    public int differenceOfSums(int n, int m) {
        int dsum = 0;
        int sum = 0;

        for(int i=1; i<=n; i++)
        {
            if(i%m==0)
            {
                dsum = dsum + i;
            }
            else
            {
                sum = sum + i;
            }
        }
        int ans = sum - dsum;
        return ans;
    }
}