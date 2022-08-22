import java.util.HashMap;

public class FirstNonRepeat {
    static void firstNonRepeat(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }else
                m.put(arr[i],1);
        }
        for(int i=0;i<n;i++){
            if(m.get(arr[i])==1){
                System.out.println("first non repeating element is "+arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 4, 9, 6, 7, 4 };
        int n = arr.length;
        firstNonRepeat(arr);
    }
}