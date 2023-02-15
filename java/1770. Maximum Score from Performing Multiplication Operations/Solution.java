class Solution {
    int[] nums;
    int[] multipliers;
    int[][] memo;

    public int maximumScore(int[] nums, int[] multipliers) {
        int left = 0;
        int turn = 0;
        // int right = nums.length - 1 - (turn - left);
        this.nums = nums;
        this.multipliers = multipliers;
        this.memo = new int[multipliers.length + 1][multipliers.length + 1];

        return dp(0, 0);
    }

    public int dp(int left, int turn) {
        if (turn == multipliers.length) return 0;

        if (memo[left][turn] == 0) {
            //calculate
            int right = nums.length - 1 - (turn - left);
            int l = multipliers[turn] * nums[left] + dp(left + 1, turn + 1);
            int r = multipliers[turn] * nums[right] + dp(left, turn + 1);
            memo[left][turn] = Math.max(l, r);
        }

        return memo[left][turn];
    }

}