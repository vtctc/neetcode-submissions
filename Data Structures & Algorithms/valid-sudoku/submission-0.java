class Solution {
    public boolean isValidSudoku(char[][] board) {

    // rows[i][d] → is digit d seen in row i?
    boolean[][] rows = new boolean[9][9];
    boolean[][] cols = new boolean[9][9];
    boolean[][] boxes = new boolean[9][9];

    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {

            // Skip empty cells
            if (board[i][j] == '.') continue;

            // Convert char → index (0 to 8)
            int digit = board[i][j] - '1';

            // Calculate box index
            int boxIndex = (i / 3) * 3 + (j / 3);

            // 🚨 Check if already seen
            if (rows[i][digit] || cols[j][digit] || boxes[boxIndex][digit]) {
                return false;
            }

            // ✅ Mark as seen
            rows[i][digit] = true;
            cols[j][digit] = true;
            boxes[boxIndex][digit] = true;
        }
    }

    return true;
}
}
