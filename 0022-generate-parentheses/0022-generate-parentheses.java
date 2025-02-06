class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>res = new ArrayList<>();
        dfs(0,0,"",n,res);
        return res;
    }

    public void dfs(int op, int cp, String s, int n, List<String>res)
    {
        if(op==cp && (op + cp)==n*2)
        {
            res.add(s);
            return;
        }

        if(op<n)
        {
            dfs(op + 1, cp, s+"(", n, res);
        }

        if(cp<op)
        {
            dfs(op, cp + 1, s+")", n, res);
        }
    }
}