class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        ans[0] = firstoccurence(nums,target);
        ans[1] = lastoccurence(nums,target);

        return ans;
    }

    public int firstoccurence(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(target == nums[mid]){
                ans = mid;
                right = mid-1;
            }
            else if(target<nums[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    } 

    public int lastoccurence(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(target == nums[mid]){
                ans = mid;
                left = mid+1;
            }
            else if(target<nums[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
    
}