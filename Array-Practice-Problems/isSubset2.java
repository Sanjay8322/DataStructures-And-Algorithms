import java.util.Arrays;

public class isSubset2 {
    static boolean isSubset(int arr1[],int arr2[],int n,int m){
        int i =0;
        int j= 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (i<n && j<m){
            if(arr1[i]<arr2[j])
                i++;
            else if (arr1[i]==arr2[j]){
                i++;
                j++;
            }
            else if (arr1[i]>arr2[j])
                return false;
        }
        if (i==m)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a1[] = {11, 1, 13, 21, 3, 7};
        int a2[] = {11, 3, 7, 1};
        int n =a1.length;
        int m=a2.length;
        System.out.println(isSubset(a1,a2,n,m));
    }
}
