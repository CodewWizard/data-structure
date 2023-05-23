import java.util.Arrays;

class Job{
    int id, deadline, profit;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

public class JobSequencingProb extends Job{
    JobSequencingProb(int x, int y, int z) {
        super(x, y, z);
    }

    public static void main(String[] args) {
        Job[] obj;
        obj = new Job[4];
        obj[0] = new Job(1, 4, 20);
        obj[1] = new Job(2, 1, 10);
        obj[2] = new Job(3, 1, 40);
        obj[3] = new Job(4, 1, 30);

        System.out.println(Arrays.toString(JobScheduling(obj,obj.length)));
    }

    static int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr, (a, b)-> (b.profit - a.profit) );

        int max = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i].deadline > max){
                max = arr[i].deadline;
            }
        }

        int[] res = new int[max + 1];
        for (int i = 1; i <= max; i++) {
            res[i] = -1;
        }

        int cntJob = 0;
        int profit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) {
                //free slot
                if(res[j] == -1){
                    res[j] = i;
                    cntJob++;
                    profit += arr[i].profit;
                    break;
                }
            }
        }

        int[] ans = new int[2];
        ans[0] = cntJob;
        ans[1] = profit;
        return ans;
    }
}


