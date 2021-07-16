import java.util.Scanner;

// // import java.io.BufferedReader;
// // import java.io.InputStreamReader;
// // import java.util.Scanner;
// // public class readInput {
// //     public static void main(String[] args)throws Exception{
// //         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// //         Scanner scan = new Scanner(System.in);
// //         String s = "Welcome to HackerRank's Java tutorials!";
// //         int i = 42;
// //         double d = 3.1415;
// //         i = scan.nextInt();
// //         s = scan.nextLine();
// //         d = scan.nextDouble();
        
// //         System.out.println("String: " + s);
// //         System.out.println("Integer: " + i);
// //         System.out.println("Double: " + d);
// //         System.out.println();
// //     }
// // }


// public class readInput{
//     class ReadInput{
//         public static int B, H;
//         static boolean flags = true;
//         static {
//             Scanner scan = new Scanner(System.in);
//             B = scan.nextInt();
//             H = scan.nextInt();
//             scan.close();
//             flags = (B > 0 && H > 0);
//             if(!flags){
//                 System.out.println("java.lang.Exception: Breadth and height must be positive");
//             }     
//         }
//     }
//     public static void main(String[] args) {
        
//     }
// }

public class readInput{
    public static void main(String[] args) {
        int N;
        Scanner scan = new Scanner(System.in);
        int array[] = new int[N];
        for(int i = 0; i<N; i++){
        array[i] = scan.nextInt();
    }
        System.out.println(array);
    }
}