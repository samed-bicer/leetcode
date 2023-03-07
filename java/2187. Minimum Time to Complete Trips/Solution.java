class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        // binary search
        long start = 1;
        int maxTime = Arrays.stream(time)
            .max()
            .getAsInt();
        long end = (long) maxTime * totalTrips;

        while (start < end) {
            long mid = (start + end) / 2;
            long trips = totalTripsInTime(time, mid);

            if (trips < totalTrips) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public long totalTripsInTime(int[] time, long givenTime) {
        long trips = 0;
        for (int duration : time) {
            trips += givenTime / duration;
        }
        return trips;
    }
}