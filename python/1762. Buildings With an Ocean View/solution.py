class Solution:
    def findBuildings(self, heights: List[int]) -> List[int]:
        answer = []
        currentMax = 0

        for i in range(len(heights) -1, -1, -1):
            if heights[i] > currentMax:
                answer.append(i)
            currentMax = max(currentMax, heights[i])

        return reversed(answer)