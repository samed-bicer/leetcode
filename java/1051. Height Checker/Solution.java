class Solution {
    public int heightChecker(int[] heights) {

        int[] expected = heights.clone();
        bubbleSort(expected);
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) count++;
        }

        return count;

    }

    public void bubbleSort (int[] array) {

        boolean hasSwapped = true;

        while (hasSwapped) {
            hasSwapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                     swap(array, i, i + 1);
                     hasSwapped = true;
                }
            }
        }
    }

    public void swap (int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}