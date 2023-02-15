class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        freq = {}

        for i in range(len(s)):
            freq[s[i]] = freq.get(s[i], 0) + 1
            freq[t[i]] = freq.get(t[i], 0) - 1

        for value in freq.values():
            if value != 0:
                return False

        return True

    # def isAnagram(self, s: str, t: str) -> bool:
    #     return sorted(s) == sorted(t)
        