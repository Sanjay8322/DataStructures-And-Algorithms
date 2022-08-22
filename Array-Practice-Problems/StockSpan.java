import java.util.Stack;

public class StockSpan {
    static void span(int s[],int price[],int n){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        s[0]=1;
        for(int i = 1;i<n;i++){
            while (!st.empty() && price[st.peek()]<=price[i])
                st.pop();
            if(st.empty()){
                s[i]=i+1;
            }
            else
                s[i]=i-st.peek();
            st.push(i);

        }
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];
        span(S,price,n);
    }
}