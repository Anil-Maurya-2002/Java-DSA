package Aapna_College_DSA.Patterns_Qustio;

public class Beter_Flay_10 {
    public static void main(String[] args) {
        // Upper half
        for (int i = 1; i <= 4; i++) {
            // 1st part
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // Spaces
            int spaces = 2 * (4 - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("   ");
            }
            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("   ");
        }


            // Lower half
            for (int i = 4; i >= 1; i--) {      // Only this line can chang
                // 1st part
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                // Spaces
                int space = 2 * (4 - i);
                for (int j = 1; j <= space; j++) {
                    System.out.print("   ");
                }
                // 2nd part
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println("   ");

            }
        }
    }


