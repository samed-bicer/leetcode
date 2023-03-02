class Solution:
    def compress(self, chars: List[str]) -> int:
        if (len(chars) == 1):
            return 1

        cursorPosition = 0
        i = 0

        while i < len(chars):
            count = 1
            while i + count < len(chars) and chars[i + count] == chars[i]:
                count += 1

            chars[cursorPosition] = chars[i]
            cursorPosition += 1

            if (count > 1):
                for c in str(count):
                    chars[cursorPosition] = c
                    cursorPosition += 1

            i += count

        return cursorPosition
    