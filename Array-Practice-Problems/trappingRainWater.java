public class trappingRainWater {
    static int maxWater(int arr[],int n){
        int left=0;
        int right=n-1;
        int leftmax=0;
        int rightmax=0;
        int res=0;
        while (left<=right){
            if(arr[left]<=arr[right]){
                if(arr[left]>=leftmax){
                    leftmax=arr[left];
                }else {
                    res += leftmax - arr[left];
                }
                left++;
            }
            else {
                if(arr[right]>=rightmax){
                    rightmax=arr[right];
                }else {
                    res += rightmax - arr[right];
                }
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n=arr.length;
        System.out.println(maxWater(arr,n));
    }
}
