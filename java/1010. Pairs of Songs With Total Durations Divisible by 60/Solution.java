class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        // we can use the fact that if time[i] % 60 = x
        // we just need to find numbers where time[j] % 60 = 60 - x

        int[] reduced = new int[60];
        int count = 0;

        for (int duration : time) {
            int remainder = duration % 60;
            if (remainder == 0) {
                count += reduced[0];
            } else {
                count += reduced[60 - remainder];
            }
            reduced[remainder]++;
        }

        return count;
    }
}