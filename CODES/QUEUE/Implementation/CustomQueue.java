package CODES.QUEUE.Implementation;

public class CustomQueue{
    int front;
    int rear;
    int size;
    int[] arr;

    public CustomQueue(int n){
        size = n;
        rear = -1;
        front = -1;
        arr = new int[size];
    }

    public CustomQueue(){
        this(10);
    }

    public boolean isFull(){

        //if rear points at last element that is size - 1 then queue is full
        return rear == size - 1;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public boolean insert(int val){
        if(isFull()){
            return false;
        }

        //normal insertion
        rear++;
        arr[rear] = val;
        return true;
    }

    public int remove(){
        if(isEmpty()) {
            return -1;
        }
        front++;
        return arr[front];
    }
}