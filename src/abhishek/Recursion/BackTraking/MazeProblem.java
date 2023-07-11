package abhishek.Recursion.BackTraking;

public class MazeProblem {
    public static void main(String[] args) {
   boolean[][] m = new boolean[3][3];
   possiblePath(m,0,0,m.length,"");

    }
    public static void possiblePath(boolean[][]m , int i, int j, int n,String path) {
    //base condition
        if(i == n-1 && j == n-1) {
            System.out.println(path);
            return;
        }

        if(i < 0 || j < 0 || j >= n || i >= n || m[i][j]) return;
        //mark cell as visited
        m[i][j] = true;

        //let's take left path
        possiblePath(m,i,j-1,n,path + 'l');
        //right path
        possiblePath(m,i,j+1,n,path +'r');
        //top path
        possiblePath(m,i-1,j,n,path + 'u');
        //down
        possiblePath(m,i+1,j,n,path + 'd');

      //backtrack
        m[i][j] = false;
    }
}
