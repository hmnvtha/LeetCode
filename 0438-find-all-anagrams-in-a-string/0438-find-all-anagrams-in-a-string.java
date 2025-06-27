class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer>list = new ArrayList<>();

        int slen = s.length();
        int plen = p.length();

        if(slen < plen)
        {
            return list;
        }

        int scnt[] = new int[26];
        int pcnt[] = new int[26];

        for(int i=0; i<plen; i++)
        {
            scnt[s.charAt(i) - 'a']++;
            pcnt[p.charAt(i) - 'a']++;
        }

        if(Arrays.equals(scnt, pcnt))
        {
            list.add(0);
        }

        for(int i=plen; i<slen; i++)
        {
            scnt[s.charAt(i) - 'a']++;
            scnt[s.charAt(i-plen) - 'a']--;

            if(Arrays.equals(pcnt, scnt))
            {
                list.add(i-plen + 1);
            }
        }
        return list;
        
    }
}