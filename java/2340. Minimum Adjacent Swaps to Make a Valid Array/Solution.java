class Solution {
    public int minimumSwaps(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nums[maxIndex]) {
                maxIndex = i;
            } 
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }

        int requiredSwaps = 0;
        requiredSwaps += nums.length - 1 - maxIndex; // to move max to rightmost position
        requiredSwaps += minIndex; // to move min to leftmost position
        if (minIndex > maxIndex) requiredSwaps -= 1; // to remove duplicate swap

        return requiredSwaps;

    }
}