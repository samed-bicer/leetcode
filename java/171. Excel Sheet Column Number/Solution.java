class Solution {
    public int titleToNumber(String columnTitle) {

        int number = 0;

        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            int digit = columnTitle.charAt(i) - 'A' + 1;
            number += digit * (int) Math.pow(26, columnTitle.length() - 1 - i);
        }

        return number;
    }
}