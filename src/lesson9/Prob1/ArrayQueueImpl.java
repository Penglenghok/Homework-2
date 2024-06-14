package lesson9.Prob1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
    public void enqueue(int obj){
        //implement
        // in case add to empty array.
        if (front == -1){
            arr[++front] = obj;
            arr[rear] = obj;
            return;
        }

        if (rear == arr.length-1){
            resize();
        }
        arr[++rear] = obj;
    }
    public int dequeue() {
        if (isEmpty()) return -1;
        int deleted = arr[front];

        if (front == rear){
            arr[front] = 0;
            arr[rear] = 0;
            front--;
            rear = 0;

            return deleted;
        }

        System.arraycopy(arr, front + 1, arr, front, rear);
        arr[rear] = 0;
        rear--;
        return deleted;
    }
    public boolean isEmpty(){
        //implement
        return (front == -1);
    }
    public int size(){
        //implement
        return rear + 1;
    }
    private void resize(){
        //implement
        arr = Arrays.copyOf(arr, arr.length * 2);
    }

    public static void main(String[] args) {
        ArrayQueueImpl arr = new ArrayQueueImpl();
        arr.enqueue(1);
        arr.enqueue(2);
        arr.enqueue(3);
        arr.enqueue(4);
        arr.enqueue(5);
        arr.enqueue(6);
        arr.enqueue(7);
        arr.enqueue(8);
        arr.enqueue(9);
        arr.enqueue(10);
        arr.enqueue(10);
        arr.enqueue(10);
        arr.enqueue(10);
        arr.enqueue(10);

        arr.dequeue();
        arr.dequeue();
        arr.dequeue();

        System.out.println("Peek: " + arr.peek());
        System.out.println("Size: " + arr.size());
        System.out.println(Arrays.toString(arr.arr));
    }
}
