public class MaxSumConfiguration {
    static int max(int arr[]){
        int n =arr.length;
        int cumSum = 0;
        for(int i=0;i<n;i++)
            cumSum+=arr[i];
        int currVal=0;
        for(int i=0;i<n;i++)
            currVal+=i*arr[i];

        int res = currVal;
        for(int i=1;i<n;i++){
            int nextVal = currVal-cumSum + arr[i-1]*n;
            currVal=nextVal;
            res=Math.max(res,currVal);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 8,3,1,2};
        System.out.println(max(arr));
    }
}
