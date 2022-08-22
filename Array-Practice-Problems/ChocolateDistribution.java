import java.util.Arrays;

public class ChocolateDistribution {
    static void choco(int arr[],int n,int x){
        Arrays.sort(arr);
        int min=arr[n-1];
        int diff;
        for(int i=0;i<=n-x;i++){
            diff=arr[i+x-1]-arr[i];
            if(diff<min)
                min=diff;
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arr[]= {3, 4, 1, 9, 56, 7, 9, 12};
        int n=arr.length;
        int x=5;
        choco(arr,n,x);
    }
}
