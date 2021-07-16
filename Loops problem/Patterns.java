import java.util.Scanner;

// public class Patterns {
    // cube pattern
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int n = scan.nextInt();
    //     for(int i = 0; i<n; i++){
    //         for(int j = 0; j<n; j++){
    //             System.out.print("* ");
    //         }
        
    //     System.out.println(" ");}
    // }



// Right triangle star pattern
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for(int i =0; i<n; i++){
//             for(int j = 0; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// left triangle pattern

// public class Patterns{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for(int i = 0; i<=n; i++){
//             for(int j =1*(n-i); j>=0; j--){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Patterns{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for(int i = 0; i<n; i++){
//             for(int j = n-i; j>1; j--){
//                 System.out.print(" ");
//             }
//             for(int j=0; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int space = 1;
//         space = n-1;
//         for(int j = 1; j<=n; j++)
//         {
//             for(int i = 1; i<=space; i++)
//             {
//                 System.out.print(" ");
//             }
//             space--;
//             for(int i=1; i <= 2 * j - 1; i++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//         space = 1;
//         for(int j=1;j<=n-1;j++)
//         {
//             for(int i= 1; i<=space; i++)
//             {
//                 System.out.print(" ");
//             }
//             space++;
//             for(int i = 1;i <= 2 * (n-j)-1;i++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }    



// public class Patterns{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int space = 1;
//         space = n-1;
//         for (int j = 1; j<n; j++){
//             for(int i = 1;i<=space; i++){
//                 System.out.print(" ");
//             }
//             space--;
//             for(int i = 1; i<= 2*j-1; i++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//         space = 1;
//         for(int j = 1; j<=n-1;j++){
//             for(int i = 1; i<=space; i++){
//                 System.out.print(" ");
//             }
//             space++;
//             for(int i=1; i<=2*(n-j)-1; i++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for(int i = n-1; i>=0; i--){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for(int i = 0; i<=n; i++){
//             for(int j = 1; j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k = 0; k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for(int i = 0; i<=n-1;i++){
//             for(int j = 1; j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(int k = 0; k<=n-1-i;k++){
//                 System.out.print("*" + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Patterns{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for(int i = n; i>=1; i--){
//             for(int j= n; j>=i; j--){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k<=i; k++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }



public class Patterns{
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        int n = scam.nextInt();
        for(int i = 0; i<=n-1; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for(int i = n-1; i>= 0; i--){
            for(int j = 0; j<=i-1; j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}

