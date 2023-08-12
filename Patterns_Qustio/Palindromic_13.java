package Aapna_College_DSA.Patterns_Qustio;

public class Palindromic_13 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            // Spaces
            for(int j=1; j<=5-i;j++){
                System.out.print("  ");
            }
            // 1st half
            for( int j=i; j>=1; j--){
                System.out.print(j + " ");
            }
           // 2nd half
           for( int j=2; j<=i; j++){
               System.out.print(j+ " ");
           }
            System.out.println(" ");
        }
    }
}
