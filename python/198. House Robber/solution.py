class Solution:
    def rob(self, nums: List[int]) -> int:
        memo = []
        if len(nums) == 1: return nums[0]

        memo.append(nums[0])
        memo.append(max(nums[:2]))

        for i in range(2, len(nums)):
            memo.append(max(memo[i - 1], memo[i - 2] + nums[i]))

        return memo[-1]
    