package CODES.CONTEST.Weekly331;

public class TakeGiftsFromRichPiles {
    public static void main(String[] args) {
        int[] gifts = {1, 1, 1, 1};
        System.out.println(pickGifts(gifts, 4));
    }

    public static long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            int[] arr = getMax(gifts);
            double sqrt = Math.sqrt(arr[0]);
            gifts[arr[1]] = (int)sqrt;
        }

        long sum = 0;
        for (int i = 0; i < gifts.length; i++) {
            sum += gifts[i];
        }
        return sum;
    }

    private static int[] getMax(int[] gifts){
        int[] arr = new int[2];
        arr[0] = Integer.MIN_VALUE;
        for (int i = 0; i < gifts.length; i++) {
            if(gifts[i] > arr[0]){
                arr[0] = gifts[i];
                arr[1] = i;
            }
        }
        return arr;
    }
}
