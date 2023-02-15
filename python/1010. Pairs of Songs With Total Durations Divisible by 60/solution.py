class Solution:
    def numPairsDivisibleBy60(self, time: List[int]) -> int:
        reduced = [0] * 60
        count = 0
        for duration in time:
            remainder = duration % 60
            if remainder == 0 :
                count += reduced[0]
            else :
                count += reduced[60 - remainder]

            reduced[remainder] += 1
        return count