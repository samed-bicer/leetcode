class Solution {
    public boolean isAnagram(String s, String t) {
        // sort the array and check whether they're eaqual
        if (s.length() != t.length()) return false;
        Map<Character, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < s.length(); i ++) {
            frequencies.put(s.charAt(i), frequencies.getOrDefault(s.charAt(i), 0) + 1);
            frequencies.put(t.charAt(i), frequencies.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (Integer value : frequencies.values()) {
            if (value != 0) return false;
        }

        return true;

    }
}