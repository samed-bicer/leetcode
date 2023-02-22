class Solution:
    def minimumRounds(self, tasks: List[int]) -> int:
        freq = {}

        for difficulty in tasks:
            freq[difficulty] = freq.get(difficulty, 0) + 1

        count = 0
        for diff, occurrence in freq.items():
            if occurrence == 1:
                return -1
            elif occurrence % 3 == 0:
                count += occurrence // 3
            else:
                count += occurrence // 3 + 1

        return count