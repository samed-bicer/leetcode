class Solution:
    def fib(self, n: int) -> int:
        memo = {}
        if n == 0 or n == 1:
            return n
        if n not in memo:
            memo[n] = self.fib(n - 1) + self.fib(n - 2)
        return memo[n]

    def fib(self, n: int) -> int:
        if n == 0 or n == 1:
            return n
        memo = [None] * (n + 1)
        memo[0] = 0
        memo[1] = 1

        for i in range(2, n + 1):
            memo[i] = memo[i - 1] + memo[i - 2]
        return memo[n]