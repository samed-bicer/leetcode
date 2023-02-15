class Solution {
    public int dominantIndex(int[] nums) {

        int index = -1;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                index = i;
            } else if (nums[i] > secondLargest){
                secondLargest = nums[i];
            }

        }
        return (largest >= 2 * secondLargest) ? index : -1;
    }
}