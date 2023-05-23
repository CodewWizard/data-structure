package CODES.QUEUE.Questions;

class MyCircularDeque {
    int[] arr;
    int size;
    int rear;
    int front;

    public MyCircularDeque(int k) {
        size = k;
        front = -1;
        rear = -1;
        arr = new int[size];
    }


    // when we inserting from front, front getting back after inserting
    public boolean insertFront(int value) {

        // if queue is full
        if(isFull()){
            return false;
        }

        // if 1st element to be inserted
        if(isEmpty()){
            rear = front = 0;
        }

        // if front points to 1st element, take it to n - 1
        if(front == 0 && rear != size - 1){
            front = size - 1;
        }

        //normal insertion
        else{
            front--;
        }

        arr[front] = value;
        return true;
    }

    public boolean insertLast(int value) {

        // if queue is full
        if(isFull()){
            return false;
        }

        //if 1st element to be inserted
        if(isEmpty()){
            front = rear = 0;
        }

        //if rear at last position, to maintainn cyclic nature
        if(rear == size - 1 && front != 0){
            rear = 0;
        }

        //normal insertion
        else{
            rear++;
        }

        arr[rear] = value;
        return true;
    }

    public boolean deleteFront() {

        //if queue is empty
        if(isEmpty()){
            return false;
        }

        //if only one element is present in queue
        if(rear == front){
            rear = front = -1;
        }

        //if front points to last element, to maintain cyclic nature
        if(front == (size - 1)){
            front = 0;
        }

        // normal pop
        else{
            front++;
        }
        return true;
    }

    //when element is removing from back rear getting minus
    public boolean deleteLast() {
        // if queue is empty
        if(isEmpty()){
            return false;
        }

        //if only 1 element is present in queue
        if(front == rear){
            front = rear = -1;
        }

        //if rear points to 1st element, take it at size - 1, to maintain cyclic nature
        if(rear == 0){
            rear = size - 1;
        }

        //normal pop
        else{
            rear--;
        }
        return true;
    }

    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }

    public boolean isEmpty() {
        if(rear == -1 && front == -1){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if( (front == 0 && rear == size - 1) || (front != 0) && (rear == (front - 1) % (size - 1)) ){
            return true;
        }
        return false;
    }
}
