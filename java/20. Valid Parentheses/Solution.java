class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>(Map.of(')', '(', '}', '{', ']', '['));
        for (char c : s.toCharArray()) {
            if (mapping.containsKey(c)) {
                Character last = stack.isEmpty() ? '.' : stack.pop();
                if (!mapping.get(c).equals(last)) return false;
            } else {
                stack.add(c);
            }
        }

        return stack.isEmpty();
    }
}