package Aapna_College_DSA.Recursion;

public class Fibonacci_Sequence {
    public static void printfib(int a, int b, int n){     // 1 st
        if(n== 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfib(b,c,n-1);
    }
    public static void main(String args[]){
        int a = 0, b= 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printfib(a,b,n-2);
    }
}


//       public static int FibRecursion(int n) {   // 2 nd
//           if (n <= 1) {
//               return n ;
//           } else {
//               return FibRecursion(n-2 ) +  FibRecursion(n -1);
//           }
//       }
//    public static void main(String[] args) {
//           int n = 7;
//           int ans = FibRecursion(n);
//           System.out.println(ans);
//
//    }
//}
