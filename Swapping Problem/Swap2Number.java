import java.util.*;
class Swap2Number{
    static void swapNumber(int A, int B){
        int Temp = A;
        A = B;
        B = Temp;
        System.out.println("Value of A is " + A + " and Value of B is " + B);
    }
    public static void main(String[] args)throws Exception {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        swapNumber(num1, num2);
    }
}