public class MooresVoting {
    static void majority(int arr[]){
        int n=arr.length;
        int count=0;
        int element=0;
        for(int i=0;i<n;i++){
            if(count==0)
                element=arr[i];
            if(element==arr[i])
                count++;
            else
                count--;
        }
        System.out.println(element);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        majority(arr);
    }
}
