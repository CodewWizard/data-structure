import java.util.*;

public class TwoStacks{
    int[] arr;
    int top1;
    int top2;
    int size;
    public static void main(String[] args) {
        TwoStacks t1 = new TwoStacks(3);
        t1.push1(2);
        t1.push1(3);
        t1.push1(4);
        System.out.println();
    }

    TwoStacks(int s){
        this.size = s;
        top1 = -1;
        top2 = s;
        arr = new int[s];
    }

    void push1(int num){
        if(top2 - top1 > 1){
            top1++;
            arr[top1] = num;
        }
    }

    void push2(int num){
        if(top2 - top1 > 1){
            top2--;
            arr[top2] = num;
        }
    }

    void pop1(int num){
        if(top1 >= 0){
            top1--;
        }
    }

    void pop2(int num){
        if(top2 < size){
            top2++;
        }
    }
}