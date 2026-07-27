class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int right = nums.length-1;
        int left = nums.length-2;
        int ans = (nums[left]-1)*(nums[right]-1);
        return ans;
    }
}