class Solution:
    def minimumTime(self, time: List[int], totalTrips: int) -> int:
        def totalTripsInGivenTime(times, givenTime):
            trips = 0
            for time in times:
                trips += (givenTime // time)
            return trips

        start = 1
        end = max(time) * totalTrips

        while (start < end) :
            mid = (end + start) // 2
            trips = totalTripsInGivenTime(time, mid)
            if trips < totalTrips:
                start = mid + 1
            else:
                end = mid

        return start
    