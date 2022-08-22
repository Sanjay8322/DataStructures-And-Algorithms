import java.util.HashSet;

public class UnionIntersection {
    static void union(int []a , int n , int b[],int m){
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(a[i]);
        }
        for(int i=0;i<m;i++){
            h.add(b[i]);
        }
        System.out.println(h);

    }
    static void intersection(int []a ,int n,int b[],int m){
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(a[i]);
        }
        for(int i=0;i<m;i++){
            if(h.contains(b[i]))
                System.out.println(b[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = { 7, 1, 5, 2, 3, 6 };
        int b[] = { 3, 8, 6, 20, 7 };
        int n=a.length;
        int m=b.length;
        union(a,n,b,m);
        intersection(a,n,b,m);
    }
}
