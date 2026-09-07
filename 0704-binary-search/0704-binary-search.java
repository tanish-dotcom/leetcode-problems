class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int str, int end) {
        if (str <= end) {
            int mid = str + (end - str) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (target > nums[mid]) {
                return binarySearch(nums, target, mid + 1, end);
            } 
            else {
                return binarySearch(nums, target, str, mid - 1);
            }
        }
        return -1;
    }
}