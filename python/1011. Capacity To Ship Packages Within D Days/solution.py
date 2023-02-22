class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        def carriableInDays(weights, capacity, days):
            daysNeeded = 0
            currentLoad = 0
            for i in range(len(weights)):
                if (currentLoad + weights[i] > capacity):
                    currentLoad = weights[i]
                    daysNeeded += 1
                else:
                    currentLoad += weights[i]

            if currentLoad > 0:
                daysNeeded += 1

            return daysNeeded <= days

        left = 0
        right = 0

        for weight in weights:
            left = max(left, weight)
            right += weight

        while left < right:
            mid = left + (right - left) // 2

            if carriableInDays(weights, mid, days):
                right = mid
            else:
                left = mid + 1

        return left