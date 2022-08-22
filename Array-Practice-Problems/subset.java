import java.util.HashSet;
import java.util.Set;

public class subset {
    static void subset(int arr1[], int arr2[],int n,int m){
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++)
            s.add(arr1[i]);
        int p = s.size();
        for(int i=0;i<m;i++)
            s.add(arr2[i]);
        if(s.size()==p)
            System.out.println("arr2 is subset of arr1");
        else
            System.out.println("arr2 is not a subset of arr1");
    }

    public static void main(String[] args) {
        int a1[] = {11, 1, 13, 21, 3, 7};
        int a2[] = {11, 3, 7, 1};
        int n =a1.length;
        int m =a2.length;
        subset(a1,a2,n,m);
    }
}
