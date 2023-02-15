class Solution:
    def maxArea(self, height: List[int]) -> int:
        def calculateArea(height, left, right):
            return (right - left) * min(height[left], height[right])


        left = 0
        right = len(height) - 1
        maxArea = 0

        while left < right:
            maxArea = max(maxArea, calculateArea(height, left, right))

            if height[left] < height[right]:
                left += 1
            else :
                right -= 1

        return maxArea