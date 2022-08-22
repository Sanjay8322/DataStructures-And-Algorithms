public class Kadane {
    static void maxSubArray(int arr[]){
        int n= arr.length;
        int sum=0;
        int max =arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = {-2,-1,3,4,-1,6};
        maxSubArray(arr);
    }
}
