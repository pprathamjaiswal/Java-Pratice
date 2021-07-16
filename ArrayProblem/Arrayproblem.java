package ArrayProblem;
// Create an Array of size of 10 integer. 
//Take input from the user for these 10 elements and print the entire araay after that.
import java.util.*;
class Arrayproblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number you print: ");
        int n = scan.nextInt();
        int arr[] = new int[10];
        System.out.println("Enter the Number of array: ");
        for (int i = 0; i < n; i++) {

            arr[i] = scan.nextInt();
        }
        System.out.println("Array Number are: ");
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);
        }
    }
}