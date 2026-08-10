class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) 
            for (int j = 0; j < board[i].length; j++) 
                if (board[i][j] != '.' && (!set.add("n " + board[i][j] + " r " + i) || !set.add("n " + board[i][j] + " c " + j)
                || !set.add("n " + board[i][j] + " b " + i / 3 + "," + j / 3))) return false;
        return true;
    }
}
