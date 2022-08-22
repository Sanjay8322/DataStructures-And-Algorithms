import java.util.Arrays;

public class WaveArray {
    static void swap(int arr[],int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void sort(int arr[]){
        int n= arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i+=2){
            swap(arr,i,i+1);
        }
        for(int nm : arr)
            System.out.println(nm);

    }

    public static void main(String[] args) {

        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        sort(arr);

    }
}
