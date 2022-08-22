public class MissingInteger {
    static void missingInt(int a[]){
        int len = a.length-1;
        int n= a.length;
        int total = (n)*(n+1)/2;
        for(int i=0;i<len;i++){
            total-=a[i];
        }
        System.out.println("missing number is "+total);
    }

    public static void main(String[] args) {
        int[]a= {1, 2, 4, 6, 3, 7, 8};
        missingInt(a);
    }
}
