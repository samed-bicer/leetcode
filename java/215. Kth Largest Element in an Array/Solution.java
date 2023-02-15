class Solution {
    public int findKthLargest(int[] nums, int k) {
        // we can use a max heap to store all elements and then we can poll Kth element from the heap

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        Arrays.stream(nums).forEach(number -> maxHeap.add(number));

        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }

        return maxHeap.poll();

    }

    public int findKthLargest(int[] nums, int k) {
        // another idea is using a min heap and keeping k items at most by removing items if you hit k
        // when you add every element - and remove some of them on the way- you will have Kth max element as head

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        Arrays.stream(nums)
            .forEach(number -> {
                minHeap.add(number);
                if(minHeap.size() > k) minHeap.poll();
            });

        return minHeap.poll();

    }
}