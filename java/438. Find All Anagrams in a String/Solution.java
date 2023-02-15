class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();
        int[] pArray = createArray(p);
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            int[] sArray = createArray(s.substring(i, i+p.length()));
            if (isSameArray(pArray, sArray)) indices.add(i);
        }

        return indices;
    }

    public int[] createArray(String str) {
        int[] arr = new int[26];
        for (char c : str.toCharArray()) {
            int index = c - 'a';
            arr[index]++;
        }
        return arr;
    }

    public boolean isSameArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}