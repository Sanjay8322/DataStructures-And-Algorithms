public class Program10 {
    public static void rotate(int[][]A , int n , int m){
        int row=0;
        int col=0;
        int prev;
        int curr;
        int lastRow=n;
        int lastCol=m;
        while(row<lastRow && col<lastCol){
            if(row+1==lastRow || col+1 ==lastCol) break;
            prev=A[row+1][col];
            for(int i = col;i<lastCol;i++){
                curr=A[row][i];
                A[row][i]= prev;
                prev=curr;
            }
            row++;
            for(int i=row;i<lastRow;i++){
                curr=A[i][lastCol-1];
                A[i][lastCol-1]=prev;
                prev=curr;
            }
            lastCol--;
            if(row<lastRow){
                for(int i =lastCol-1;i>=col;i--){
                    curr=A[lastRow-1][i];
                    A[lastRow-1][i]=prev;
                    prev=curr;
                }
            }
           lastRow--;
            if(col<lastCol){
                for(int i=lastRow-1;i>=row;i--){
                    curr=A[i][lastCol-1];
                    A[i][lastCol-1]=prev;
                    prev=curr;
                }
            }
            col++;

        }
    }

    public static void main(String[] args) {
        int[][]A ={ { 5, 6, 7, 8 },
                { 1, 2, 3, 4 },
                { 0, 15, 6, 5 },
                { 3, 1, 2, 12 } };
        int n=4;
        int m=4;
        rotate(A,4,4);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                System.out.print(A[i][j]+" ");
            System.out.print("\n");


        }
    }
}
