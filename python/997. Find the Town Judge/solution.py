class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        # outgoing and incoming

        scores = [0] * (n + 1)

        for connection in trust:
            scores[connection[0]] -= 1
            scores[connection[1]] += 1

        for i in range(1, len(scores)):
            if scores[i] == n - 1:
                return i

        return -1