class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        def createCountTuple(s):
            count = [0] * 26
            result = ''
            for char in s:
                count[ord(char) - ord('a')] += 1

            return tuple(count)

        if len(strs) == 0:
            return []

        answer = collections.defaultdict(list)

        for s in strs:
            key = createCountTuple(s)
            answer[key].append(s)


        return answer.values()
    