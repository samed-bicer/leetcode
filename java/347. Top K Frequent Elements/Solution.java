class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        Arrays.stream(nums)
            .forEach(number -> {
                counts.put(number, counts.getOrDefault(number, 0) + 1);
            });

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                (item1, item2) -> counts.get(item1) - counts.get(item2)
        );

        for (int number : counts.keySet()) {
            maxHeap.add(number);
            if (maxHeap.size() > k) maxHeap.poll();
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}