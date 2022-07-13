//Polymorphism

class Emp {
    String empName;
    Long empId;

    void put_data(String name, Long id){
        System.out.println( "Employee Name : " + name);
        System.out.println( "Employee Id : " + id);
    }
}

class GET extends Emp{
    GET(){
        empName = "Vivek";
        empId = 274283l;
    }
}

class Manager extends Emp{
    Manager(){
        empName = "Tarun";
        empId = 274100l;
    }
}
class main {
    public static void main(String[] args) {

        System.out.println("===GET===");
        GET g = new GET();
        g.put_data(g.empName,g.empId);

        System.out.println("===Manager===");
        Manager m = new Manager();
        m.put_data(m.empName,m.empId);
    }
}