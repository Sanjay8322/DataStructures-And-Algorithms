import java.util.Arrays;

public class MaxMin {
    static void getMaxMin(int [] arr ,int n){
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n-1];
        System.out.println("min is "+ min);
        System.out.println("max is "+ max);
    }

    public static void main(String[] args) {
        int[]a = {3, 2, 1, 56, 10000, 167};
        int n = a.length;
        getMaxMin(a,n);
    }
}
