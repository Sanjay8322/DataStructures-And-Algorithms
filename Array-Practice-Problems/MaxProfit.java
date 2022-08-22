public class MaxProfit {
    static int max(int arr[],int n){
        int maxProfit=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int curr = arr[j]-arr[i];
                    if(curr>maxProfit){
                        maxProfit=curr;
                    }
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[]=      { 100, 180, 260, 310,
                40, 535, 695 };
        int n=arr.length;
        System.out.println(max(arr,n));
    }
}
