// Writing a  program to Swap Two Number 
import java.util.*;
public class Swapeasy {
    public static void main(String[] args) {
        int a, b, Temp;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the Number Here:");
        a = scan.nextInt();
        b = scan.nextInt();
        Temp = a;
        a = b;
        b = Temp;
        System.out.println(a);
        System.out.println(b);
    }
}
