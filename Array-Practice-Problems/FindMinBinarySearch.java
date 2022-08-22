public class FindMinBinarySearch {
    static int findMin (int arr[],int low ,int high){
        int mid=low+(high-low)/2;
        if(high==low)
            return arr[low];
        if(mid<high && arr[mid+1]<arr[mid])
            return arr[mid+1];
        if(mid>low && arr[mid]<arr[mid-1])
            return arr[mid];
        if(arr[high]>arr[mid])
            return findMin(arr,low,mid-1);
        return findMin(arr,mid+1,high);
    }

    public static void main(String[] args) {
        int arr[]={ 2, 3, 4, 5, 6, 7, 8, 1 };
        int n= arr.length;
        int min = findMin(arr,0,n-1);
        System.out.println(min);

    }
}
