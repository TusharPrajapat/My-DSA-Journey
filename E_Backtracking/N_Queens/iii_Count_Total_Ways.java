package My_DSA_Journey.Backtracking.N_Queens;

public class iii_Count_Total_Ways {
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

    public static void nQueens(char[][] board, int row){
        if (row == board.length){
//            printBoard(board);
            count++;
            return;
        }

        //column loop
        for (int col = 0; col < board.length; col++){
            if (isSafe(board,row,col)){
                board[row][col] = 'Q';
                nQueens(board, row+1);
                board[row][col] = '.';
            }
        }
    }

//    public static void printBoard(char[][] board){
//        System.out.println("-------Chase Board-----");
//        for (int i = 0; i< board.length; i++){
//            for (int j = 0; j < board.length; j++){
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args){
        int n = 4;
        char[][] board = new char[n][n];

        //initialize n*n matrix
        for (int i = 0; i<n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        nQueens(board,0);
        System.out.println("Total Ways to solve "+ n + " queens is = "+count);
    }
}
