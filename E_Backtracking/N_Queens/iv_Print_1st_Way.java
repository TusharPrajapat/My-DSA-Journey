package My_DSA_Journey.Backtracking.N_Queens;

public class iv_Print_1st_Way {
    static int count = 0;
    public static boolean isSafe(char[][] board, int row, int col){
        //vertically up
        for (int i = row-1; i>=0;i--){
            if (board[i][col] == 'Q'){
                return false;
            }
        }

        //left diagonal
        for (int i = row-1, j = col-1; i>=0 && j>=0; i--,j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        //right diagonal
        for (int i = row-1, j = col+1; i>=0 && j < board.length;i--,j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char[][] board, int row){
        if (row == board.length){
//            printBoard(board);
            count++;
            return true;
        }

        //column loop
        for (int col = 0; col < board.length; col++){
            if (isSafe(board,row,col)){
                board[row][col] = 'Q';
                if (nQueens(board, row+1)){
                    return true;
                };
                board[row][col] = '.';
            }
        }
        return false;
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
        int n = 4;
        char[][] board = new char[n][n];

        //initialize
        for (int i = 0; i<n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        if (nQueens(board,0)){
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }

    }
}
