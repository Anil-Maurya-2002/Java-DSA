package OOPs_Concept_8;

//import javax.print.attribute.standard.JobHoldUntil;
class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
    }
}

public class Class_With_Methods {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Anil = new Employee();
        Employee John = new Employee();

        Anil.id = 22;
        Anil.name = "maurya";
        John.id = 25;
        John.name = "Joginder";

        Anil.printDetails();
        John.printDetails();

    }
}
