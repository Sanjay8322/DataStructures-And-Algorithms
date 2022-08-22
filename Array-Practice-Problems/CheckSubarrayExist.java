import java.util.HashSet;
import java.util.Set;

public class CheckSubarrayExist {
    static boolean subArrayExist(int arr[]){
        Set<Integer> s = new HashSet<>();
        int sum=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]==0 || sum ==0 || s.contains(sum))
                return true;
            else
                s.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {

        int arr[] = { -3, 2, 3, 1, 6 };
        if(subArrayExist(arr)){
            System.out.println("Subarray found");
        }else
            System.out.println("Subarray not found");
    }
}