class Solution {
     private Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));

     public int fib(int n) {
         if (!memo.containsKey(n)) {
             memo.put(n, fib(n - 1) + fib(n - 2));
         }
         return memo.get(n);
     }

    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        int[] memo = new int[n + 1];
        memo[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n];
    }


}