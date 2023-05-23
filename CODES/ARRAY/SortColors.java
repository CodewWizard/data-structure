import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 1, 2, 0};
        sort(arr);
    }

    public static void sort(int[] a){
        int low = 0, mid = 0, high = a.length - 1, temp;
        while(mid <= high){
            if(a[mid] == 0){
                temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            else if(a[mid] == 2){
                temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
            else{
                mid++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
