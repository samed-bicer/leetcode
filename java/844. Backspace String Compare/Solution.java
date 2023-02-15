class Solution {
    public boolean backspaceCompare(String s, String t) {
        return generateString(s).equals(generateString(t));
    }

    private String generateString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c != '#') stack.push(c);
            else if (!stack.isEmpty()) stack.pop();
        }
        return String.valueOf(stack);
    }
}