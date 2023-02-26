class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length) return false;

        Map<String, Set<String>> pairs = new HashMap<>();
        for (List<String> pair : similarPairs) {
            pairs.putIfAbsent(pair.get(0), new HashSet<String>());
            pairs.putIfAbsent(pair.get(1), new HashSet<String>());
            pairs.get(pair.get(0)).add(pair.get(1));
            pairs.get(pair.get(1)).add(pair.get(0));
        }

        for (int i = 0; i < sentence1.length; i++) {
            String word1 = sentence1[i];
            String word2 = sentence2[i];
            if (word1.equals(word2)) continue;
            if (!pairs.containsKey(word1)) return false;
            if (!pairs.get(word1).contains(word2))
                return false;
        }
        return true;
    }
}