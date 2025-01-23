class Solution {
    public int[] numberGame(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i += 2) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
       return a;
    }
}