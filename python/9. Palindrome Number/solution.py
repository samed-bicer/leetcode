class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        if x == 0:
            return True
        if x % 10 == 0:
            return False

        reverted = 0
        while x > reverted:
            reverted = (reverted * 10) + (x % 10)
            x = x // 10

        return x == reverted or x == reverted // 10


    def isPalindrome(self, x: int) -> bool:
        number = str(x)

        for i in range(len(number) // 2):
            if number[i] != number[-1 - i]:
                return False

        return True