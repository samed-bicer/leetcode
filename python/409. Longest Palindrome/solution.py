class Solution:
    def longestPalindrome(self, s: str) -> int:

        freq = {}
        length = 0
        for letter in s:
            freq[letter] = freq.get(letter, 0) + 1

        for value in freq.values():
            length += int(value / 2) * 2
            if (length % 2 == 0 and value % 2 == 1):
                length += 1

        return length