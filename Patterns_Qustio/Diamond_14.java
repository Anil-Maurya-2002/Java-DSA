package Aapna_College_DSA.Patterns_Qustio;

public class Diamond_14 {
    public static void main(String[] args) {
        // Upper part
        for (int i = 1; i <= 4; i++) {
            // Spaces
            for (int j = 4; j >= i; j--) {
                System.out.print("   ");
            }
            // 1st half
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // 2nd half
            for (int j = 2; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

      // Lower part
        for (int i = 3; i >=1; i--) {   //  Only this line can change
            // Spaces
            for (int j = 4; j >= i; j--) {
                System.out.print("   ");
            }
            // 1st half
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // 2nd half
            for (int j = 2; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}

