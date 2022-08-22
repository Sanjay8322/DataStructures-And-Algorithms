public class LSA {
    static int lsa(int arr[],int n){
        int inc=1;
        int dec=1;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1])
                inc=dec+1;
            else if(arr[i]>arr[i-1])
                dec=inc+1;
        }
        return Math.max(dec,inc);
    }

    public static void main(String[] args) {

        int[] arr = { 10, 22, 9, 33, 49,
                50, 31, 60 };
        int n=arr.length;
        System.out.println(lsa(arr,n));
    }
}
