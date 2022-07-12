import java.util.ArrayList;

@FunctionalInterface //It assures that interface should have only one method
interface abc{
    void add();
}
class A{
    @Deprecated //It informs user that it may be removed or update in the future versions. So, it is better not to use such methods.
    public void hello(){
        System.out.println("Hello, Vivek here");
    }
    public void show(){
        System.out.println("From A");
    }
}

class B extends A{
    @Override //It assures that the subclass method is overriding the parent class method
    @SuppressWarnings("Warnings Unchecked") //It is used to suppress warnings issued by the compiler
    public void show(){
        ArrayList a = new ArrayList();
        System.out.println("From B");
    }
}

class Annotations{
    public static void main(String[] args){
        B obj = new B();
        obj.show();
        obj.hello(); //deprecated
    }
}