class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        if (x % 10 == 0) return false;
        int reverted = 0;

        while (x > reverted) {
            reverted = (reverted * 10) + (x % 10);
            x /= 10;
        }

        return x == reverted || x == reverted / 10;

    }

    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);

        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 -i))
                return false;
        }
        return true;
    }
    
}