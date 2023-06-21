package HW3;

public class MyQueue {
    private final int SIZE = 3;
    private int[] queue = new int[SIZE];
    private int front = -1;
    private int rear = -1;


    // check if the queue is full
    public boolean isFull() {
        if(rear == SIZE - 1){
            return true;
        }
        return false;
    }

    // check if the queue is empty
    public boolean isEmpty() {
        if(front == -1){
            return true;
        }
        return false;
    }

    // insert elements to the queue
    public void enqueue(int element) {
        // first to check if the queue is full already
        if(isFull()) {
            System.out.println("Queue is already full, you can't insert an element " + element);
        } else {
            front = 0;
            rear++;
            queue[rear] = element;
            System.out.println("The element " + element + " was inserted into queue.");
            System.out.println("The queue consist of : " + queue.length + " elements");
        }
    }

    // delete element from the queue
    public int dequeue() {
        int element ;
        // first to check if the queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty, you can't delete an element.");
            return (-1);
        } else {
            //delete first element in queue
            element = queue[front];
            // If queue consists of only one element - return original values to front and rear
            if(rear == front) {
                front = -1;
                rear = -1;
            } else {
                // Last case with queue consisting of more than 1 element
                front++;
            }
            System.out.println("The element " + element + " was deleted from the queue");
            return element;
        }
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    @Override
    public String toString() {
        return "MyQueue{}";
    }

}
