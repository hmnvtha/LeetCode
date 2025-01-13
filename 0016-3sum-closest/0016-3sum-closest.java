class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int closest = arr[0]+arr[1]+arr[2];
       
        for(int i=0; i<=arr.length-3; i++)
        {

            int j = i+1;
            int k = arr.length-1;
            while(j<k)
            {
                int total = arr[i]+arr[j]+arr[k];
               
                
                if(Math.abs(total - target) < Math.abs(closest - target))
                {
                  closest = total;
                }

                if(total == target)
                {
                    // Triplets Founded
                    return total;
                }

                if(total<target)
                {
                    j++;
                }

                else {
                    k--;
                }

                
            }
        }
        return closest;
    }
}