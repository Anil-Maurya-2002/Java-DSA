package Aapna_College_DSA.Patterns_Qustio;

public class Primade_12 {
    public static void main(String[] args) {
        for( int i=1;i<=4;i++){
            // Spaces
            for( int j =1; j<=4-i;j++){
                System.out.print(" " );
            }
            // Numbers
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
                }
            System.out.println(" ");
        }
    }
}
