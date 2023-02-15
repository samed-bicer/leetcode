class Solution:
    def heightChecker(self, heights: List[int]) -> int:

        expected = heights.copy()
        self.bubbleSort(expected)

        count = 0
        for i in range(len(heights)):
            if expected[i] != heights[i]:
                count += 1

        return count

    def bubbleSort(self, array):
        hasSwapped = True

        while hasSwapped:
            hasSwapped = False

            for i in range(len(array) - 1):
                if array[i] > array[i + 1]:
                    temp = array[i]
                    array[i] = array[i + 1]
                    array[i + 1] = temp
                    hasSwapped = True
