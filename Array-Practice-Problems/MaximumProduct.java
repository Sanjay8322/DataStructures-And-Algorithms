public class MaximumProduct {
    static void MaximumProduct(int arr[]){
        int max = arr[0];
        int product = 1;
        for(int i=0;i<arr.length;i++){
            product*=arr[i];
            if(product>max){
                max=product;
            }
            if(product==0){
                product=1;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[]= { 1, -2, -3, 0, 7, -8, -2 };
        MaximumProduct(arr);
    }
}
