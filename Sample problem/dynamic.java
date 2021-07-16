//find largest number in an array using Dynamic Memory Allocation.

public class dynamic 
{
    static void findLargest(int arr[], int n)
    {
        for(int i = 0; i<n; i++)
        {
            if(arr[0] < (arr[i]))
            {
                arr[0] = (arr[i]);
            }
        }
        System.out.println(arr[0]);
    }
    public static void main(String[] args) {
        int n = 4;
        int arr[];
        arr = new int [n];

        if(arr.length < n)
        {
            System.out.println("no memory allocated");
        }
        arr[0] = 14;
        arr[1] = 21;
        arr[2] = 32;
        arr[3] = 40;
        findLargest(arr, n);
    }
}
