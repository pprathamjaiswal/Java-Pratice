import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int reverse=0;
        while(N>0){
            int lastdigit = N%10;
            reverse = reverse*10 + lastdigit;
            N=N/10;
        }
        System.out.println(reverse);
    }
}
