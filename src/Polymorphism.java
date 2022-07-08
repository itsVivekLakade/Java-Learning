//Polymorphism

class Emp {
    String emp_name;
    Long emp_id;

    void put_data(String name, Long id){
        System.out.println( "Employee Name : " + name);
        System.out.println( "Employee Id : " + id);
    }
}

class GET extends Emp{
    GET(){
        emp_name = "Vivek";
        emp_id = 274283l;
    }
}

class Manager extends Emp{
    Manager(){
        emp_name = "Tarun";
        emp_id = 274100l;
    }
}
class main {
    public static void main(String[] args) {

        System.out.println("===GET===");
        GET g = new GET();
        g.put_data(g.emp_name,g.emp_id);

        System.out.println("===Manager===");
        Manager m = new Manager();
        m.put_data(m.emp_name,m.emp_id);
    }
}