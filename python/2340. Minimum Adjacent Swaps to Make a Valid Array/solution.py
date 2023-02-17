class Solution:
    def minimumSwaps(self, nums: List[int]) -> int:
        minIndex = 0
        maxIndex = 0

        minNum = math.inf
        maxNum = -math.inf

        for i in range(len(nums)):
            number = nums[i]

            if number >= maxNum:
                maxNum = number
                maxIndex = i

            if number < minNum:
                minNum = number
                minIndex = i


        return (len(nums) - 1 - maxIndex) + (minIndex) - (1 if minIndex > maxIndex else 0)