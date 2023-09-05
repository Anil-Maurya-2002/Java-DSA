package Aapna_College_DSA.Recursion;

public class Intro {

    // Print Numbers from 5 to 1
//    public static void printNumb(int n) {
//        if (n == 0) {
//            return;
//        }
//        System.out.println(n);
//        printNumb(n - 1);
//    }
//
//    public static void main(String[] args) {
//        int n= 5;
//        printNumb(n);
//    }
//}


// Print Numbers from 1 to 5

        public static void printNumb( int n){
            if(n==6){
                return;
             }
             System.out.println(n);
             printNumb(n+1);
          }

            public static void main(String[] args) {
            int n= -3;
            printNumb(n);
     }
}