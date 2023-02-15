class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        Arrays.stream(arr)
            .forEach(number -> freq.put(number, freq.getOrDefault(number, 0) + 1));

        int uniqueCount = (int) freq.values()
            .stream()
            .distinct()
            .count();

        return freq.size() == uniqueCount;
    }
}