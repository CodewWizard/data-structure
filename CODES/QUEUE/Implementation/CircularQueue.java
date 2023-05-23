package CODES.QUEUE.Implementation;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int rear = -1;
    protected int front = 0;
    private int size= 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return (rear == data.length - 1 && front == 0 || (rear == (front - 1) % (size - 1)));
    }

    public boolean isEmpty(){
        return (front == 0 && rear == -1);
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        rear++;
        rear = rear % data.length;
        data[rear] = item;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[front];
        front = front % data.length;
        size--;
        front++;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        return data[front];
    }

    public void display() throws Exception{
        if(isEmpty()){
//            throw new Exception("Queue is empty");
            System.out.println("queue empty");
        }

        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %=  data.length;
        }while (i != rear);
        System.out.print("END");
    }
}
