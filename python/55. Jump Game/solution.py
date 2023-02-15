class Solution:
    def canJump(self, nums: List[int]) -> bool:
        maxIndex = 0
        for i in range(len(nums)):
            if (i <= maxIndex):
                maxIndex = max(maxIndex, i + nums[i])
        return maxIndex >= len(nums) - 1