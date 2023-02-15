class Solution {

    public int[] shuffle(int[] nums, int n) {

        int[] answer = new int[nums.length];

        for (int i = 0; i < n; i++) {
            answer[2 * i] = nums[i];
            answer[2 * i + 1] = nums[n + i];
        }


        return answer;
    }

    // in-place trials ):
    // public int[] shuffle(int[] nums, int n) {

    //     int xIndex = n - 1;
    //     int lastY = nums[2*n - 1];
    //     for(int i = nums.length - 2; i > 0; i--) {
    //         if (i % 2 == 0) {
    //             lastY = nums[i];
    //             nums[i] = nums[xIndex--];
    //         } else {
    //             int temp = nums[i];
    //             nums[i] = lastY;
    //             lastY = temp;
    //         }

    //     }

    //     return nums;
    // }
}