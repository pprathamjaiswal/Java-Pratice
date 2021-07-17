// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.math.BigDecimal;
// import java.util.Scanner;
import java.util.*;

// import jdk.internal.org.jline.utils.InputStreamReader;

// Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. 
// Let's test your knowledge of them!
// Given an array, s, of n real number strings, sort them in descending order - but wait, 
// there's more! Each number must be printed in the Exact same as it was read from stdin, 
// meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically
// equivalent values(e.g., .1=0.1), then they must be listed in the same order as they were recieved as input).
// 
// complete the code in the unlocked section of the editor below. You must rearrange array s's element 
// according to the indtruction above.

public class BigsDecimals{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s[] = new String[n+2];
        for(int i = 0; i<n; i++){
            s[i]=scan.next();
        }
        Comparator<String> myComparator = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                BigDecimal a = new BigDecimal(o1);
                BigDecimal b = new BigDecimal(o2);
                return b.compareTo(a);
            }
        };
        Arrays.sort(s, 0, n, myComparator);

        for(int i = 0; i<n; i++){
            System.out.println(s[i]);
        }
    }
}