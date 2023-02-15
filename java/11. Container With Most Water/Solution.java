class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, calculateArea(height, left, right));

            if (height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }

    public int calculateArea(int[] height, int left, int right) {
        return (right - left) * Math.min(height[left], height[right]);
    }

    /*
    O(n^2) solution TLE

    public int maxArea(int[] height) {

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return maxArea;
    }
    */
}