class Solution:
    def triangularSum(self, nums: List[int]) -> int:
        def calculateNextStep(nums):
            answer = [0] * (len(nums) - 1)

            for i in range(len(nums) - 1):
                answer[i] = (nums[i] + nums[i + 1]) % 10

            return answer


        while len(nums) != 1:
            nums = calculateNextStep(nums)

        return nums[0]