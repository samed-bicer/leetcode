class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();

        while (start < end) {
            int mid = (start + end) / 2;
            int hours = timeToComplete(piles, mid);

            if (hours <= h) end = mid;
            else start = mid + 1;
        }
        return start;
    }

    public int timeToComplete(int[] piles, int bph) {
        int hours = 0;
        for (int pile : piles) {
            if (pile % bph == 0) hours += pile / bph;
            else hours += (pile / bph) + 1;
        }
        return hours;
    }
}