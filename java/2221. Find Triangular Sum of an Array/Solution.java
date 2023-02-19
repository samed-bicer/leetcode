class Solution {

    public int triangularSum(int[] nums) {
        if (nums.length == 1) return nums[0];

        int[] answer = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            answer[i] = (nums[i] + nums[i + 1]) % 10;
        }

        return triangularSum(answer);

    }

    public int triangularSum(int[] nums) {
        while (nums.length != 1) {
            nums = calculateNextStep(nums);
        }
        return nums[0];
    }

    public int[] calculateNextStep(int[] nums) {
        int[] answer = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            answer[i] = (nums[i] + nums[i + 1]) % 10;
        }

        return answer;
    }
}