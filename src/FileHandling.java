import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileDemo {
    public static void main(String[] args) throws IOException {

        try {
            //Creating File
            File f = new File("Demo.txt");
            System.out.println("File Created: "+f);

            //Writing File
            System.out.println("Writing File Content...");
            FileWriter fw = new FileWriter(f);
            fw.write("Hello, I'm Vivek");
            fw.close();

            //Reading File
            System.out.println("File Content:");
            Scanner s = new Scanner(f);
            while (s.hasNext()){
                System.out.print(s.next()+" ");
            }
            s.close();

            //Deleting File
            if(f.delete()){
                System.out.println("\nFile Deleted");
            }

        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
