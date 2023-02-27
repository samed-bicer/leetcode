class Solution {
    public boolean isPalindrome(String s) {
        String cleared = clearInput(s);

        for (int i = 0; i < cleared.length() / 2; i++) {
            if (cleared.charAt(i) != cleared.charAt(cleared.length() - 1 - i)) return false;
        }
        return true;
    }

    public String clearInput(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}