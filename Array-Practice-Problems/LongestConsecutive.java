import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    static void lonConsecutive(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int longestStreak=0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum+1)){
                    currentNum+=1;
                    currentStreak+=1;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }

        }
        System.out.println(longestStreak);
    }

    public static void main(String[] args) {
        int arr[]={102,4,100,1,101,3,2};
        lonConsecutive(arr);
    }
}