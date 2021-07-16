// import java.util.*;
// public class Hourglass{
//     private static final Scanner scan = new Scanner(System.in);
//     public static void main(String[] args) {
//         int arr [][] = new int [6][6];
//         for(int i =0; i < 6; i++){
//             String[] arrRowItem = Scan.nextLine().split(" ");
//             scan.skip(null);

//             for(int j=0; j<6; j++){
//                 int arrItem = Integer.parseInt(arrRowItem[j]);
//                 arr[i][j]=arrItem;
//             }
//         }
//         int maxSum = Integer.MIN_VALUE;
//         for(int row = 0; row<4; row++){
//             for(int col =0; col<4; col++){
//                 int sum = arr[row][col]+arr[row][col+1]+arr[row][col+2]+
//                                         arr[row+1][col+1]
//                            arr[row+2][col]+arr[row+2][col+1]+arr[row+2][col+2];
//                 if(sum>maxSum){
//                     maxSum=sum;
//                 }           
//             }
//         }
//         System.out.println(maxSum);

//         scan.close();
//     }
// }


class GFG {
    static int row = 5;
    static int col = 5;

    static int MaxSum(int [][]arr)
    {
        if(row < 3 || col < 3)
           return -1;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < row-2; row++)
        {
            for(int j = 0; j < col-2; col++)
            {
                int sum = (arr[i][j]+arr[i][j+1]+arr[i][j+2])+
                                        (arr[i+1][j+1])+
                          (arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
                
                
                max_sum = Math.max(max_sum,sum);
            }
        }
        return max_sum;
    }
    public static void main(String[] args)throws Exception {
        int arr[][]={{1,2,3,0,0},
                     {0,0,0,0,0},
                     {2,1,4,0,0},
                     {0,0,0,0,0},
                     {1,2,0,1,0}};
        int res = MaxSum(arr);
        if(res == -1)
           System.out.println("Not possible");
        else
            System.out.println("Maximum sum of hour glass = " + res);
    }
}