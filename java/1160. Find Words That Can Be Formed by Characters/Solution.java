class Solution {
    public int countCharacters(String[] words, String chars) {

        Map<Character, Integer> freq = new HashMap<>();
        int totalLength = 0;

        for (int i = 0; i < chars.length(); i++) {
            freq.put(chars.charAt(i), freq.getOrDefault(chars.charAt(i), 0) + 1);
        }

        for (String word : words) {
            totalLength += helper(word, freq);
        }

        return totalLength;
    }

    public int helper(String word, Map<Character, Integer> freq) {
        Map<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            chars.put(word.charAt(i), chars.getOrDefault(word.charAt(i), 0) + 1);
        }

        for (Character c : chars.keySet()) {
            if (freq.getOrDefault(c, 0) < chars.get(c)) {
                return 0;
            }
        }

        return word.length();

    }
}