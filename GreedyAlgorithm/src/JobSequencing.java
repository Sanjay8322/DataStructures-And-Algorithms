import java.util.Arrays;

public class JobSequencing {
    public static void main(String[] args) {
        Job[] jobs=new Job[5];
        jobs[0]=new Job(1,2,100);
        jobs[1]=new Job(2,1,19);
        jobs[2]=new Job(3,2,27);
        jobs[3]=new Job(4,1,25);
        jobs[4]=new Job(5,1,15);
        System.out.println(maxProfit(jobs,5));

    }
    public static int maxProfit(Job[]jobs, int n){
        Arrays.sort(jobs,(a,b)->(b.profit-a.profit));
        int max=0;
        for(int i=0;i<n;i++){
            if(jobs[i].deadLine>max){
                max=jobs[i].deadLine;
            }
        }
        int arr[]=new int[max+1];
        Arrays.fill(arr,-1);
        int count=0;
        int profit=0;
        for(int i=0;i<n;i++){
            for(int j=jobs[i].deadLine;j>0;j--){
                if(arr[j]==-1){
                    arr[j]=i;
                    count++;
                    profit+=jobs[i].profit;
                    break;
                }
            }
        }
        return profit;
    }
}
class Job{
    int id;
    int deadLine;
    int profit;
    public Job(int id,int deadLine,int profit){
        this.id=id;
        this.deadLine=deadLine;
        this.profit=profit;
    }
}
