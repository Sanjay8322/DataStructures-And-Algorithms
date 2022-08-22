public class RowsWithMax1 {
    static int  rows(int arr[][], int n, int m){
        int res;
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(arr[i][j]==1)
                    return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int n = arr.length;
        int m= arr.length;
        System.out.println(rows(arr,n,m));

    }
}
