class Solution:
    def minimumOperations(self, nums: List[int]) -> int:

        uniqueNumbers = set()

        for number in nums:
            uniqueNumbers.add(number)

        if 0 in uniqueNumbers:
            uniqueNumbers.remove(0)
        return len(uniqueNumbers)