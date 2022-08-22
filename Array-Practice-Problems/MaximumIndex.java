public class MaximumIndex {
    static int maxIndex(int arr[],int n){
        int maxDiff = -1;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(arr[i]<=arr[j]&& j-i > maxDiff)
                    maxDiff=j-i;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 2, 3, 4, 5, 6, 7, 8, 18, 0 };
        int n = arr.length;
        System.out.println(maxIndex(arr,n));
    }
}