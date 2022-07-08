class Operator {
    public static void main(String[] args){
        //Operators

        System.out.println ("===Arithmetic Operator===");
        System.out.println ("1+2 = " + (1+2)); //addition
        System.out.println ("4-3 = " + (4-3)); //subtraction
        System.out.println ("3*5 = " + (3*5)); //multiply
        System.out.println ("3/2 = " + (3/2)); //division
        System.out.println ("10%3 = " + (10%3)); //mod

        System.out.println ("===Assignment Operator===");
        int a = 5;
        System.out.println ("a = " + a); //Assignment

        System.out.println ("===Relational Operator===");
        System.out.println ("1==1 = " + (1==1)); //equal
        System.out.println ("4!=3 = " + (4!=3)); //different
        System.out.println ("3<5 = " + (3<5)); //less than
        System.out.println ("3>2 = " + (3>2)); //greater than

        System.out.println ("===Logical Operator===");
        System.out.println ("true && true = " + (true && true));
        System.out.println ("!false = " + (!false));
        System.out.println ("true || false = " + (true || false));

        int x = 5;
        System.out.println ("===Conditional/Ternary Operator===");
        System.out.println (x < 10 ? "5 is less than 10" : "value is greater than 10");

        System.out.println ("===Operator Precedence===");
        int y = 3 + 6 / 2 * 3 - 1 + 2;
        System.out.println("3 + 6 / 2 * 3 - 1 + 2 = " +y);
    }
}
