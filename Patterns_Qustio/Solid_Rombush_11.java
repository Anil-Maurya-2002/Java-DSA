package Aapna_College_DSA.Patterns_Qustio;

public class Solid_Rombush_11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("   ");
            }
            // Stars
            for (int j = 1; j <= 5; j++) {
                    System.out.print(" * ");
                }
                System.out.println(" ");
            }
        }
    }

