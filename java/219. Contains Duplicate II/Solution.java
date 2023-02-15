class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(seen.contains(nums[i])) return true;
            seen.add(nums[i]);
            if(seen.size() > k) seen.remove(nums[i - k]);
        }
        return false;
    }

    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     for(int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j <= i + k && j < nums.length; j++) {
    //             if (nums[i] == nums[j]) return true;
    //         }
    //     }
    //     return false;
    // }
}