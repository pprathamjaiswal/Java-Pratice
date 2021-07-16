public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1,-2, 3, 9, 4};
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int minimumIndex = i;
            for(int j = 0; j<n-1; j++){
                if(arr[j]<arr[minimumIndex]){
                    minimumIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = temp;
        }
        for(int item : arr){
            System.out.print(item+" ");
        }
    }
}
