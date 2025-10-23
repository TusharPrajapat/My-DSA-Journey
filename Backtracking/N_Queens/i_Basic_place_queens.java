package My_DSA_Journey.Backtracking.N_Queens;

public class i_Basic_place_queens {
    public static void nQueens(char[][] board, int row){
        if (row == board.length){
            printBoard(board);
            return;
        }

        //column loop
        for (int col = 0; col < board.length; col++){

            board[row][col] = 'Q';
            nQueens(board, row+1);
            board[row][col] = '.';

        }
    }

    public static void printBoard(char[][] board){
        System.out.println("-------Chase Board-----");
        for (int i = 0; i< board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 2;
        char[][] board = new char[n][n];

        //initialize n*n matrix
        for (int i = 0; i<n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        nQueens(board,0);
    }
}
