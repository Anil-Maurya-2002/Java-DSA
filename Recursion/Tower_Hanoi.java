package Aapna_College_DSA.Recursion;

public class Tower_Hanoi {
    public static void towerOfHanoi( int n, String scr,String helper,String dest){
        if (n == 1){
            System.out.println("Transfer disk " + n + " from " + scr+ " to "+ dest);
            return;
        }
        towerOfHanoi(n-1,scr,dest,helper);
        System.out.println(" transfer disk "+n+ " from "+scr +" to "+dest);
        towerOfHanoi(n-1,helper,scr,dest);
    }
    public static void main(String[] args) {
        int n =4;
        towerOfHanoi(n,"S","H","D");
    }
}
