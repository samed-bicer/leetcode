class Solution:
    memo = {(1,1) : 1, (2,1) : 1, (1,2) : 1}
    def uniquePaths(self, m: int, n: int) -> int:
        if (m, n) in self.memo:
            return self.memo.get((m, n))
        else :
            paths = 0
            if m > 0:
                paths += self.uniquePaths(m - 1, n)
            if n > 0:
                paths += self.uniquePaths(m, n - 1)
            self.memo[(m, n)] = paths

        return self.memo[(m, n)]