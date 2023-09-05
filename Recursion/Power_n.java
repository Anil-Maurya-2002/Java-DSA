package Aapna_College_DSA.Recursion;

public class Power_n {

//    // Print x^n  ( stack height = n )            //  1 st
//    public static int calcPower(int x, int n) {
//
//        if (n == 0) {      // base case 1
//            return 1;
//        }
//        if (x == 0) {     // base case 2
//            return 0;
//        }
//
////        int xpown = x * calcPower(x, n - 1);
//
//
//        int xPownm1 = calcPower(x,n-1);  // kaam
//        int xPown = x * xPownm1;
//
//          return xPown;
//
//    }
//
//    public static void main(String[] args) {
//        int x =2;
//        int n =5;
//        int ans = calcPower(x,n);
//        System.out.println( "Power of x^n is " + ans);
//    }
//}


    // Print x^n ( stack height = n )          //  2 nd
    public static int calcPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        // If Power n is Even
        if (n % 2 == 0) {
            return calcPower(x,n/2) * calcPower(x,n/2) ;
        }
        // n is odd
        else {
            return calcPower(x,n/2) * calcPower(x,n/2) * x;
        }
    }

    public static void main(String[] args) {
        int x= 2, n= 4;
        int ans = calcPower(x,n);
        System.out.println("Valu of x^n is " + ans);
    }
}