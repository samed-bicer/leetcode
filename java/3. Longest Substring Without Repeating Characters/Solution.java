class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();

        int start = 0;
        int current = 0;
        int maxLength = 0;

        while (current < s.length()) {
            char currentChar = s.charAt(current);
            if (seen.contains(currentChar)) {
                seen.remove(s.charAt(start++));
                continue;
            }

            seen.add(currentChar);
            maxLength = Math.max(maxLength, current - start + 1);
            current++;
        }

        return maxLength;
    }
}