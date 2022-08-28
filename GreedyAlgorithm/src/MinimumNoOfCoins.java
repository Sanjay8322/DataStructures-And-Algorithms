import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNoOfCoins {

    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,500,1000};
        int V=49;
        minCoins(coins,V);
    }

    public static void minCoins(int coins[], int V){
        Arrays.sort(coins);
        List<Integer> list=new ArrayList<>();
        for(int i=coins.length-1;i>=0;i--){
            while (V>=coins[i]){
                V-=coins[i];
                list.add(coins[i]);
            }
        }
        for(Integer i:list){
            System.out.print(i+" ");
        }
    }
}
