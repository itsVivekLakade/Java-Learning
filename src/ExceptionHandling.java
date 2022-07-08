public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            //arr[5] = 5;
            int a = 5/0;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Exception : " + ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("Exception : " + ex.getMessage());
        }
        finally {
            System.out.println("In Finally Block");
        }
    }
}
