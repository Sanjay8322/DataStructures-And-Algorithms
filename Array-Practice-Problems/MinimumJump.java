public class MinimumJump {
    static int minJump(int arr[]){
        if(arr.length<=1)
            return 0;
        int ladder=arr[0];
        int stairs=arr[0];
        int jump = 1;
        for(int i = 1; i<arr.length;i++){
            if(i==arr.length-1)
                return jump;
            if(i+arr[i]>ladder)
                ladder=i+arr[i];
            stairs--;
            if(stairs==0){
                jump++;
                stairs=ladder-i;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int arr[]={1,4,3,7,1,2,6,7,6,10};

        System.out.println(minJump(arr));
    }
}
