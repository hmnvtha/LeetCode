class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        Stack<Integer>mono = new Stack();

        for(int i=n-1; i>=0; i--)
        {
            int h = heights[i];
            int cnt = 0;

            while(!mono.isEmpty() && h>mono.peek())
            {
                cnt++;
                mono.pop();
            }
            heights[i] = cnt + (mono.isEmpty() ? 0 : 1);
            mono.push(h);
        }
        return heights;
    }
}