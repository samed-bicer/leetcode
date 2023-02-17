class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        List<int[]> sortedIntervals = Arrays.stream(intervals)
            .sorted(Comparator.comparingInt(interval -> interval[0]))
            .toList();

        for (int i = 0; i < sortedIntervals.size() - 1; i++) {
            if (sortedIntervals.get(i)[1] > sortedIntervals.get(i + 1)[0]) return false;
        }

        return true;
    }
}