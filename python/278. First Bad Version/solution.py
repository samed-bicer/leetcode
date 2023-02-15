# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        if n == 1:
            return 1

        start = 1
        end = n

        while(start < end):
            current = start + (end - start) // 2
            if isBadVersion(current):
                end = current
            else:
                start = current + 1
        return start
