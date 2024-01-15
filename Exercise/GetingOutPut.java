import java.util.Scanner;

// package CodeWithHarry;
// import jova.util.Scanner;

public class GetingOutPut {
        public static void main(String[] args){
                System.out.println("Takinh Input From the user");
                Scanner scr = new Scanner(System.in);
                System.out.println("Enter 1 st no.");
                int a = scr.nextInt();
                System.out.println("Enter 2 nd no.");
                int b = scr.nextInt();
                int sum = a+ b;
                float diff = a- b;
                System.out.println("The sum is " + sum);
                System.out.println("The Different is " + diff);

                boolean b1 = scr.hasNextInt();
                boolean b2 = scr.hasNextDouble();
                System.out.println("b1 "+ b1);
                System.out.println("b2 "+b2);
        }
        
}
