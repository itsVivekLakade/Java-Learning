abstract class AbstractClass {
    String name;
    String address;

    abstract void display();
}

class ImpClass extends AbstractClass{

    @Override void display() {
        System.out.println( "Name = " + name);
        System.out.println( "Address = " + address);
    }

    public static void main(String[] args) {
        ImpClass i1 = new ImpClass();

        i1.name = "Vivek";
        i1.address = "Maharashtra";

        i1.display();
    }
}

