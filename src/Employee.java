//Oop Concepts
public class Employee {
    final String compName = "Elektrobit";
    String empName;
    Long empId;
    static String team = "COS";

    Employee(){
        this.empName = "Vivek";
        this.empId = 274183l;
    }
    void printData(){
        System.out.println( "Company Name: "+compName);
        System.out.println( "Employee Name: "+empName);
        System.out.println( "Employee Id: "+empId);
    }

    static void printTeam(){
        System.out.println("===Static Method Invoked===");
        System.out.println("Static Variable - Team: "+team);
    }

    void Finalize(){
        System.out.println("cleaned");
    }

    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.printData();
        printTeam(); // static method don't need object for calling
        System.gc(); // Garbage Collection
    }
}
