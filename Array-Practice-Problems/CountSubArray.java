import java.util.HashMap;

public class CountSubArray {
    static void countSubArrays(int arr[],int n){
        n = arr.length;
        int sum=0;
        int res=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                sum+=1;
            }
            else{
                sum-=1;
            }
            if(map.containsKey(sum)){
                res+=map.get(sum);
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[]={ 1, 0, 0, 1, 0, 1, 1 };
        int n= arr.length;
        countSubArrays(arr,n);
    }
}
