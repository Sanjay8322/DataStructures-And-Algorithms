import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        Item items[]=new Item[3];
        items[0]=new Item(60,10);
        items[1]=new Item(100,20);
        items[2]=new Item(120,30);
        System.out.println(maxValue(items,3,50));
    }

    public static double maxValue(Item items[],int n,int W){
        ItemComparator ic=new ItemComparator();
        Arrays.sort(items,ic);
        int currWeight=0;
        double finalValue=0.0;
        for(int i=0;i<n;i++){
            if(currWeight+items[i].weight<W){
                currWeight+=items[i].weight;
                finalValue+=(double)items[i].value; /// only value
            }
            else{
                int remain=W-currWeight;
                finalValue+=(double)remain*(double) items[i].value/(double) items[i].weight;
            }
        }
        return finalValue;
    }
}
class Item{
    int value;
    int weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class ItemComparator implements Comparator<Item> {
    public int compare(Item o1,Item o2){
        double r1=(double) o1.value/(double) o1.weight;
        double r2=(double) o2.value/(double) o2.weight;
        if(r1<r2){ //since we have to find maxValue descending order
            return 1;
        }
        else if(r1>r2){
            return -1;
        }
        return 0;
    }
}