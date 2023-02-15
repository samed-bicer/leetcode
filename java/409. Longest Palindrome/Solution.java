class Solution {
    public int longestPalindrome(String s) {

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
        }

        int length = 0;
        boolean oddFound = false;

        for (int occurrence : freq.values()) {
            if (!oddFound) oddFound = occurrence % 2 == 1;
            length += (occurrence / 2) * 2;
        }
        if (oddFound) length++;
        return length;
    }
}