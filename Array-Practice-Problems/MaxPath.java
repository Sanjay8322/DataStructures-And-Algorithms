public class MaxPath {
    static int max(int x,int y){
        return (x>y)?x:y;
    }
    static int maxPath(int a[] ,int b[], int n,int m){
        int sum1=0;
        int sum2=0;
        int result=0;
        int i=0;
        int j=0;
        while (i<n && j<m){
            if(a[i]<b[j]){
                sum1+=a[i];
                i++;
            }
            else if (a[i]>b[j]){
                sum2+=b[j];
                j++;
            }else{
                result+=max(sum1,sum2)+a[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }
        while (i<n){
            sum1+=a[i];
            i++;
        }
        while (j<m) {
            sum2+=b[j];
            j++;
        }
        result+=max(sum1,sum2);
        return result;
    }

    public static void main(String[] args) {
        int ar1[] = {2, 3, 7, 10, 12};
        int ar2[] = {1, 5, 7, 8};
        int n=ar1.length;
        int m=ar2.length;
        System.out.println(maxPath(ar1,ar2,n,m));
    }
}
