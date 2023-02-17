class Solution:
    def minimumKeypresses(self, s: str) -> int:
        freq = [0] * 26
        totalKeyPress = 0

        for char in s:
            freq[ord(char) - ord('a')] += 1

        freq.sort(reverse=True)

        for i in range(len(freq)):
            totalKeyPress += freq[i] * ((i + 9) // 9)

        return totalKeyPress