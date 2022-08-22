import java.util.Arrays;

public class SmallestPositive {
    static int smallest(int arr[],int n){
        Arrays.sort(arr);
        int res=1;
        for(int i=0;i<n;i++){
            if(arr[i]>res)
                return res;
            else
                res+=arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1, 10, 3, 11, 6, 15};
        int n= arr.length;
        System.out.println(smallest(arr,n));
    }
}
