package CS1;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class openfile {
    public static void main(String args[]) {
        try(Scanner integer = new Scanner(new File("integers.txt"))){
            while(integer.hasNextLine()){
                int x = integer.nextInt();
                System.out.println(x);
             }
        } catch (FileNotFoundException ex) {
                System.out.print("File not found");
                System.exit(0);
        } 
    }
}
