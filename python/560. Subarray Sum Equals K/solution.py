class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        sum = 0
        map = {0 : 1}

        for num in nums:
            sum += num

            if sum - k in map.keys():
                count += map[sum - k]

            map[sum] = map.get(sum, 0) + 1

        return count