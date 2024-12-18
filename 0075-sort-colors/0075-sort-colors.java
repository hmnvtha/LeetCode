class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++)
        {
            System.out.println(nums[i]);
        }
        
    }
}