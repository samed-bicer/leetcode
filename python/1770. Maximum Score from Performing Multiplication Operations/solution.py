class Solution:
    def maximumScore(self, nums: List[int], multipliers: List[int]) -> int:
        memo = [[0 for i in range(len(multipliers) + 1)] for j in range(len(multipliers) + 1)]

        def dp(left, turn):
            if turn == len(multipliers): return 0

            if memo[left][turn] == 0:
                # calculate
                right = len(nums) - 1 - (turn - left)
                l = nums[left] * multipliers[turn] + dp(left + 1, turn + 1)
                r = nums[right] * multipliers[turn] + dp(left, turn + 1)
                memo[left][turn] = max(l, r)

            return memo[left][turn]

        return dp(0, 0)