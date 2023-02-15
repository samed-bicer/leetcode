class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mapping = {')' : '(', '}' : '{', ']' : '['}
        for char in s:
            if char in mapping:
                last = stack.pop() if stack else '.'
                if last != mapping.get(char):
                    return False
                else:
                    stack.append(char)

        return not stack