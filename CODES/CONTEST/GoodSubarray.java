public class GoodSubarray {
        public static void main(String[] args) {
                int[] arr = {3,1,4,3,2,2,4};
                System.out.println(count(arr, 2));
        }

        public static int count(int[] arr, int k){
                int j = 1;
                int count = 0;


                for (int i = 0; i < arr.length - 1; i++) {
                        if(arr[i] <= arr[j]){
                                count++;
                        }
                        j++;
                }
                return count;
        }
}
