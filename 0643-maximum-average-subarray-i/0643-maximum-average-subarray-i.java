class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        int high = k-1;
        int sum = 0;
        for(int i=0; i<=high; i++){
            sum = sum+nums[i];
        }
        int maxSum = sum;
        while(high<nums.length-1){
            sum = sum - nums[low];
            low++;

            high++;
            sum = sum + nums[high];

            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum/k;
    }
}