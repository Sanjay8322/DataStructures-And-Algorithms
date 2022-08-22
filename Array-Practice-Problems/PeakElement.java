public class PeakElement {
    static int peakFind(int arr[] , int low , int high , int n){
        int mid = low+(high-low)/2;
        if((mid==0||arr[mid-1]<=arr[mid])&&(mid == n-1 || arr[mid+1]<=arr[mid])){
            return mid;
        }
        else if(mid>0 && arr[mid-1]>arr[mid]){
            return peakFind(arr,low,mid-1,n);
        }
        else
            return peakFind(arr,mid+1,high,n);
    }
    static int peak(int arr[],int n){
        return peakFind(arr,0,n-1,n);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        System.out.println(peak(arr,n));
    }
}
