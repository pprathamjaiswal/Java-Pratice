import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// A prime number is a natural number greater than 1 whose only positive divisors are 1 and itself.
//  For example, the first six prime numbers are 2, 3, 5, 7, 11, and 13.
//Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
public class PrimalityTest {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        br.close();
        boolean result;
        BigInteger bg = new BigInteger(n);
        result = bg.isProbablePrime(100);
        if(result == true){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }  
}

