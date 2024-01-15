// package Exercise;

// import java.util.Scanner;

public class PercantagCalcuation {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st subj ");
        int a = input.nextInt();
        System.out.println("Enter 2st subj ");
        int b = input.nextInt();
        System.out.println("Enter 3st subj ");
        int c = input.nextInt();
        int per = ((a+b+c)*300)/100;
        System.out.println("Percantaje is % "+ per);
        
        
}
