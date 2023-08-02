package Aapna_College_DSA.Arrays;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int size = scr.nextInt();
        int number[] = new int[size];


        // Input
        System.out.println("Enter the no of Arrays");
        for (int i = 0; i < size; i++) {
//            System.out.println("Enter the no of Arrays");
            number[i] = scr.nextInt();
        }


        System.out.println("Enter no for Searching");
        int x = scr.nextInt();

        //   Output
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("x Found at index " + i);
            }
        }
    }
}
