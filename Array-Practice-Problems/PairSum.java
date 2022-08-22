public class PairSum {
    static void max(int arr[],int n,int x){
        int resl=0;
        int resr=0;
        int l=0;
        int r=n-1;
        int diff = Integer.MAX_VALUE;
        while (r>l){
            if(Math.abs(arr[l]+arr[r]-x)<diff){
                resl=l;
                resr=r;
                diff=Math.abs(arr[l]+arr[r]-x);
            }
            if(arr[l]+arr[r]>x)
                r--;
            else
                l++;
        }
        System.out.println(arr[resl]+" "+arr[resr]);
    }

    public static void main(String[] args) {
        int arr[]={10, 22, 28, 29, 30, 40};
        int n=arr.length;
        int x=54;
        max(arr,n,x);
    }
}
