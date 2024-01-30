package OOPs_Concept_8;

    class Employees {
        int id;
        String name;
}
public class Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Anil = new Employee();

        Anil.id = 7;
        Anil.name ="Anil maurya";

        System.out.println( Anil.id);
        System.out.println(Anil.name);

    }

}
