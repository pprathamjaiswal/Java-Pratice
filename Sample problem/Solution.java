import java.util.*;

// write a program to accept a string that could have the greatest number of repeated letters in it.

public class Solution {
    static final int ASCII_SIZE = 256;
    static char getMaxNo(String str){
        int count[] = new int[ASCII_SIZE];
        int lengths = str.length();
        for(int i=0; i<lengths; i++)
            count [str.charAt(i)]++;
            int max = -1;
            char result = ' ';

            for(int i = 0; i<lengths; i++){
                if(max < count[str.charAt(i)]){
                    max=count[str.charAt(i)];
                    result =str.charAt(i);
                }
            }
            return result;
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("the greatest number of repeated letter is " + getMaxNo(str));
    }
}