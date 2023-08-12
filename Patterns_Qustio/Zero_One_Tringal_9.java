package Aapna_College_DSA.Patterns_Qustio;

public class Zero_One_Tringal_9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
//                int sum = i+j;
                if ( (i+j)% 2 == 0) {
                    System.out.print(" 0 ");
                } else {
                    System.out.print(" 1 ");
                }
            }
                System.out.println("  ");
            }
        }
}
