//T.C. => Exponential

package My_DSA_Journey.Backtracking.Grid_Ways;

public class count_Ways {
    public static int gridWays(int i, int j, int n, int m){
        //base case
        if (i == n-1 && j == m-1){ //targeted cell reaching condition
            return 1;
        } else if (i == n || j == m) { //crossing grid condition
            return 0;
        }

        int w1 = gridWays(i,j+1,n,m); //right
        int w2 = gridWays(i+1,j,n,m); //down

        return w1 + w2;
    }

    public static void main(String[] args){
        int n = 3, m = 3;
        int[][] grid = new int[n][m];
        System.out.println(gridWays(0,0, n, m));
    }
}
