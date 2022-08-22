public class DuplicateComplex {
    static void duplicate(int arr[],int n){
        for(int i=0;i<n;i++){
             int index = arr[i]%n;
             arr[index]+=n;
        }
        for(int i=0;i<n;i++){
            if((arr[i]/n)>=2)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int n= arr.length;
        duplicate(arr,n);
    }
}
