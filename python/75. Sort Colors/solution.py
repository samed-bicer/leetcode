class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        for i in range(len(nums)):
            minIndex = i
            for j in range(i + 1, len(nums)):
                if nums[j] < nums[minIndex]:
                    minIndex = j

            temp = nums[i]
            nums[i] = nums[minIndex]
            nums[minIndex] = temp
        