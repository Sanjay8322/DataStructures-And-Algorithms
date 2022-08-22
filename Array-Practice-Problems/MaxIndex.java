public class MaxIndex {
    static int maxIndex(int arr[],int n){
        int index=-1;
        for(int i=0;i<n;i++){
            int j = n-1;
            while (i<j){
                int max;
                if(arr[i]<=arr[j] && i<=j){
                    max=j=i;
                    index=Math.max(max,index);
                    break;
                }
                j--;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[]={34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n= arr.length;
        System.out.println(maxIndex(arr,n));
    }
}
