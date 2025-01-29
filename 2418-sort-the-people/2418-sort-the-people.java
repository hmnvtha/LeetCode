class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        int m = heights.length;
        
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(heights[j]<heights[j+1])
                {
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;

                    String str = names[j];
                    names[j] = names[j+1];
                    names[j+1] = str;
                }
            }
        }
        return names;
    }
}