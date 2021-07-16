import java.util.Scanner;

// public class Number_Pattern {
//     public static void main(String[] args) {
//         Scanner scam = new Scanner(System.in);
//         int n = scam.nextInt();
//         int number;
//         for(int i = 0; i<=n; i++){
//             number = 1;
//             for(int j = 0; j<=i; j++){
//                 System.out.print(number+ " ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }


// public class Number_Pattern{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int k = 1;
//         for(int i = 1; i<=8; i++){
//             for(int j = 1; j<i+1; j++){
//                 System.out.print(k++ + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// public class Number_Pattern{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i;j++){
//                 System.out.print(i+ " ");
//             }
//             System.err.println();
//         }
//     }
// }




// public class Number_Pattern{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for(int i = n; i>=1; i--){
//             for(int j = n; j>=i; j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// public class Number_Pattern{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for(int i = 1; i<=n; i++){
//             for(int j = i; j>=1; j--){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }



public class Number_Pattern{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            int num;
            if(i%2==0){
                num = 0;
                for(int j =1;j<=n; j++){
                    System.out.print(num);
                    num = (num == 0)? 1: 0;
                }
            }
            else{
                num = 1;
                for(int j = 1; j<=n; j++){
                    System.out.print(num);
                    num = (num==0)? 1:0;
                }
            }
            System.out.println();
        }
    }
}