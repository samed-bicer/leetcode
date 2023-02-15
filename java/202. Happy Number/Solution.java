class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        Set<Integer> squareSums = new HashSet<>();

        while(!squareSums.contains(n)) {
            squareSums.add(n);
            n = sumSquares(n);
            if (n == 1) return true;
        }
        return false;
    }

    public int sumSquares(int number) {
        int sum = 0;
        while (number != 0) {
            int i = number % 10;
            sum +=  i * i;
            number /= 10;
        }
        return sum;
    }
}