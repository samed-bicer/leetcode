class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int number : salary) {
            min = Math.min(min, number);
            max = Math.max(max, number);
            sum += number;
        }

        return (double)(sum - min - max) / (salary.length - 2);
    }
}