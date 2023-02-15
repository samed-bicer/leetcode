class Solution:
    def search(self, nums: List[int], target: int) -> int:

        start = 0
        end = len(nums) - 1

        while start <= end:
            middle = start + (end - start) // 2

            if nums[middle] == target:
                return middle
            if nums[middle] > target:
                end = middle - 1
            if nums[middle] < target:
                start = middle + 1

        return -1