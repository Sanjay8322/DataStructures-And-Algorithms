import java.util.ArrayList;
import java.util.List;

public class MatrixSpiral {
    static void spiral(int arr[][] , int n ,int m){
        List<Integer> list = new ArrayList<>();
        int t=0;
        int d=n-1;
        int l=0;
        int r=m-1;
        int dir=0;
        while (t<=d && l<=r){
            if(dir==0){
                for(int i = t;i<=r;i++)
                    list.add(arr[t][i]);
                t++;
            }
            else if (dir==1){
                for(int i = t;i<=d;i++)
                    list.add(arr[i][r]);
                r--;
            }
            else if (dir==2){
                for(int i=r;i>=l;i--)
                    list.add(arr[d][i]);
                d--;
            }
            else if(dir==3){
                for(int i = d;i>=t;i--)
                    list.add(arr[i][l]);
                l++;
            }
            dir=(dir+1)%4;
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int a[][]={ { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int n = 4;
        int m=4;
        spiral(a,n,m);
    }
}
