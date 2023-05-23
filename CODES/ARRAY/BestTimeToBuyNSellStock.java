public class BestTimeToBuyNSellStock {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 3, 4, 6, 2};
        System.out.println(buyNSell(arr));
    }

    public static int buyNSell(int[] arr){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }
            else if(arr[i] - minPrice > maxProfit){
                maxProfit = arr[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
