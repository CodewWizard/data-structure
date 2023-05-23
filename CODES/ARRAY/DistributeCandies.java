import java.util.HashSet;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candyType = new int[]{1, 1, 2, 2, 3, 3};
        System.out.println(candy(candyType));
    }

    public static int candy(int[] candyType){
        HashSet<Integer> set = new HashSet<>();

        for (int j : candyType) {
            set.add(j);
        }

        return Math.min(set.size(), candyType.length / 2);
    }
}
