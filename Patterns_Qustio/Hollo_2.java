package Aapna_College_DSA.Patterns_Qustio;

public class Hollo_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
}
