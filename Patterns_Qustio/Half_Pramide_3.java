package Aapna_College_DSA.Patterns_Qustio;

public class Half_Pramide_3 {
    public static void main(String[] args) {
        for( int i=1;i<=4;i++){
            for( int j =1; j<=i;j++){
                System.out.print(" * " + j );
            }
            System.out.println("  ");
        }
    }
}
