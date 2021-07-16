class size_k{
    static boolean present(int n, int arr[], int k, int x)
    {
        int i;
        boolean b = false;
        for(i=0; i<n;i=i+k)
        {
            for(int j=0; j<k; j++)
            {
                if(i+j<n && arr[i+j]==x)
                   break;
                if(j == k)
                return false;
            if(i+j >= n)
                return false;
            }
        }
        if(i >=n)
           return true;
        else
            return b;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,999,333,10000};
        int x = 3, k =3;
        int n = arr.length;
        if(present(n, arr, k, x))
            System.out.println("yes");
        else
            System.out.println("NO");
    }
}