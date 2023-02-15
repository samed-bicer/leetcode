class Solution:
    # memo = {0 : 0, 1: 1, 2: 1}

    # def tribonacci(self, n: int) -> int:
    #     if n in self.memo:
    #         return self.memo[n]
    #     self.memo[n] = self.tribonacci(n - 1) + self.tribonacci(n - 2) + self.tribonacci(n - 3)

    #     return self.memo[n]
    def tribonacci(self, n: int) -> int:
        if n == 0: return 0
        if n == 1 or n == 2: return 1

        x = 0
        y = 1
        z = 1

        result = x + y + z

        for i in range(n - 3):
            x = y
            y = z
            z = result
            result = x + y + z


        return result