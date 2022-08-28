import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Nmeetings{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int n=start.length;
        System.out.println(maxMeeting(start,end,n));

    }

    public static int maxMeeting(int start[],int end[],int n){
        List<Meeting> meet=new ArrayList<>();
        for(int i=0;i<n;i++){
            meet.add(new Meeting(start[i],end[i],i));
        }
        MeetingComparator mc=new MeetingComparator();
        Collections.sort(meet,mc);
        List<Integer> ans=new ArrayList<>();
        ans.add(meet.get(0).pos);
        int limit=meet.get(0).end;
        for(int i=1;i<n;i++){
            if(meet.get(i).start>limit){
                ans.add(meet.get(i).pos);
                limit=meet.get(i).end;
            }
        }
        return ans.size();
    }
}
class Meeting{
    int start;
    int end;
    int pos;
    Meeting(int start,int end,int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}
class MeetingComparator implements Comparator<Meeting>{
    public int compare(Meeting m1,Meeting m2){
        if(m1.end<m2.end){
            return -1;
        }
        else if(m1.end>m2.end){
            return 1;
        }
        else if(m1.pos<m2.pos){
            return -1;
        }else {
            return 1;
        }
    }
}