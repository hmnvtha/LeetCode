class Solution {
    public int kthGrammar(int n, int k) {
        
        if(n==1)
        {
            return 0;
        }

        if(k%2==0)
        {
            if(kthGrammar(n-1,k/2)==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if(kthGrammar(n-1,(k+1)/2)==0)
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
    }
}

//https://leetcode.com/problems/k-th-symbol-in-grammar/solutions/365364/java-easy-to-understand-recursion