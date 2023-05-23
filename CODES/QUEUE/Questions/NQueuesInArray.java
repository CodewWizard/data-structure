package CODES.QUEUE.Questions;

public class NQueuesInArray {

    int n;
    int k;
    int[] front;
    int[] rear;
    int[] next;
    int free;
    int[] ans;

    NQueuesInArray(int n, int k){
        this.n = n;
        this.k = k;
        front = new int[k];
        rear =new int[k];
        next = new int[n];
        ans = new int[n];
        free = 0;
        for (int i = 0; i < k; i++) {
            front[i] = -1;
            rear[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            next[i] = i + 1;
        }
        next[n - 1] = -1;
    }

    void enQue(int data, int qn){
        //if que is full
        if(free == -1){
            System.out.println("Queue is full");
            return;
        }

        //find free index
        int index = free;

        //update free
        free = next[index];

        //if the 1st element to be added
        if(front[qn - 1] == -1){
            front[qn - 1] = index;
        }
        else{
            // link new element to the previous element
            next[rear[qn - 1]] = index;
        }

        //update next
        next[index] = -1;

        //update rear
        rear[qn - 1] = index;

        //element push
        ans[index] = data;
    }

    int deQue(int qn){
        // if queue is empty
        if(front[qn - 1] == -1){
            System.out.println("Queue is empty");
            return -1;
        }

        // find index to pop
        int index = front[qn - 1];

        //increment the front
        front[qn - 1] = next[index];

        //manage freeslots
        next[index] = free;
        free = index;
        return ans[index];
    }

    public static void main(String[] args) {
        NQueuesInArray que = new NQueuesInArray(7,3);
        que.enQue(10,1);
        que.enQue(15,1);
        que.enQue(20,1);
        que.enQue(25,2);
        System.out.println(que.deQue(1));
        System.out.println(que.deQue(2));
        System.out.println(que.deQue(2));
    }
}
