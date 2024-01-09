package Aapna_College_DSA.Recursion.Advanced_Level;

public class Count_Total_Paths {
//    Count total paths in a maze to move from (0,0) to (n,m)
    public static int coumtPaths(int i,int j,int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // move Downwards
        int downPaths = coumtPaths(i + 1, j, n, m);
        // move Downwards
        int rightPaths = coumtPaths(i, j + 1, n, m);
        return downPaths + rightPaths;
    }


    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPaths = coumtPaths(0,0,n,m);
        System.out.println("Total Paths of 3*3 matr is " + totalPaths);
    }
    }
