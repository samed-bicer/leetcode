class Solution {
    /* BITWISE XOR MINDBLOWN */
    public int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result ^= i ^ nums[i];
        }
        return result;
    }

    /* MATH */
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedTotal = n * (n + 1) / 2;
        int total = 0;
        for (int number : nums) {
            total += number;
        }

        return expectedTotal - total;
    }
}