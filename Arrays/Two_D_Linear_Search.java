package Aapna_College_DSA.Arrays;

import java.util.Scanner;

public class Two_D_Linear_Search {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Rows ");
        int rows = scr.nextInt();
        System.out.println("Enter Cols ");
        int cols = scr.nextInt();
        int number[][] = new int[rows][cols];


        // Input
        // Rows
        System.out.println("Enter the no of Arrays");
        for (int i = 0; i < rows; i++) {
            //  Columns
            for (int j = 0; j < cols; j++)
                number[i][j] = scr.nextInt();
        }


        System.out.println("Enter no for Searching");
        int x = scr.nextInt();


        //   Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (number[i][j] == x) {
                    System.out.println("x Found at Locations " + i + "," + j);
                }
            }
        }
    }
}


