class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        def neededTime(piles, pace):
            time = 0
            for amount in piles:
                time += math.ceil(amount / pace)
            return time

        start = 1
        end = max(piles)

        while start < end:
            mid = (start + end) // 2
            if neededTime(piles, mid) <= h:
                end = mid
            else:
                start = mid + 1

        return start