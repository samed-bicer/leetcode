class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(number -> set.add(number));
        set.remove(0);
        return set.size();
    }
}