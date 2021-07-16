package ArrayProblem;



class arrayRotation {
    //Function to left rotate arr[] pf size n by d*.
    void rotate(int arr[], int d, int n){
        for(int i = 0; i<d; i++)
        rotateOne(arr, n);
    }
    void rotateOne(int arr[], int n){
        int i, temp;
        temp = arr[0];
        for(i = 0;i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1]=temp;
    }
    // utility function to print to test above functions.
    void printArray(int arr[], int n){
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        arrayRotation rotate = new arrayRotation();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.rotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}
