class Solution:
    def isPalindrome(self, s: str) -> bool:
        def clearInput(s: str) -> str:
            return re.sub('[^a-zA-Z0-9]', '', s).lower()

        cleared = clearInput(s)

        for i in range(len(cleared) // 2):
            if cleared[i] != cleared[-1 -i]:
                return False

        return True