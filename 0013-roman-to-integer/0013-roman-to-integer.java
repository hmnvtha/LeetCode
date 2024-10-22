class Solution {
    static int value(char r)
    {
        switch(r)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
    public int romanToInt(String s) {
        int n = s.length();
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            int current = value(s.charAt(i));

            if(i<n-1 && current<value(s.charAt(i+1)))
            {
                sum = sum - current;
            }
            else
            {
                sum = sum + current;
            }
        }
        return sum;
    }
}