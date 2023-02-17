class Solution {
    public int minimumKeypresses(String s) {
        Integer[] freq = new Integer[26];
        Arrays.fill(freq, 0);

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        Arrays.sort(freq, Comparator.reverseOrder());

        int totalKeypress = 0;
        for (int i = 0; i < freq.length; i++) {
            totalKeypress += freq[i] * ((i + 9) / 9);
        }

        return totalKeypress;

    }

}