class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        number = 0
        for i in range(len(columnTitle) - 1, -1, -1):
            digit = ord(columnTitle[i]) - ord('A') + 1
            number += digit * int(math.pow(26, len(columnTitle) - 1 - i))

        return number

            