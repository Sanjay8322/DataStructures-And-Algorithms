import java.util.HashSet;

public class FirstRepeatedElement {
    static void firstRepeatedElements(int arr[]){
        int min=-1;
        int n= arr.length;
        HashSet<Integer> s = new HashSet<>();
        for(int i=n-1;i>=0;i--){
            if(s.contains(arr[i])){
                min=i;

            }else{
                s.add(arr[i]);
            }

        }
        if(min!=-1){
            System.out.println("first element is "+arr[min]);
        }
        else System.out.println("not present");

    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        firstRepeatedElements(arr);
    }
}
