class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n=s.size();
        if(n==0) return 0;
        int maxi=1;
        for(int i=0;i<n;i++){
            int hash[256]={0}; int k=i;
            for(int j=i;j<n;j++){
                if(hash[s[j]]==0){
                    hash[s[j]]++; k=j;
                }
                else{
                    break;
                }
            }
            maxi=max(maxi,k-i+1);
         }
        return maxi;
    }
};