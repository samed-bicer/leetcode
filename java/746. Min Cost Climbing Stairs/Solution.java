class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCosts = new int[cost.length + 1];

        minCosts[0] = 0;
        minCosts[1] = 0;

        for (int i = 2; i < minCosts.length; i++) {
            int c1 = minCosts[i - 1] + cost[i - 1];
            int c2 = minCosts[i - 2] + cost[i - 2];
            minCosts[i] = Math.min(c1, c2);
        }
        return minCosts[minCosts.length - 1];
    }
}