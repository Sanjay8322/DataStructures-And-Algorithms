public class row1s {
    static  void row1s(int arr[][],int n,int m){
        int j = m-1;
//        while (j>=0 &&arr[0][j]==1){
//            j--;
//        }
        int row =0;
        for (int i = 0 ; i<n;i++){
            while (j>=0 && arr[i][j]==1){
                j--;
                row=i;
            }
        }
        System.out.println(row);
    }

    public static void main(String[] args) {
        int arr[][]={{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int n = arr.length;
        int m = arr.length;
        row1s(arr,n,m);

    }
}