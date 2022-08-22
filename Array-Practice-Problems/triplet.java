import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class triplet {
    static void tripletFind(int arr[],int targetSum){
        List<List<Integer>> l = new ArrayList<>();
        for (int i=0;i<arr.length-2;i++){
            int sum = targetSum-arr[i];
            int start = i+1;
            int end = arr.length-1;
            while (start<end){
                int t = arr[start]+arr[end];
                if(t==sum) {
                    l.add(Arrays.asList(arr[start], arr[end], arr[i]));
                    start++;
                    end--;
                }
                else if(t<sum)
                    start++;
                else
                    end--;
            }
        }
        System.out.println(l);

    }

    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 1, 6, 9};
        int target = 24;
        tripletFind(arr,target);

    }
}
