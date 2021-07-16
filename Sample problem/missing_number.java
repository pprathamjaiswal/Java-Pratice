class missingnumbers{
    static int getMissingNo(int a[], int n){
        int total = 1;
        for(int i=2; i<=(n+1);i++){
            total += i;
            total -= a[i - 2];
        }
        return total;
    }
    public static void main(String[] args) {
        int arr[]= { 1, 2,  4, 5 };
        System.out.println(getMissingNo(arr, arr.length));
    }
}