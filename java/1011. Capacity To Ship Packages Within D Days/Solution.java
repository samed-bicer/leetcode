class Solution {
    // min capacity = max weight
    // max capactiy = total weight
    // search between these two values
    public int shipWithinDays(int[] weights, int days) {
        int totalWeight = 0;
        int biggest = 0;
        for (int weight : weights) {
            totalWeight += weight;
            biggest = Math.max(biggest, weight);
        }

        int left = biggest;
        int right = totalWeight;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int daysNeeded = calculateDaysNeeded(mid, weights);
            if (daysNeeded > days) left = mid + 1;
            if (daysNeeded <= days) right = mid;
        }
        return left;
    }

    public int calculateDaysNeeded(int capacity, int[] weights) {
        int days = 0;
        int currentLoad = 0;
        for (int i = 0; i < weights.length; i++) {
            if (currentLoad + weights[i] <= capacity) {
                currentLoad += weights[i];
            } else {
                days++;
                currentLoad = weights[i];
            }
        }
        return currentLoad > 0 ? ++days : days;
    }
}