public class isSubsetofArray {
    static boolean isSubset(int arr1[], int arr2[], int n , int m){
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr2[i]==arr1[j]){
                    break;
                }
                if(j==n)
                    return false;
        }
        }return true;

    }

    public static void main(String[] args) {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };

        int n = arr1.length;
        int m = arr2.length;
        System.out.println(isSubset(arr1, arr2,n,m));
    }
}