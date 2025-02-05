class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String>set = new HashSet<>(wordList);
        if(!set.contains(endWord))
        {
            return 0;
        }

        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int distance = 1;

        while(!q.isEmpty())
        {
            int size = q.size();

            for(int i=0; i<size; i++)
            {
                String curr = q.poll();

                if(curr.equals(endWord))
                {
                    return distance;
                }

                for(int j=0; j<curr.length(); j++)
                {
                    char[] temp = curr.toCharArray();
                    
                    for(char c='a'; c<='z'; c++)
                    {
                        temp[j] = c;
                        String newWord = new String(temp);

                        if(set.contains(newWord))
                        {
                            q.add(newWord);
                            set.remove(newWord);
                        }
                    }
                }
            }
            distance++;
        }
        return 0;
    }
}
//https://leetcode.com/problems/word-ladder/solutions/5676871/easiest-explanation-with-images-commented-code - for reference