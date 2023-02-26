class Solution:
    def areSentencesSimilar(self, sentence1: List[str], sentence2: List[str], similarPairs: List[List[str]]) -> bool:

        if len(sentence1) != len(sentence2):
            return False

        pairs = collections.defaultdict(set)

        for pair in similarPairs:
            pairs[pair[0]].add(pair[1])
            pairs[pair[1]].add(pair[0])

        for i in range(len(sentence1)):
            word1 = sentence1[i]
            word2 = sentence2[i]

            if word1 == word2:
                continue
            if word2 not in pairs[word1]:
                return False

        return True