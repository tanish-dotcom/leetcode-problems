class Solution {

    int MOD = 1_000_000_007;
    int[][][] dp;

    public int subsequencePairCount(int[] nums) {

        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        dp = new int[nums.length][max + 1][max + 1];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= max; j++) {
                java.util.Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(nums, 0, 0, 0);
    }

    private int solve(int[] nums, int index, int gcd1, int gcd2) {

        if (index == nums.length) {
            return (gcd1 != 0 && gcd1 == gcd2) ? 1 : 0;
        }

        if (dp[index][gcd1][gcd2] != -1) {
            return dp[index][gcd1][gcd2];
        }

        long ans = 0;

        // Put current element in first subsequence
        ans += solve(nums,
                index + 1,
                gcd(gcd1, nums[index]),
                gcd2);

        // Put current element in second subsequence
        ans += solve(nums,
                index + 1,
                gcd1,
                gcd(gcd2, nums[index]));

        // Skip current element
        ans += solve(nums,
                index + 1,
                gcd1,
                gcd2);

        ans %= MOD;

        dp[index][gcd1][gcd2] = (int) ans;
        return dp[index][gcd1][gcd2];
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}