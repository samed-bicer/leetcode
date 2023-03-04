class Solution {
    private int[] baseCosts;
    private int[] toppingCosts;
    private int target;
    private int closestCost;

    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        this.baseCosts = baseCosts;
        this.toppingCosts = toppingCosts;
        this.target = target;
        this.closestCost = baseCosts[0];

        for (int baseCost : baseCosts)
            helper(baseCost, 0);
        return closestCost;

    }

    private void helper(int currentCost, int index) {
        if (Math.abs(currentCost - target) == Math.abs(closestCost - target))
            closestCost = Math.min(closestCost, currentCost);
        else if (Math.abs(currentCost - target) < Math.abs(closestCost - target))
            closestCost = currentCost;
        if (index == toppingCosts.length) return;
        helper(currentCost, index + 1);
        helper(currentCost + toppingCosts[index], index + 1);
        helper(currentCost + 2 * toppingCosts[index], index + 1);
    }
}