class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = set()

        start = 0
        current = 0
        maxLength = 0

        while current < len(s):
            currentChar = s[current]
            if currentChar in seen:
                seen.remove(s[start])
                start += 1
                continue

            seen.add(currentChar)
            maxLength = max(maxLength, current - start + 1)
            current += 1

        return maxLength


