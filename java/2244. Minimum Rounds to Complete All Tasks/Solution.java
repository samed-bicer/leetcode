class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int diff : tasks) freq.put(diff, freq.getOrDefault(diff, 0) + 1);

        int count = 0;
        for (int diff : freq.keySet()) {
            int occurrence = freq.get(diff);
            if (occurrence == 1) return -1;
            else if (occurrence % 3 == 0) count += occurrence / 3;
            else count += occurrence / 3 + 1;
        }
        return count;
    }
}