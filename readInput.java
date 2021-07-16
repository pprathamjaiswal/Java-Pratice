// How to read and print an Integer value in java.
import java.util.*;
public class readInput {
    public static void main(String[] args)throws Exception {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        number = scan.nextInt();
        System.out.println("Entered integer is: " + number);
    }
}
