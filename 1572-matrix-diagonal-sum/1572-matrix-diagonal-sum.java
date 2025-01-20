class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ld = 0;
        int rd = 0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                ld = ld + mat[i][j];
            }
        }
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i+j==m-1 && i!=j)
                rd = rd + mat[j][i];
            }
        }
        return rd + ld;
    }
}