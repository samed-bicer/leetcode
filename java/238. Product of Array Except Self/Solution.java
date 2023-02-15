class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProducts = new int[nums.length];
        int[] rightProducts = new int[nums.length];

        leftProducts[0] = 1;
        rightProducts[rightProducts.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProducts[i] = nums[i - 1] * leftProducts[i - 1];
        }

        for (int i = rightProducts.length - 2; i >= 0; i--) {
            rightProducts[i] = nums[i + 1] * rightProducts[i + 1];
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;

    }
}