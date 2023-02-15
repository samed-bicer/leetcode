class Solution {
    public int singleNumber(int[] nums) {
        // add to set and remove from set. in the end just one element will be in the set, return it. TIME -> O(n) SPACE -> O(n)
        // frequency map, return the key with value 1 TIME -> O(n) SPACE -> O(n)
        // sort the array and return the one with no duplicate TIME -> O(nlogn) SPACE -> O(1)
        // bitwise operation ??
        // XOR

        int result = 0;
        for (int number : nums) result ^= number;

        return result;
    }
}