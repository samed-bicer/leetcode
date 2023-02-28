class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numbers = set(nums)

        longestSeq = 0
        for number in numbers:
            if number - 1 in numbers:
                continue
            current = number
            count = 1

            while current + 1 in numbers:
                current += 1
                count += 1

            longestSeq = max(longestSeq, count)

        return longestSeq