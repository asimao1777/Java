package CS1;
import java.util.*;


public class trycatch {
    public static void main(String[] args){
        try {
         Scanner input = new Scanner(System.in);
         System.out.println("Please insert integer x: ");
         int x = input.nextInt();
         System.out.println(" Please insert integer y: ");
         int y = input.nextInt();
         System.out.format("x modulus y is equal to %d%n", x%y); 
         input.close();

        } catch (InputMismatchException a){
            System.out.println("You need to input an integer");
            System.exit(0);
        }
    }
}
 