public class sort012 {
    public static void print(int[]arr ,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
    public static void sort(int [] arr , int n){
        int count0 =0;
        int count1 =0;
        int count2 =0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                count0++;
            if(arr[i]==1)
                count1++;
            if(arr[i]==2)
                count2++;
        }
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<(count0+count1);i++) {
            arr[i] = 1;
        }
        for (int i= count0+count1;i<n;i++){
            arr[i]=2;
        }
        print(arr,n);


    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1,
                2, 0, 0, 0, 1 };
        int n = 12;
        sort(arr,n);

    }
}
