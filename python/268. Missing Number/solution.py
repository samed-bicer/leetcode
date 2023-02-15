class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        expected = n * (n + 1) // 2
        total = 0

        for number in nums:
            total += number

        return expected - total