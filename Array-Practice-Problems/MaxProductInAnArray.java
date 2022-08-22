public class MaxProductInAnArray {
    static void MaxProduct(int arr[]){
        int max_ending = arr[0];
        int min_ending=arr[0];
        int max_soFar = arr[0];
        int n =arr.length;
        for(int i=1;i<n;i++){
            int temp = max_ending;
            max_ending=Integer.max(arr[i],Integer.max(arr[i]*max_ending,arr[i]*min_ending));
            min_ending=Integer.min(arr[i],Integer.min(arr[i]*temp,arr[i]*min_ending));
            max_soFar=Integer.max(max_soFar,max_ending);
        }
        System.out.println(max_soFar);
    }

    public static void main(String[] args) {
        int arr[]={ -6, 4, -5, 8, -10, 0, 8 };
        MaxProduct(arr);
    }

}
