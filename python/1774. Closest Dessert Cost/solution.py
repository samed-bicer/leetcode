class Solution:
    def closestCost(self, baseCosts: List[int], toppingCosts: List[int], target: int) -> int:
        self.closestCost = float(-inf)

        def helper(currentCost, baseCosts, toppingCosts, index, target):
            if abs(currentCost - target) == abs(self.closestCost - target):
                self.closestCost = min(self.closestCost, currentCost)
            elif abs(currentCost - target) < abs(self.closestCost - target):
                self.closestCost = currentCost

            if index == len(toppingCosts):
                return

            helper(currentCost, baseCosts, toppingCosts, index + 1, target)
            helper(currentCost + toppingCosts[index], baseCosts, toppingCosts, index + 1, target)
            helper(currentCost + 2 * toppingCosts[index], baseCosts, toppingCosts, index + 1, target)


        for baseCost in baseCosts:
            helper(baseCost, baseCosts, toppingCosts, 0, target)

        return self.closestCost