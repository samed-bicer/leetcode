class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        min_costs = [0] * (len(cost) + 1)

        for i in range(2, len(cost) + 1):
            c1 = min_costs[i - 1] + cost[i - 1]
            c2 = min_costs[i - 2] + cost[i - 2]
            min_costs[i] = min(c1, c2)

        return min_costs[-1]