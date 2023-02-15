class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        return self.generate_string(s) == self.generate_string(t)

    def generate_string(self, string : str):
        stack = []

        for char in string:
            if char != '#':
                stack.append(char)
            elif stack:
                stack.pop()
        return str(stack)
