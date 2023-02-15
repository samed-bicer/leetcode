class Solution {
    public int rob(int[] nums) {
        int i = nums.length - 1;
        Map<Integer, Integer> memo = new HashMap<>();
        return dp(nums, memo, i);

    }


    public int dp(int[] nums, Map<Integer, Integer> memo, int i) {
        if (i == 0) return nums[0];
        if (i == 1) return Math.max(nums[0], nums[1]);
        if (memo.containsKey(i)) return memo.get(i);

        memo.put(i, Math.max(dp(nums, memo, i - 1), dp(nums, memo, i - 2) + nums[i]));

        return memo.get(i);
    }

}