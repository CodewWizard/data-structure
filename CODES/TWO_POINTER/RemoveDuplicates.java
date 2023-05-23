package CODES.TWO_POINTER;

public class RemoveDuplicates{
    public static void main(String a[]){
        int[] arr = new int[] {1, 1, 2, 2, 3, 3};
        System.out.println(remove(arr));
    }

    static int remove(int[] arr){
        if(arr.length == 0){
            return 0;
        }

        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
