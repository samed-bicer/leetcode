class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int x = m - 1;
        int y = n - 1;
        int index = m + n - 1;

        while (index >= 0) {
            if (y < 0) break;

            if (x >= 0 && nums1[x] > nums2[y]){
                nums1[index] = nums1[x];
                x--;
            } else {
                nums1[index] = nums2[y];
                y--;
            }

            index--;
        }

    }
}