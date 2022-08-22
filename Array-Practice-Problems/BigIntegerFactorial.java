import java.math.BigInteger;

public class BigIntegerFactorial {
    static void factorial(int n){
        BigInteger f = new BigInteger("1");
        for(int i=2;i<=n;i++ ){
            f=f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        int n=20;
        factorial(n);
    }
}
