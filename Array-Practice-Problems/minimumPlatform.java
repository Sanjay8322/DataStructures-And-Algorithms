import java.util.Arrays;

public class minimumPlatform {
    static int findPlat(int arr[],int dep[],int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platNeeded =1,res=1;
        int i=1,j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                platNeeded++;
                i++;
            }
            else if (arr[i]>dep[j]){
                platNeeded--;
                j++;
            }
            if(platNeeded>res){
                res=platNeeded;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={120,50,550,200,700,850};
        int dep[]={600,550,700,500,900,1000};
        int n=arr.length;
        int min = findPlat(arr,dep,n);
        System.out.println(min);
    }
}