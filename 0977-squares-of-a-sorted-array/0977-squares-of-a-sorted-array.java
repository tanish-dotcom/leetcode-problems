class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int k = nums.length-1;

        int[] ans = new int[nums.length];
        while(i<=j){
            int leftsq = nums[i]*nums[i];
            int rightsq = nums[j]*nums[j];

            if(leftsq > rightsq){
                ans[k] = leftsq;
                i++;
            }
            else{
                ans[k] = rightsq;
                j--;
            }
            k--;
        }
        return ans;
    }
}