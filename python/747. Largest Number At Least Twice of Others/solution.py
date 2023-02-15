class Solution:
    def dominantIndex(self, nums: List[int]) -> int:

        index = -1
        largest = float(-inf)
        second = float(-inf)

        for i in range(len(nums)):
            if nums[i] > largest:
                second = largest
                largest = nums[i]
                index = i
            elif nums[i] > second:
                second = nums[i]


        return index if largest >= 2 * second else -1
    