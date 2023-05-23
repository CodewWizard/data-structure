import java.util.ArrayList;
import java.util.*;

public class ConsecutiveIntFromDataStream {
    int value;
    int k;
    int len =0;

    public static void main(String[] args) {
        ConsecutiveIntFromDataStream obj = new ConsecutiveIntFromDataStream(1, 2);
        System.out.println(obj.consec(1));
        System.out.println(obj.consec(2));
        System.out.println(obj.consec(1));
        System.out.println(obj.consec(1));
        System.out.println(obj.consec(1));

    }

    ConsecutiveIntFromDataStream(int value, int k){
        this.value = value;
        this.k = k;
        this.len = 0;
    }

    public boolean consec(int num) {
        if(value == num){
            len++;
        }
        else{
            len = 0;
        }

        if(len < k){
            return false;
        }
        return true;
    }

}
