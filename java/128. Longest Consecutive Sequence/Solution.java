class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int number : nums) numbers.add(number);

        int maxLength = 0;
        for (int number : numbers) {
            if (numbers.contains(number - 1)) continue;

            int current = number;
            int count = 1;

            while (numbers.contains(current + 1)) {
                current += 1;
                count++;
            }

            maxLength = Math.max(maxLength, count);
        }
        return maxLength;
    }
}