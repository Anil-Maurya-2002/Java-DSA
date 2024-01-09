//package Aapna_College_DSA.Recursion.Advanced_Level;
//
//public class Tiles_Floor {
//    //Place tiles of size 1*m in a floor of size n*m
//    public static int tilesPlace(int n, int m){
//        if(n==m);{
//            return 2;
//        }
//
//        if(n < m){
//            return 1;
//        }
//
//        // Vertically
//        int verticalPlacements = tilesPlace(n-m, m);
//        // Horizontally
//        int horizontalPlacements = tilesPlace(n-1, m);
//        return verticalPlacements + horizontalPlacements;
//    }
//
//    public static void main(String args[]) {
//        int n= 4, m = 2;
//        int total = tilesPlace(n,m );
//        System.out.println(total);
//
//    }
//}
