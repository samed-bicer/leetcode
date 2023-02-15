class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:


        def helper(word, freq):
            count = [0] * 26

            for char in word:
                count[ord(char) - ord('a')] += 1

            for i in range(len(count)):
                if count[i] > freq[i]:
                    return 0

            return len(word)

        freq = [0] * 26
        totalLength = 0

        for char in chars:
            freq[ord(char) - ord('a')] += 1

        for word in words:
            totalLength += helper(word, freq)

        return totalLength

