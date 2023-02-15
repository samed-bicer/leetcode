class Solution:
    def isHappy(self, n: int) -> bool:

        def sumSquares(n):
            sum = 0

            while n != 0:
                x = n % 10
                sum += x ** 2
                n = n // 10

            return sum

        if n == 1: return True

        calculated = set()

        while n != 1 and n not in calculated:
            calculated.add(n)
            n = sumSquares(n)

        return True if n == 1 else False

            