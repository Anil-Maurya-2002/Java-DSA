package Aapna_College_DSA.Recursion;

public class Factorial {
    public static int  calcfactorial(int n){
        if (n==1 || n == 0){
            return 1;
        }
        int fact_nm1 = calcfactorial(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = calcfactorial(n);
        System.out.println("Factorial of n is " + ans);
    }
}

// Time comp O(n)  or
// Length of string


//    public static void PrintFact(int i, int n, int fac) {
//        if (n == i) {
//            fac = fac * (fac - i);
//            System.out.println(fac);
//            return;
//        }
//        fac = fac * (fac - i);
//        PrintFact(i+1,n,fac);
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        PrintFact(1,5,1);
//        System.out.println();
//    }
//}
