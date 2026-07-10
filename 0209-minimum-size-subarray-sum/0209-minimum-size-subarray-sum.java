class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high=0;
        int currentsum = 0;
        int minLenwindow = Integer.MAX_VALUE;
        for(high=0; high<nums.length; high++){
            currentsum += nums[high];
            while(currentsum >= target){
                int currentwin = high-low+1;
                minLenwindow = Math.min(minLenwindow,currentwin);
                currentsum = currentsum-nums[low];
                low++;
            }
        }
        return minLenwindow == Integer.MAX_VALUE ? 0 : minLenwindow;
    }
}