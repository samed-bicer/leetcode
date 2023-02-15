class Solution {
    // O(1) space
    public void reverseString(char[] s) {

        int right = 0;
        int left = s.length - 1;
        while (right < left) {
            char temp = s[right];
            s[right++] = s[left];
            s[left--] = temp;
        }
    }

    // recursion

    public void reverseString(char[] s) {
        reverseString(s, 0, s.length - 1);
    }

    public void reverseString(char[] s, int left, int right) {
        if (left >= right) return;

        char temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;

        reverseString(s, left, right);
    }
}