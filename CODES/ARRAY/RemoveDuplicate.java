public class RemoveDuplicate {
    public static void main(String[] args) {

        // given array of n element where each integer from 1 to n only
        int[] arr = new int[]{1, 3, 4, 2, 2};
        System.out.println(remove(arr));
    }

    public static int remove(int[] arr){
        int slow = arr[0];
        int fast = arr[1];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while (slow != fast);

        fast = arr[0];
        while (slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }
}
