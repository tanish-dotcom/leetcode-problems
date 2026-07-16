class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixgcd = new int[nums.length];
        int mx = 0;
        for(int i = 0; i<nums.length; i++){
            mx = Math.max(mx,nums[i]);
            prefixgcd[i] = gcd(nums[i],mx);
        }
        Arrays.sort(prefixgcd);
        long ans = 0;
        int left = 0;
        int right = prefixgcd.length-1;

        while(left<right){
            ans += gcd(prefixgcd[left], prefixgcd[right]);
            left++;
            right--;
        }
        return ans;
    }
    public int gcd(int a, int b){
        while(b != 0){
            int temp = a%b;
            a = b;
            b= temp;
        }
        return a;
    }
    
}