class Solution {

    public int compress(char[] chars) {
        if (chars.length == 1) return 1;

        int i = 0;
        int cursorPosition = 0;

        while (i < chars.length) {
            int count = 1;
            while (i + count < chars.length && chars[i + count] == chars[i]) count++;

            chars[cursorPosition++] = chars[i];
            if (count > 1) {
                char[] countChar = String.valueOf(count).toCharArray();
                for (int k = 0; k < countChar.length; k++) {
                    chars[cursorPosition++] = countChar[k];
                }
            }
            i += count;
        }
        return cursorPosition;
    }

    /*
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;

        int currentIndex = 1;
        char lastChar = chars[0];
        int count = 1;

        int index = 1;
        while (index < chars.length) {
            if (chars[index] == lastChar) {
                count++;
            } else {
                lastChar = chars[index];
                if (count > 1) {
                    char[] freq = String.valueOf(count).toCharArray();
                    for (int i = 0; i < freq.length; i++) {
                        chars[currentIndex++] = freq[i];
                    }
                }
                chars[currentIndex++] = lastChar;
                count = 1;
            }
            index++;
        }

        if (count != 1) {
            char[] freq = String.valueOf(count).toCharArray();
            for (int i = 0; i < freq.length; i++) {
                chars[currentIndex++] = freq[i];
            }
        }

        return currentIndex;
    }
    */

}