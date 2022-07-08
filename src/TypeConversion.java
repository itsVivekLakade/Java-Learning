public class TypeConversion {
    public static void main(String[] args)
    {
        // implicit type conversion
        int i = 100;

        long l = i;
        float f = l;

        // Print and display commands
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);

        // explicit type conversion
        double d = 100.04;

        long l1 = (long)d;
        int i1 = (int)l;

        System.out.println("Double value " + d);
        System.out.println("Long value " + l1);
        System.out.println("Int value " + i1);
    }
}
