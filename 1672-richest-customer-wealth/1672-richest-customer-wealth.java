class Solution {
    public int maximumWealth(int[][] accounts) {

        // intialize with minimus number 
         int ans = Integer.MIN_VALUE;

        // here we itrating our loop to person
        for (int person =0; person<accounts.length; person++){
            // here we intialize with 0
            int sum = 0;
            // here we are itrating our to the person bank account
            for (int account = 0; account<accounts[person].length;account++){
                // here we are adding our sum of person bank account 
                sum += accounts[person][account];
            }
            // here we are camparing to check who's person is more healthy 
            if (sum>ans){
                    ans = sum;
                }
        }
        // here we will get our output
        return ans;
    }
}