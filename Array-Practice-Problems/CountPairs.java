public class CountPairs {
    static void countPairs(int a[] ,int n ,int k){
        int count=0;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(a[i]+a[j]==k)
                    count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        int[] a= { 1, 5, 7, -1, 5 };
        int k= 6;
        int n = a.length;
        countPairs(a,n,k);
    }
}