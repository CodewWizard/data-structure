package SORTING.CyclicSort;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {0,-10,1,3,-20};
//        System.out.println(findMissing(arr));
        int[][] trust = {{1,3},{1,4}, {2, 3}};
        System.out.println(findJudge(2, trust));
    }

    public static int findMissing(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                int temp =  arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        
        //for searching missing number
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1){
                return j + 1;
            }
        }
        return arr.length + 1;
    }

    public static int findJudge(int n, int[][] trust) {
        int[] freq = new int[n+1];
        for (int[] person: trust) {
            freq[person[0]]--;
            freq[person[1]]++;
        }
        for (int i = 1; i <= n; ++i) {
            if (freq[i] == n - 1) return i;
        }
        return -1;
    }
}
