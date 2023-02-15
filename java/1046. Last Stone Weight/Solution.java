class Solution {
    public int lastStoneWeight(int[] stones) {
        // max heap
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        // add everything to heap and then proceed with battle royale

        for(int stone : stones) {
            heap.add(stone);
        }

        while(heap.size() > 1) {
            int stone1 = heap.remove();
            int stone2 = heap.remove();
            if (stone1 != stone2) heap.add(stone1 - stone2);
        }

        return heap.isEmpty() ? 0 : heap.remove();

    }
}