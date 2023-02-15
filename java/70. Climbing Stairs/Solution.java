class Solution {
    private Map<Integer,Integer> memo = new HashMap<>(Map.of(1, 1, 2, 2));
    public int climbStairs(int n) {
        if (memo.containsKey(n)) return memo.get(n);
        memo.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return memo.get(n);
    }
}