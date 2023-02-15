class Solution {
    public void gameOfLife(int[][] board) {
        int[][] counts = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                counts[i][j] = findLiveCells(board, i, j);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = decideNextState(board[i][j], counts[i][j]);
            }
        }

    }

    public int decideNextState(int current, int liveNeighborCount) {
        if (current == 1 && (liveNeighborCount < 2 || liveNeighborCount > 3)) return 0;
        if (current == 0 && liveNeighborCount == 3) return 1;
        return current;
    }

    public int findLiveCells(int[][] board, int i, int j) {
        int count = 0;

        for (int k = -1; k < 2; k++) {
            for (int m = -1; m < 2; m++) {
                if (k == 0 && m == 0) continue;
                int x = i + k;
                int y = j + m;
                if (isInside(x, y, board) && board[x][y] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isInside(int x, int y, int[][] board) {
        return (0 <= x && x < board.length) && (0 <= y && y < board[0].length);
    }
}