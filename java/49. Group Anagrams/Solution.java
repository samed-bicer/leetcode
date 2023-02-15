class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return Collections.emptyList();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String key = createFreqString(s);
            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());

    }

    public String createFreqString(String s) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count.length; i++) {
            sb.append(count[i]).append(".");
        }

        return sb.toString();
    }

    public Map<Character, Integer> createMap (String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        return freq;
    }

    public boolean areEqualMaps(Map<Character, Integer> first, Map<Character, Integer> second) {
        if (first.size() != second.size()) return false;

        return first.entrySet().stream()
            .allMatch(entry -> entry.getValue().equals(second.get(entry.getKey())));
    }
}