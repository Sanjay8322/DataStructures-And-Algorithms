public class SumPairClosestToX {
    static void max(int arr[],int n,int x){
        int resi=0;
        int resj=0;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(arr[i]+arr[j]<x) {
                    if (Math.abs(arr[i] + arr[j] - x) < diff) {
                        resi = i;
                        resj = j;
                        diff = Math.abs(arr[i] + arr[j] - x);
                    }
                }
            }
        }
        System.out.println(arr[resi]+" "+arr[resj]);
    }

    public static void main(String[] args) {
        int arr[]={10,22,28,29,30,40};
        int n=arr.length;
        int x=54;
        max(arr,n,x);
    }
}
