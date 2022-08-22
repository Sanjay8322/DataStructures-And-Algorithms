public class AsPerGFG {
    static long maxProduct(int[] arr, int n) {
        // Variables to store maximum and minimum
        // product till ith index.
        long minVal = arr[0];
        long maxVal = arr[0];

        long maxProduct = arr[0];

        for (int i = 1; i < n; i++) {

            // When multiplied by -ve number,
            // maxVal becomes minVal
            // and minVal becomes maxVal.
            if (arr[i] < 0) {
                long temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }

            // maxVal and minVal stores the
            // product of subarray ending at arr[i].
            maxVal = Math.max(arr[i], maxVal * arr[i]);
            minVal = Math.min(arr[i], minVal * arr[i]);

            // Max Product of array.
            maxProduct = Math.max(maxProduct, maxVal);
        }

        // Return maximum product found in array.
        return maxProduct;
    }

    public static void main(String[] args) {
        int arr[] ={2, 0, 4, 5, -1, 3};
        int n= arr.length;
        System.out.println(maxProduct(arr,n));
    }
}
