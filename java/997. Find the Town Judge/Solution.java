class Solution {
    public int findJudge(int n, int[][] trust) {
        // if there is a judge, the outgoing connection will be 0
        // and incoming connection will be n - 1
        int[] scores = new int[n + 1];

        for (int[] connection : trust) {
            scores[connection[0]]--;
            scores[connection[1]]++;
        }

        for(int i = 1; i < scores.length; i++) {
            if (scores[i] == n - 1) return i;
        }
        return -1;
    }
}