public class StockSellBuy {
    static int maxProfit(int arr[]){
        int n=arr.length;
        int maxProfit =0;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if (arr[i]-min>maxProfit){
                maxProfit=arr[i]-min;
            }
        }return maxProfit;
    }

    public static void main(String[] args) {
        int arr[]=  { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println(maxProfit(arr));
    }
}
