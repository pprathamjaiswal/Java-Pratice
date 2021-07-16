import java.util.Arrays;

// import java.util.Scanner;

// public class Largest_Number{
//     public static void main(String[] args){
//         int n, max;
//         Scanner scan = new Scanner(System.in);
//         n = scan.nextInt();
//         int A[] = new int[n];
//         for(int i = 0; i<n; i++){
//             A[i] = scan.nextInt();
//         }
//         max = A[0];
//         for(int i = 0; i<n; i++){
//             if(max< A[i]){
//                 max = A[i];
//             }
//         }
//         System.out.println("Maximum value: " + max);
//     }
// }


class Largest_Number{
    static int largests(int arr[],int n){
        Arrays.sort(arr);
        return arr[n-1];
    }
    static public void main(String args[]){
        int arr[]={10,24,324,90};
        int n = arr.length;
        System.out.println(largests(arr,n));
    }
}