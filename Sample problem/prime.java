import java.util.Scanner;
import java.lang.Math;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean flag = true;
        for(int i = 2; i<Math.sqrt(N); i++){
            if(N%i==0){
                System.out.println("Non-prime");
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("prime");
        }
        return;
    }
}


