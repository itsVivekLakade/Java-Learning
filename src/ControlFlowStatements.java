import java.util.Scanner;

public class ControlFlowStatements {
    public static void main(String[] args) {

        int a = 15;
        System.out.println("===If-Else Condition===");
        if (a < 10) {
            //If the condition is true print the following statement
            System.out.println("The value is less than 10");
        } else {
            //If the condition is false print the following statement
            System.out.println("15 is greater than 10");
        }

        int count = 0;
        System.out.println("===While Loop===");
        while(count<5) {
            System.out.println(count);
            count++;
        }

        count = 0;
        System.out.println("===Do-While Loop===");
        do{
            System.out.println(count);
            count++;
        }while(count<5);

        count = 0;
        System.out.println("===For Loop===");
        for(int i = 0;i<5;i++) {
            System.out.println(i);
        }

        System.out.println("===Switch Statement===");
        System.out.println("1. Addition\n2. Subtract\nEnter Option:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        switch(r){
            case 1:
                System.out.println("5+5 = "+ (5+5));
                break;
            case 2:
                System.out.println("5-5 = "+ (5-5));
                break;
            default:
                System.out.println("This is switch statement");
        }
    }
}
