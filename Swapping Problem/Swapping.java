// Swapping the Values Without Using Third variable by using Sum and Differences Concepts of Maths.
import java.util.Scanner;
class Swapping {
    static void swapNumber(int num1, int num2){
        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;
        System.out.println("value of num1 is " + num1 + " and value of num2 " + num2);
    }
    public static void main(String[] args)throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        swapNumber(n, m);
    } 
}
