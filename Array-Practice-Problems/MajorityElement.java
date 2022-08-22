public class MajorityElement {
    static void majority(int arr[]){
        int n=arr.length;
        int maxCount=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count>maxCount){
                maxCount=count;
                index=i;
            }

        }
        if(maxCount> n/2){
            System.out.println("majority element is "+ arr[index]);
        }else
            System.out.println("no majority element");

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        majority(arr);
    }
}