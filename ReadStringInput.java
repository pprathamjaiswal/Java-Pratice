// How to read and print string as a String in java.
import java.util.*;
public class ReadStringInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.println("Enter the Input");
        s = scan.next();
        System.out.println("Entered a Input is: " + s);
    }
}
