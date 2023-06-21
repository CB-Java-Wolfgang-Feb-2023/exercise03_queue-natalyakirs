package HW3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // create an object of Queue class
        MyQueue queue1 = new MyQueue();

        // try to delete element from the queue:currently queue is empty, so deletion is not possible
        queue1.dequeue();

        // insert elements to the queue
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);

        // check when queue is full
        queue1.enqueue(4);

        // removes element until it is empty
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();

        // check if queue is empty
        queue1.dequeue();

    }

}
