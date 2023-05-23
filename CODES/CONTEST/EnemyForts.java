public class EnemyForts {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 0, 0, -1, 0, 0, 0, 0, 1};
        System.out.println(fort(arr));
    }

    static int fort(int[] arr){
        int ans = 0;
        int newAns = 0;
        int j = 1; //empty position
        int i = 0;
        int t = 0;
        int temp = Integer.MAX_VALUE;
        int noFort = -1;

        //if 1st position is zero or -1 return 0
        if(arr[0] == -1 || arr[0] == 0){
            return 0;
        }
        while (i < arr.length){
            if (arr[i] == 0) {
                    ans += 1;
            }
            if(arr[i] == -1){
                 temp = i;
                 break;
            }
            i++;
        }


        while ((arr[temp] != 1 || arr[temp] != -1 && temp < arr.length)){
            if(arr[temp] == 0){
                newAns += 1;
            }
            temp++;
        }


        return Integer.max(newAns, ans);
    }
}
