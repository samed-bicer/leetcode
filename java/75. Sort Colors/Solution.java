class Solution {
    public void sortColors(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

    }

/*
Follow up: Could you come up with a one-pass algorithm using only constant extra space?
*/

    public void sortColors(int[] nums) {

        int red= 0 , white = 0, blue = 0;

        for (int i : nums) {
            if (i == 0) red++;
            else if (i == 1) white++;
            else blue++;
        }

        Arrays.fill(nums, 0, red, 0);
        Arrays.fill(nums, red, red + white, 1);
        Arrays.fill(nums, red + white, red+white+blue, 2);

    }

/*
Follow up: Could you come up with a one-pass algorithm using only constant extra space?
Dijkstra's Dutch National Flag algorithm
*/
    public void sortColors(int[] nums) {

    // the idea is splitting whole array into the parts
        int left = 0, right = nums.length - 1, current = 0;
        while (current <= right) {
            if (nums[current] == 0) {
                int temp = nums[left];
                nums[left++] = nums[current];
                nums[current++] = temp;
            }
               else if (nums[current] == 2) {
                   int temp = nums[right];
                   nums[right--] = nums[current];
                   nums[current] = temp;
               }
               else {
                   current++;
               }
        }

    }

}

