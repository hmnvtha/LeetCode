class Solution {
    static int sum(int n)
    {
        int ans = 0;
        while(n!=0)
        {
            int t = n%10;
            ans = ans + (int)Math.pow(t,2);
            n = n/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        ArrayList<Integer> l = new ArrayList<>();
        while(n!=1)
        {
            if(!l.contains(n))
            {
                l.add(n);
                n = sum(n);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}