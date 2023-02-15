class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        occurences = {}

        for number in arr:
            occurences[number] = occurences.get(number, 0) + 1

        uniqueOccurences = set(occurences.values())

        return len(occurences) == len(uniqueOccurences)