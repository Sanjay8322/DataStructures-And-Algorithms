public class MissRepeat {
    static void missAndRepeat(int arr[],int n){
        int temp[] = new int[n];
        int miss=0;
        int repeat=0;
        for(int i=0;i<n;i++){
            if(temp[arr[i]-1]==0)
                temp[arr[i]-1]=1;
            if(temp[arr[i]-1]==1)
                repeat=arr[i];
        }
        for(int i=0;i<n;i++){
            if(temp[i]==0)
                miss=i+1;
        }
        System.out.println(miss);
        System.out.println(repeat);
    }

    public static void main(String[] args) {
        int arr[] =  { 4, 3, 6, 2, 1, 1 };
        int n = arr.length;
        missAndRepeat(arr,n);
    }
}
