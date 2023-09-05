package Aapna_College_DSA.Recursion;

public class Sun_Numbers {
    public static void PrintSumNo( int i ,int n, int sum){
        if(i==n){
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum += i;
        PrintSumNo(i+1,n,sum);
        System.out.println(i);
    }
    public static void main(String args[]){

        PrintSumNo(1,5,0);
    }
}
