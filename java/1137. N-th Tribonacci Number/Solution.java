class Solution {
    // private Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1, 2, 1));

    // public int tribonacci(int n) {
    //     if (memo.containsKey(n)) {
    //         return memo.get(n);
    //     }

    //     int value = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    //     memo.put(n, value);
    //     return value;
    // }

    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 1;

        for (int i = 3; i < n + 1; i++) {
            memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];
        }
        return memo[n];
    }
}