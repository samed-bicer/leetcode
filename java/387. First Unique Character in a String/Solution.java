class Solution {
    public int firstUniqChar(String s) {
        //s consists of only lowercase English letters. TIME -> O(n) SPACE -> O(1)

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }

        return -1;
    }
}