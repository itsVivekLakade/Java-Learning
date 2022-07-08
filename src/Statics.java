import static java.lang.Math.*;
class StaticDemo {
    static int objectCount=0;
    static int a;
    static int b;

    static {
        a=10;
        b=20;
    }
    StaticDemo()
    {
        objectCount++;
    }

    static void staticMethod(){
        System.out.println("Hello from Static Method");
        System.out.println("===Static Imports===");
        System.out.println("Square root of 25: "+sqrt(25));
    }

    public static void main(String[] args) {

        System.out.println("===Static block===");
        System.out.println("Value Of a: "+a);
        System.out.println("Value Of b: "+b);

        StaticDemo c1=new StaticDemo();
        StaticDemo c2=new StaticDemo();
        StaticDemo c3=new StaticDemo();

        System.out.println("Number of StaticDemo Objects: "+objectCount);

        StaticDemo.staticMethod();
    }

}