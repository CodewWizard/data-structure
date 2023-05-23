import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public static void main(String[] args){
        int[] arr = {1, 0, -1, 0, -2, 2};
        int[] arr2 = {1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> ans = sum(arr,0);
        for (List<Integer> list :ans) {
            System.out.println(list);
        }
    }

    public static  List<List<Integer>> sum(int[] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        if(arr == null || arr.length == 0){
            return ans;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = target - arr[j] - arr[i];

                int front = j + 1;
                int back = arr.length - 1;

                while(front < back){
                    int temp2 = arr[front] + arr[back];

                    if(temp2 < temp) {
                        front++;
                    }
                    else if(temp2 > temp) {
                        back--;
                    }
                    else{
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[front]);
                        list.add(arr[back]);
                        ans.add(list);

                        //for avoiding duplications
                        while (front < back && arr[front] == list.get(2)){
                            ++front;
                        }

                        while (front < back && arr[back] == list.get(3)){
                            --back;
                        }
                    }

                    while(j + 1 < arr.length && arr[j + 1] == arr[j]){
                        ++j;
                    }
                }
                while(i + 1 < arr.length && arr[i + 1] == arr[i]){
                    ++i;
                }
            }
        }
        return ans;
    }
}
